import java.util.Scanner;
public class prob4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese cuantos numeros ver: ");
            num=input.nextInt();
        } while (num<0);
        int fac=1;
        for(int i=1; i<=num; i++){
            fac*=i;
            System.out.print(fac+" ");
        }

        input.close();
    }
}