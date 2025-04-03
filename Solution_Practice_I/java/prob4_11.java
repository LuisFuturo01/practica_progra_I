import java.util.Scanner;
public class prob4_11  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aux=-1,aux2=0,num,cont,binacci=1;
        boolean sw=true;
        do {
            System.out.println("Ingrese cuantos numeros ver: ");
            num=input.nextInt();
        } while (num<0);
        while (num>0){
            if (sw){
                binacci+=aux;
                aux=binacci-aux;
                System.out.print(binacci+" ");
            }else{
                do {
                    aux2+=1;
                    cont=0;
                    for (int i=1;i<=aux2;i++){
                        if(aux2%i==0)cont+=1;
                    }
                } while (cont!=2);
                System.out.print(aux2+" ");
            }
            sw=!sw;
            num-=1;
        }


        input.close();
    }
}