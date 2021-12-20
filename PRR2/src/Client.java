import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public Client() {}
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(8080);
            Equation stub = (Equation)registry.lookup("Equation");
            stub.CalcEquation(1, 4, 1); //Значения для квадратного уравнения
            stub.CalcEquation(1, 4, 4); //Значения для квадратного уравнения, один корень
            stub.CalcEquation(5, 5, 5); //Значения для квадратного уравнения, нет корня
        }

        catch (Exception var3) {
            System.err.println("Client exception: " + var3.toString());
            var3.printStackTrace();
        }

    }
}