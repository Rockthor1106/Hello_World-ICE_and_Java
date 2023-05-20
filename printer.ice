module Demo
{
    sequence<string> StringSeq;

    interface Callback{
        void notifyCallback();

        void printResultFibo(string response);

        void printHostnamesList(string hosts);

        void printMessage(string message);
    }
    
    interface ChatManager{

        void subscribe(string hostname, Callback* callback);

        StringSeq getState();

        void sendMessage(string msg);

       	long fibonacci(int pos, string host);
    }
}

