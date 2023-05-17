public class Server
{
    public static void main(String[] args)
    {
        try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args, "server.cfg"))
        {
            String value = communicator.getProperties().getProperty("name");
            com.zeroc.Ice.ObjectAdapter adapter = communicator.createObjectAdapter("Service");
            //com.zeroc.Ice.Object object = new PrinterI();
            ChatManagerImp chatManagerImp = new ChatManagerImp();
            //adapter.add(object, com.zeroc.Ice.Util.stringToIdentity("SimplePrinter"));
            adapter.add(chatManagerImp, com.zeroc.Ice.Util.stringToIdentity("ChatManager"));
            adapter.activate();
            communicator.waitForShutdown();
        }
    }
}
