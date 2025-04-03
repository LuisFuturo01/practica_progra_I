import java.util.Scanner;
public class prob1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds;
        do{
            System.out.println("Ingresa los segundos");
            seconds = input.nextInt();
        }while(seconds<0);
        int hours = seconds / (3600);
        int minutes = (seconds % 3600) / 60;
        seconds %= 60;
        System.out.println(
            (hours < 10 ? "0" + hours : hours) + ":" + 
            (minutes < 10 ? "0" + minutes : minutes) + ":" + 
            (seconds < 10 ? "0" + seconds : seconds)
        );
        input.close();
    }
}