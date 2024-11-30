package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import shared.MyRemoteInterface;

// Step 2: Implement the Remote Interface
public class MyRemoteImplementation extends UnicastRemoteObject implements MyRemoteInterface {
    // Constructor must explicitly throw RemoteException
    protected MyRemoteImplementation() throws RemoteException {
        super();
    }

    // Implementation of the remote method
    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "! Welcome to Java RMI.";
    }
}