import java.util.Scanner;

public class prob5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sumt = 0, a = 1, b = 1, c = 2, sum = a + b + c, cont2 = 0, aux, aux2, cont, cont3 = 1, cont4 = 0, aux3 = 2;
        double sumult = 0;
        boolean add = true;
        
        do {
            System.out.println("Ingrese cuantos numeros ver: ");
            num = input.nextInt();
        } while (num < 0);
        
        for (int i = 0; i < num; i++) {
            if (i == 0) aux = a;
            else if (i == 1) aux = b;
            else if (i == 2) aux = c;
            else {
                sumt = a + b + c;
                aux = sumt;
                a = b;
                b = c;
                c = sumt;
            }
            System.out.print(aux);
            
            do {
                cont = 0;
                cont2 += 1;
                for (int j = 1; j <= cont2; j++) {
                    if (cont2 % j == 0) cont += 1;
                }
            } while (cont != 2);
            
            aux2 = cont2;
            System.out.print("/" + aux2);
            
            if (cont3 <= num) { 
                if(cont3==1){
                    System.out.print(" - ");
                    sumult = sumult + ((double) (aux) / (double) (aux2));
                }else if (!add) {
                    System.out.print(" + ");
                    sumult = sumult + ((double) (aux) / (double) (aux2));
                } else {
                    System.out.print(" - ");
                    sumult = sumult - ((double) (aux) / (double) (aux2));
                }
                if(cont3!=1) cont4++;
                if (cont4 == aux3) {
                    add = !add;
                    aux3++;
                    cont4 = 0;
                }
                cont3++;
            }
        }
        System.out.println("\n" + sumult);
        input.close();
    }
}
