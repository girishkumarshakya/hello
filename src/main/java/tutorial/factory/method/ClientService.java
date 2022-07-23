package tutorial.factory.method;

public class ClientService {
    private static ClientService clientService = new ClientService();

    public ClientService(){}

    public static ClientService createInstance(){
        return clientService;
    }
}
