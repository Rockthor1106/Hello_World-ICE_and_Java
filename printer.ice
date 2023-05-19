module Demo
{
    sequence<string> StringSeq;

    interface Callback{
        void notifyCallback();

        void printResultFibo(string response);
    }
    
    interface ChatManager{

        void subscribe(Callback* callback);

        StringSeq getState();

        void sendMessage(string msg);

       	long fibonacci(int pos, string host);
    }
}

