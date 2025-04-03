import java.util.Scanner;
public class prob2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity,a,b;
        do {
            System.out.println("Ingrese la cantidad de entradas");
            quantity=input.nextInt();
            input.nextLine();
        } while (quantity>=15 || quantity<0);
        for (int i=1; i<=quantity; i++) {
            String charValue;
            String[] values;
            do {
                do {
                    System.out.println("Ingrese 2 numeros");
                    charValue=input.nextLine();
                    charValue=charValue.trim();
                    values = charValue.split(" ");
                } while (values.length != 2);
                a=Integer.parseInt(values[0]);
                b=Integer.parseInt(values[1]);
                
            } while ((a>0?a:a*-1)>=1000000001 || (b>0?b:b*-1)>=1000000001);
            if (a>b) System.out.println(">");
            else if (a<b) System.out.println("<");
            else System.err.println("=");
        }

        input.close();
    }
}