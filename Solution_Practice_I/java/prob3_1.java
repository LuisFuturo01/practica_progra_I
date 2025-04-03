import java.util.Scanner;
public class prob3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity,a,b;
        String charValue;
        String[] values;
        do {
            System.out.println("Ingrese cuantos casos habra");
            quantity=input.nextInt();
            input.nextLine();
        } while (quantity<0);
        for (int i=1; i<=quantity; i++) {
            do {
                do {
                    charValue=input.nextLine();
                    charValue=charValue.trim();
                    values=charValue.split(" ");
                } while (values.length != 2);
                a=Integer.parseInt(values[0]);
                b=Integer.parseInt(values[1]);
            } while ((a<2||a>Math.pow(10, 5))||(b<2||b>Math.pow(10,5)));
            for (int j=((a > b) ? b : a); j>=1  ; j--) {
                if(a%j==0 && b%j==0){
                    System.out.println(j);
                    break;
                }
            }
        }


        input.close();
    }
}