import java.math.BigInteger;
import java.math.BigDecimal;

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

		BigInteger[] fibo = new BigInteger[pos + 1];
        
    
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;
        for (int i = 2; i <= pos; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
			
			System.out.println(fibo[i - 1].add(fibo[i - 2]));
        }
		BigInteger requestedPos = fibo[pos];
		System.out.println();

	return requestedPos.toString();
    }
}
