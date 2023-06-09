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


    //This method is to print the result of the fibonacci serie from the server
    @Override
    public void printResultFibo(String response, Current current) {
        System.out.println("Your fibo: " + response);
    }

    //This method is to print the list of hostnames from the server
    @Override
    public void printHostnamesList(String hosts, Current current) {
        System.out.println("*****Hosts***** \n" + hosts);
    }

    @Override
    public void printMessage(String message, Current current) {
        System.out.println(message);
    }
    
}