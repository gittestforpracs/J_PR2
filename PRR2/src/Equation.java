import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Equation extends Remote {
    void CalcEquation(int iVar1, int iVar2, int iVar3) throws RemoteException;
}