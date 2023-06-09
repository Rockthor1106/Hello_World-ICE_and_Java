import java.net.Inet4Address;
import java.util.Scanner;

import com.zeroc.Ice.ObjectAdapter;
import com.zeroc.Ice.ObjectPrx;
import com.zeroc.Ice.Util;

import Demo.CallbackPrx;

public class Client
{
    public static void main(String[] args)
    {
        try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args, "client.cfg"))
        {

            Demo.ChatManagerPrx chatManagerPrx = Demo.ChatManagerPrx
                    .checkedCast(communicator.propertyToProxy("ChatManager.Proxy"));

            Scanner sc = new Scanner(System.in);

            try {

                CallbackImp callbackImp = new CallbackImp(chatManagerPrx);
                ObjectAdapter adapter = communicator.createObjectAdapter("Callback");
                ObjectPrx objectPrx = objectPrx = adapter.add(callbackImp, Util.stringToIdentity("Callback"));
                adapter.activate();        
                
                CallbackPrx prx = CallbackPrx.uncheckedCast(objectPrx);
                String hostname = Inet4Address.getLocalHost().getHostName();

                chatManagerPrx.subscribe(hostname, prx);
                
                //------------Custom message from user---------------
                while(true) {
                    System.out.println("Ingresa tu mensaje: ");
                    String entry = sc.nextLine(); 
    
                    if(entry.equalsIgnoreCase("exit")) {
                        break;
                    }

                    try {
                        chatManagerPrx.sendMessage(hostname + ":" + entry);
                        sc.nextLine(); //Our program waits for an enter to continue
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                }
                sc.close();
                //--------------------------------------------------

            } catch (Exception e) {
                // saveMessage(dest,)
                e.printStackTrace();
            }
        }
    }


}
