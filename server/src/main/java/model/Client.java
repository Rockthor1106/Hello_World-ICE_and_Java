package model;

import Demo.CallbackPrx;

public class Client {
    
    private String hostname;
    private CallbackPrx callbackPrx;

    public Client(String hostname, CallbackPrx callbackPrx) {
        this.hostname = hostname;
        this.callbackPrx = callbackPrx;
    }

    public String getHostname() {
        return hostname;
    }

    public CallbackPrx getCallbackPrx() {
        return callbackPrx;
    }
}
