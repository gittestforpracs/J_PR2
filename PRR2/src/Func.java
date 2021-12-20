import java.rmi.RemoteException;

public class Func implements Equation {
    public Func() {}

    public void CalcEquation(int a, int b, int c) throws RemoteException {
        int iDescr = b * b - 4 * a * c; //Дискриминант
        double x1;
        if (iDescr > 0) {
            System.out.println("/Уравнение 1///////////////////");
            x1 = ((double)(-b) + Math.sqrt((double)iDescr)) / (double)(2 * a);
            double x2 = ((double)(-b) - Math.sqrt((double)iDescr)) / (double)(2 * a);
            System.out.println("Первый корень уравнения: " + x1 + "\nВторой корень уравнения: " + x2);
        }
        else if (iDescr == 0) {
            System.out.println("/Уравнение 2///////////////////");
            System.out.println("Дискриминант равен нулю!");
            x1 = (double)(-b / (2 * a));
            System.out.println("Корень уравнения: " + x1);
        }
        else {
            System.out.println("Уравнение 3///////////////////");
            System.out.println("Корней нет");
        }

    }
}