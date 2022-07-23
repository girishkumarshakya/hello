package tutorial.factory.method;

import tutorial.factory.method.impl.ClientServiceImpl;

public class DefaultServiceLocator {
    private static ClientService clientService = new ClientServiceImpl();

    public ClientService createClientServiceInstance(){
        return clientService;
    }
}
