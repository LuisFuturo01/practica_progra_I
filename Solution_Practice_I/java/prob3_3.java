import java.util.Scanner;
public class prob3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,addition=0;
        String numbers = "";
        do {
            System.out.println("Ingrese un numero");
            num = input.nextInt();
        } while (num<0);
        for (int i=2; i<=num; i++) {
            int aux=0;
            while (num%i==0){
                num/=i;
                aux++;
            }
            if(aux>0){
                numbers+=i+"^"+aux+"*";
                addition+=i;
            }
        }
        if(numbers != "") numbers+=1;
        else numbers+=0;
        System.out.println(numbers+" "+addition);

        input.close();
    }
}