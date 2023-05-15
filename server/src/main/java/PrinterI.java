import com.zeroc.Ice.Current;

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
        for (int i = 1; i<=pos; i++) {
            System.out.println(host + ":" + fibonacci(i, host, current));
        }
        return Long.toString(fibonacci(pos, host, current));
    }

    @Override
    public long fibonacci(int pos, String host, Current current) {
        if (pos < 2) return pos;
        return fibonacci(pos - 1, host, current) + fibonacci(pos - 2, host, current);
    }
}
