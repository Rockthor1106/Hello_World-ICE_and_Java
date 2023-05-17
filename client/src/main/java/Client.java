import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Scanner;

import com.zeroc.Ice.ObjectAdapter;
import com.zeroc.Ice.ObjectPrx;
import com.zeroc.Ice.Util;

import Demo.CallbackPrx;
import Demo.ChatManagerPrx;

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
                chatManagerPrx.subscribe(prx);

                String hostname = Inet4Address.getLocalHost().getHostName();

                //------------Custom message from user---------------
                while(true) {
                    System.out.println("Ingresa tu mensaje: ");
                    String entry = sc.nextLine(); 
    
                    if(entry.equalsIgnoreCase("exit")) {
                        break;
                    }

                    try {
                        chatManagerPrx.sendMessage(entry + " : " + hostname);
                    }catch (Exception e) {
                        System.out.println(e);
                    }
                }
                sc.close();
                //--------------------------------------------------
                MessageRec ms = new MessageRec();
                ms.reciveMessage("Hello Callback");

            } catch (Exception e) {
                // saveMessage(dest,)
                e.printStackTrace();
            }



            /* com.zeroc.Ice.ObjectPrx base = communicator.propertyToProxy("Service.Proxy");
            Demo.PrinterPrx printer = Demo.PrinterPrx.checkedCast(base);
            if(printer == null)
            {
                throw new Error("Invalid proxy");
            }
            //printer.printString("Hello World!");

            Scanner sc = new Scanner(System.in);
            int counter = 1;

            while(true) {
                counter++;
                System.out.println("Ingresa tu mensaje: ");
                //String entry = Integer.toString(counter);
                String entry = sc.nextLine();
                //System.out.println(entry);
		        if(entry.equalsIgnoreCase("exit")) {
			        break;
		        }
  		        try {
                System.out.println(printer.printString(entry+":"+ InetAddress.getLocalHost().getHostName()));
                }catch (Exception e) {
                    System.out.println(e);
                }
            }
		sc.close(); */

        //-------------------------------------------------------------
        }
    }


}
