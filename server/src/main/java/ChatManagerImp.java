import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

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
    @Override
    public void subscribe(String hostname, CallbackPrx callback, Current current) {
        this.callbackPrx = callback;
        clients.add(new Client(hostname, callback));
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
            
            if (!hostnames.contains(host)) {hostnames.add(host);} //This line adds the client hostname to the list of hostnames
            
            //------------------Validations for the message------------------
            String listClients = "list clients";
            String sendTo = "to";
            String broadcast = "BC";

            if (msg.split(":")[1].startsWith(listClients)) {
                toListHosts(callbackPrx);
            }
            else if (msg.split(":")[1].startsWith(sendTo)) {
                sendMessageTo(msg, host);
            }
            else if(msg.split(":")[1].startsWith(broadcast)) {
                broadcast(msg);
            }
            //----------------------------------------------------------------
            int pos = 0;
            try {
                pos = Integer.valueOf(msg.split(":")[1]);
            } catch (Exception e) {
                System.out.println(msg); //When the message is not a number this prints the same line
            }
            for (int i = 1; i<=pos; i++) {
                System.out.println(host + ":" + fibonacci(i, host, current));
            }
            System.out.println("-------------------");
            callbackPrx.printResultFibo(Long.toString(fibonacci(pos, host, current)));
        }).start();
    }

    //------------------------Fibonacci's Logic--------------------------
    @Override
    public long fibonacci(int pos, String host, Current current) {
        if (pos < 2) return pos;
        return fibonacci(pos - 1, host, current) + fibonacci(pos - 2, host, current);
    }
    //-------------------------------------------------------------------

    public void toListHosts(CallbackPrx callbackPrx) {
        String hostsList = "";
        for (String host : hostnames) {
            hostsList += host + "\n";
        }
        callbackPrx.printHostnamesList(hostsList);
    }

    public void broadcast(String msg) {
        for (Client client : clients) {
            client.getCallbackPrx().printMessage(msg);
        }
    }

    public void sendMessageTo(String msg, String hostname) {
        for (Client client : clients) {
            if (client.getHostname().equals(hostname)) {
                client.getCallbackPrx().printMessage(msg);
            }
            else {
                System.out.println("Client not found");
            }
        }
    }
}