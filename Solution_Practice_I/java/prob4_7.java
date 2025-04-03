import java.util.Scanner;
public class prob4_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, par=0, aux=-1, binacci=1;
        Boolean sw=true;
        do {
            System.out.println("Ingrese cuantos numeros ver: ");
            num=input.nextInt();
        } while (num<0);
        for(int i=1; i<=num; i++){
            if (sw){
                par+=2;
                System.out.print(par+" ");
            }else{
                binacci+=aux;
                aux=binacci-aux;
                System.out.print(binacci+" ");
            }
            sw=!sw;
        }

        input.close();
    }
}