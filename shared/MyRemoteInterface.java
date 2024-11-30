package shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Step 1: Define the Remote Interface
public interface MyRemoteInterface extends Remote {
    String sayHello(String name) throws RemoteException;
}