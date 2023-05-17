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
    }
    interface ChatManager{

        void subscribe(Callback* callback);

        StringSeq getState();

        void sendMessage(string msg);
    }
}

