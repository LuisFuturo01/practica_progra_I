import java.util.Scanner;
public class prob1_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance, time;
        do {
            System.out.println("Ingrese la distancia y cuanto tiempo queda");
            distance=input.nextInt();
            time=input.nextInt();
        } while (distance<0 || time<=0);
        time*=60;
        System.out.print(Math.round(distance*100/time)/100.0 +" m/s");
        input.close();
    }
}