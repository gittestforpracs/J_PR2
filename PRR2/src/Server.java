import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.rmi.server.UnicastRemoteObject;

public class Server extends Func {
    public Server() {
    }

    public static void main(String[] args) {
        try {
            Func obj = new Func();
            Equation stub = (Equation)UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.bind("Equation", stub);
            System.err.println("We are ready!");
        }

        catch (Exception var4) {
            System.err.println("Server exception " + var4.toString());
            var4.printStackTrace();
        }

    }
}
