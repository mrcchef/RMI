package client;

import java.rmi.Naming;

import shared.MyRemoteInterface;

// Step 6: Connect to the Server and Use the Remote Object
public class MyClient {
    public static void main(String[] args) {
        try {
            // Lookup the remote object in the RMI registry
            MyRemoteInterface stub = (MyRemoteInterface) Naming.lookup("rmi://localhost:8010/HelloService");

            // Invoke the remote method and print the result
            String response = stub.sayHello("Neha");
            System.out.println("Response from Server: " + response);
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}