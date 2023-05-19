import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import com.zeroc.Ice.Current;

import Demo.CallbackPrx;

public class ChatManagerImp implements Demo.ChatManager {

    private List<String> messages;
    // Semaphore mSemaphore = new Semaphore(1);
    private CallbackPrx callbackPrx;

    ChatManagerImp() {
        messages = new ArrayList<>();
    }

    @Override
    public void subscribe(CallbackPrx callback, Current current) {
        //System.out.println("subscribe");
        this.callbackPrx = callback;
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
            //System.out.println("new Message: " + msg);
            //messages.add(msg);
            printCalculateFibonacci(msg, current);
            //callbackPrx.notifyCallback();
        }).start();
    }

    //------------------------Fibonacci's Logic--------------------------
    public String printCalculateFibonacci(String msg, com.zeroc.Ice.Current current) {
	    String host = msg.split(":")[0]; //This line gets the hostname form the message sent by the client
        int pos = 0;
        try {
            pos = Integer.valueOf(msg.split(":")[1]);
        } catch (Exception e) {
            System.out.println(msg); //When the message is not a number this prints the same line
        }
        for (int i = 1; i<=pos; i++) {
            //System.out.println(fibonacci(i, host, current));
        }
        return Long.toString(fibonacci(pos, host, current));
    }

    @Override
    public long fibonacci(int pos, String host, Current current) {
        if (pos < 2) return pos;
        return fibonacci(pos - 1, host, current) + fibonacci(pos - 2, host, current);
    }
    //-------------------------------------------------------------------
}