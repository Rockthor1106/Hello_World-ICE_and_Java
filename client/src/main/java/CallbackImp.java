import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

import com.zeroc.Ice.Current;

import Demo.ChatManagerPrx;

public class CallbackImp implements Demo.Callback {

    private ChatManagerPrx server;

    CallbackImp(ChatManagerPrx m) {
        server = m;
    }

    @Override
    public void notifyCallback(Current current) {
        //System.out.println("notifyCall");
        String state[] = server.getState();
        //System.out.println("Callback exec: " + Arrays.toString(state));
    }


    //This message is to print the result of the fibonacci serie from the server
    @Override
    public void printResultFibo(String response, Current current) {
        System.out.println(response);
    }



}