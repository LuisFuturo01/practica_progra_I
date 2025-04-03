import java.util.Scanner;

public class prob1_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit, kelvin, rankine, reaumur;

        do{
            System.out.println("Ingrese la temperatura en grados Celsius: ");
            celsius = input.nextDouble();
        } while (celsius < -273.15);

        fahrenheit = Math.round(((celsius * 9/5) + 32)*100);
        kelvin = Math.round((celsius + 273.15)*100);
        rankine = Math.round(((celsius + 273.15) * 9/5)*100);
        reaumur = Math.round((celsius * 4 /5)*100);

        System.out.println("Fahrenheit: " + fahrenheit / 100 + " °F");
        System.out.println("Kelvin: " + kelvin / 100 + " K");
        System.out.println("Rankine: " + rankine / 100 + " °R");
        System.out.println("Réaumur: " + reaumur / 100 + " °Ré");
        input.close();
    }
}
