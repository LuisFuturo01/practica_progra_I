import java.util.Scanner;
public class prob1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base_salary, antique, courses;
        do {
            System.out.println("Ingrese el salario base, años de antigüedad y cuántas horas da tutorías o cursos extra");
            base_salary = input.nextInt();
            antique = input.nextInt();
            courses = input.nextInt();
        } while ((base_salary < 1800 || base_salary > 14000)||
                (antique < 1 || antique > 10)|| 
                (courses < 1 || courses > 8));
        
        base_salary+=base_salary*0.05*antique + (20*courses);
        System.out.println("Sueldo Mensual: " + base_salary + " Bs");
        System.out.println("Sueldo Anual: " + base_salary*12 + " Bs");    

        input.close();
    }
}