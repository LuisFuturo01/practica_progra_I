import java.util.Scanner;
public class prob1_11 {
    public static void main(String[] args) {
        double Q,D,S,H;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingrese la D-demanda, S-costo de pedido y H-costo de almacenamiento por año");
            D = input.nextDouble();
            S = input.nextDouble();
            H = input.nextDouble();
        } while (D < 0 || S < 0 || H <= 0);

        Q = Math.sqrt((2 * D * S) / H);
        System.out.println(Math.round(Q*100)/100.0);


        input.close();
    }
}