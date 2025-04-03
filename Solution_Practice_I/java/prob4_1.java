import java.util.Scanner;
public class prob4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, binacci=0, aux=1;
        do {
            System.out.println("Ingrese cuantos digitos ver");
            num=input.nextInt();
        } while (num<0);
        int i=0;
        while (i<num){
            binacci+=aux;
            aux=binacci-aux;
            for(int j=1;j<=binacci;j++){
                if (i<num){
                    System.out.print(j+" ");
                    i+=1;
                }
            }
        }

        input.close();
    }
}