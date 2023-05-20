package model;

import Demo.CallbackPrx;

public class Client {
    
    private String hostname;
    private CallbackPrx callbackPrx;
    private String clientIdentifier; 

    public Client(String hostname, CallbackPrx callbackPrx, String clientIdentifier) {
        this.hostname = hostname;
        this.callbackPrx = callbackPrx;
        this.clientIdentifier = clientIdentifier;
    }

    public String getHostname() {
        return hostname;
    }

    public CallbackPrx getCallbackPrx() {
        return callbackPrx;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }
}
