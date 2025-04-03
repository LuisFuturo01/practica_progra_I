import java.util.Scanner;
public class prob3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valueString;
        String[] values;
        int cont=0,x,y;
        while (true) {
            while (true) {
                System.out.println("Ingrese dos numeros");
                valueString = input.nextLine();
                values=valueString.trim().split(" ");
                if (values.length == 2) break;
                
            };
            x = Integer.parseInt(values[0]);
            y = Integer.parseInt(values[1]);
            if(y>0) break;
        }
        boolean less;
        if (x<0){
            x*=-1;
            less=false;
        }else less = true;
        while (x>=y){
            x-=y;
            cont++;
        }
        System.out.println(less ? cont + " " + x : "-" + cont + " " + x);



        input.close();
    }
}