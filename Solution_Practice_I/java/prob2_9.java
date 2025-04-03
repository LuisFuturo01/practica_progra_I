import java.util.Scanner;
public class prob2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity,lu,he,sa;
        do {
            System.out.println("Ingrese la cantidad de rondas a jugar");
            quantity=input.nextInt();
            input.nextLine();
        } while (quantity<=0);
        for (int i=1; i<=quantity; i++) {
            String entered = input.nextLine();
            String[] values = entered.split(" ");
            if (values.length != 3) System.out.println("");
            else{
                he=Integer.parseInt(values[0]);
                sa=Integer.parseInt(values[1]);
                lu=Integer.parseInt(values[2]);
                if (he!=sa && he!=lu && sa==lu) System.out.println("Herland");
                else if (sa!=he && sa!=lu && he==lu) System.out.println("Sami");
                else if (lu!=he && lu!=sa && he==sa) System.out.println("Luisin");
                else if (lu == he && he==sa) System.out.println("Iguales");
                else System.out.println("Diferentes");
            }
        }

        input.close();
    }
}