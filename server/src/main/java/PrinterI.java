import java.math.BigInteger;

public class PrinterI implements Demo.Printer
{       
    public String printString(String msg, com.zeroc.Ice.Current current) {
	String host = msg.split(":")[1]; //This line gets the hostname form the message sent by the client
	int pos = 0;
	try {  
        	pos = Integer.valueOf(msg.split(":")[0]);
	
	} catch (Exception e) {
		System.out.println(msg); //When the message is not a number this prints the same line
	}
        return fibonacci(pos, host, current);
    }

    public String fibonacci(int pos, String host, com.zeroc.Ice.Current current) {

		if (pos <= 1) {
            return Integer.toString(pos);
        }
        
        long fib = 1;
        long prevFib = 1;

		System.out.println(fib);
		System.out.println(prevFib);
        
        for (int i = 2; i < pos; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
			System.out.println(fib);
        }

		System.out.println();

	return Long.toString(fib);
    }
}
