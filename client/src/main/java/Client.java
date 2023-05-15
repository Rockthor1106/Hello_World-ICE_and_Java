import java.net.InetAddress;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args)
    {
        try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args, "client.cfg"))
        {
            com.zeroc.Ice.ObjectPrx base = communicator.propertyToProxy("Service.Proxy");
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
		sc.close();
        }
    }


}
