import java.util.Scanner;
public class prob1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money,interest;
        int time;
        do{
            System.out.println("Ingrese el monto prestado, interes anual y el tiempo de años");
            money=input.nextInt();
            interest=input.nextInt();
            time=input.nextInt();
        }while((money<0)||(interest<0)||(time<0));
        interest/=100;
        interest*=money;
        for (int i=1; i<=time;i++){
            money+=interest;
        }
        System.out.println(money);

        input.close();
    }
}
