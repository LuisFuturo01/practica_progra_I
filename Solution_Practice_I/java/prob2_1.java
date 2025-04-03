import java.util.Scanner;
public class prob2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1,a2,b1,b2,begin,end;
        do {
            System.out.println("Ingrese los intervalos a1, b1 y a2, b2");
            a1=input.nextInt();
            b1=input.nextInt();
            a2=input.nextInt();
            b2=input.nextInt();
        } while (a1>b1 && a2>b2);

        begin=a1>a2 ? a1 : a2;
        end=b1>b2 ? b2 : b1;

        System.out.println((begin <= end) ? "[" + begin + "," + end + "]" : "[]");
        input.close();
    }
}