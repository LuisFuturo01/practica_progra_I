import java.util.Scanner;
public class prob4_13   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, binacci=0, aux=1, contv=0, cont;
        do {
            System.out.println("Ingrese cuantos numeros ver:");
            num=input.nextInt();
        } while (num<0);
        while (num>0){
            contv+=1;
            for(int i=1; i<=contv; i++){
                if (num>0){
                    binacci+=aux;
                    aux=binacci-aux;
                    System.out.print(binacci+"!/"+contv);
                    num-=1;
                    if(num!=0){
                        System.out.print(" + ");
                    }
                }
            }
            
        }


        input.close();
    }
}