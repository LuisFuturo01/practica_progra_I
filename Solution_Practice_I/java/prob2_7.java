import java.util.Scanner;
public class prob2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight, part;
        do {
            System.out.println("Ingrese cuantos kg pesa la Piña");
            weight=input.nextInt();
        } while (weight<1 || weight>100);
        part=weight/2;
        if(part%2==1) part-=1;
        weight-=part;
        if(weight%2==0 && part%2==0 && weight!=2) System.out.println("SI");
        else System.out.println("NO");

        input.close();
    }
}