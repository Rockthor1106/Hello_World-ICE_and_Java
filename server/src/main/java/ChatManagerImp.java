import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import javax.security.auth.callback.Callback;

import com.zeroc.Ice.Current;

import Demo.CallbackPrx;
import model.Client;

public class ChatManagerImp implements Demo.ChatManager {

    private List<String> messages;
    // Semaphore mSemaphore = new Semaphore(1);
    private CallbackPrx callbackPrx;

    private List<String> hostnames;
    private List<Client> clients;
    
    ChatManagerImp() {
        messages = new ArrayList<>();
        hostnames = new ArrayList<>();
        clients = new ArrayList<>();
    }

    //This method is to register a client in the server 
    //It is important to notice that the clientIdentifier comes from the remove address of the client which is unique for each client
    @Override
    public void subscribe(String hostname, CallbackPrx callback, Current current) {
        String clientIdentifier = current.con.toString().split(":")[2];
        this.callbackPrx = callback;
        clients.add(new Client(hostname, callback, clientIdentifier));
        //-----------------Help message for the client-----------------
        String helpMsg = "***********Help section**********\n" +
        "1. To send a message to a specific client use the following format: to <hostname>:<message>\n"+
        "2. To send a broadcast message use the following format: BC <message>\n"+
        "3. To get the list of hostnames use the following format: list clients\n"+
        "4. To get the fibonacci serie use the following format: <number>\n"+
        "5. To exit the program use the following format: exit\n"+
        "***********************************";
        callbackPrx.printMessage(helpMsg);
        //-------------------------------------------------------------
    }

    @Override
    public String[] getState(Current current) {
        //System.out.println("GetState");
        String[] state = new String[messages.size()];
        for (int i = 0; i < state.length; i++) {
            state[i] = messages.get(i);
        }
        return state;
    }

    @Override
    public void sendMessage(String msg, Current current) {
        new Thread(() -> {
            String host = msg.split(":")[0]; //This line gets the hostname form the message sent by the client

            if (msg.split(":").length < 2)  {
                sendMessageTo("Empty message", host);
            } 
            else {
                String message = msg.split(":")[1]; //This line gets the message sent by the client
                String clientIdentifier = current.con.toString().split(":")[2]; //This line gets the client identifier from the client who uses this method

                if (!hostnames.contains(host)) {hostnames.add(host);} //This line adds the client hostname to the list of hostnames
                
                //------------------Validations for the message------------------
                String listClients = "list clients";
                String sendTo = "to";
                String broadcast = "BC";

                if (message.startsWith(listClients)) {
                    toListHosts(host, clientIdentifier);
                }
                else if (message.startsWith(sendTo)) {
                    //Here there is something particular: The message has two ":" so we need to send as parameter the part at index 2
                    String receiverHost = msg.split(":")[1].trim().substring(3, msg.split(":")[1].trim().length());
                    sendMessageTo(msg.split(":")[2].trim(), receiverHost);
                }
                else if(message.startsWith(broadcast)) {
                    broadcast(host, message.substring(2, message.length()).trim());
                }
                else {
                    int pos = 0;
                    try {
                        pos = Integer.valueOf(message);
                    } catch (Exception e) {
                        System.out.println(msg); //When the message is not a number this prints the same line
                    }
                    sendFibonacciTo((fibonacci(pos, host, current)), host, clientIdentifier);
                    System.out.println("-------------------");
                }
                //----------------------------------------------------------------
            }
        }).start();
    }

    //------------------------Fibonacci's Logic--------------------------
    public String fibonacci(int pos, String host, com.zeroc.Ice.Current current) {
        if (pos < 0) {
            return "Fibonacci starts at 1 position";
        }
        else {
            BigInteger[] fibo = new BigInteger[pos + 1];
            
        
            fibo[0] = BigInteger.ZERO;
            fibo[1] = BigInteger.ONE;
            for (int i = 2; i <= pos; i++) {
                fibo[i] = fibo[i - 1].add(fibo[i - 2]);
                
                System.out.println(fibo[i - 1].add(fibo[i - 2]));
            }
            BigInteger requestedPos = fibo[pos];
            return requestedPos.toString();
        }
	    
    }
    //-------------------------------------------------------------------

    public void toListHosts(String hostname, String clientIdentifier) {
        String hostsList = "";
        for (String host : hostnames) {
            hostsList += host + "\n";
        }

        for (Client client : clients) {
            if (client.getHostname().equals(hostname) && client.getClientIdentifier().equals(clientIdentifier)) {
                client.getCallbackPrx().printHostnamesList(hostsList);
            }
        }
    }

    public void broadcast(String hostCommunicator, String msg) {
        for (Client client : clients) {
            client.getCallbackPrx().printMessage(hostCommunicator + ": " + msg);
        }
    }

    //This methods allows the client to send a message to a specific client by its hostname
    //It is important to notice that if there are more than one client with the same hostname, the message will be sent to all of them
    public void sendMessageTo(String msg, String hostname) {
        for (Client client : clients) {
            if (client.getHostname().equals(hostname)) {
                client.getCallbackPrx().printMessage(msg);
            }
        }
    }

    public void sendFibonacciTo(String msg, String hostname, String clientIdentifier) {
        for (Client client : clients) {
            if (client.getHostname().equals(hostname) && client.getClientIdentifier().equals(clientIdentifier)) {
                client.getCallbackPrx().printResultFibo(msg);
            }
        }
    }


}