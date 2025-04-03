import java.util.Scanner;
public class prob4_9  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, dig, aux=0, neww=1,cont=0;
        do {
            System.out.println("Ingrese cuantos numeros ver:");
            num=input.nextInt();
        } while (num<0);
        while (num>0){
            aux+=1;
            cont=0;
            for (int i=1; i<=aux; i++){
                if(aux%i==0) cont+=1;
            }
            if (cont==2){
                dig=aux%10;
                System.out.print(neww+" ");
                neww+=dig;
                num-=1;
            }
        }

        input.close();
    }
}
//Notinsky Javierinsky: empieza en 1 y se suma el ultimo digito de los numeros primos