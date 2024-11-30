package server;

import java.rmi.Naming;

import shared.MyRemoteInterface;

// Step 5: Start the Server
public class MyServer {
    public static void main(String[] args) {
        try {
            // Create a remote object implementation
            MyRemoteInterface skeleton = new MyRemoteImplementation();

            // Bind the remote object (stub) to the RMI registry
            Naming.rebind("rmi://localhost:8010/HelloService", skeleton);

            System.out.println("Server is ready and running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}