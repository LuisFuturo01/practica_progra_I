import java.util.Scanner;
import java.time.LocalDate;
public class prob2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate actualDate= LocalDate.now();
        System.out.print(actualDate);
        int day, month, year, available;
        do {
            System.out.println("Ingrese la fecha");
            System.out.print("Dia: ");
            day=input.nextInt();
            System.out.print("Mes: ");
            month=input.nextInt();
            System.out.print("Año: ");
            year=input.nextInt();
        } while (year<0 || month<=0 || day<=0);
        if (month>12) available=0;
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 > 0) || (year % 400 == 0)) available=29;
            else available=28;            
        }
        else if(
            month==4 || 
            month==6 ||
            month==9 ||
            month==11 
        ) available = 30;
        else available = 31;
        if (day<=available) {
            LocalDate enteredDate = LocalDate.of(year, month, day);
            if(!enteredDate.isAfter(actualDate)) System.out.println("Fecha Correcta");
            else System.out.println("Fecha Incorrecta");
        }else System.out.print("Fecha Incorrecta");
        input.close();
    }
}