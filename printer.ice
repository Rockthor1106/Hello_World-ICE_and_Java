module Demo
{
    interface Printer
    {
       	string printString(string s);

       	long fibonacci(int pos, string host);
    }

    sequence<string> StringSeq;

    interface Callback{
        void notifyCallback();

        void printResultFibo(string response);
    }
    
    interface ChatManager{

        void subscribe(Callback* callback);

        StringSeq getState();

        void sendMessage(string msg);

        string printCalculateFibonacci(string s);

       	long fibonacci(int pos, string host);
    }
}

