import java.util.Scanner;
public class prob3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity, len;
        do {
            System.out.println("Ingrese los casos de prueba");
            quantity=input.nextInt();
        } while (quantity<1 || quantity>1000);
        for (int i=1; i<=quantity; i++) {
            do {
                System.out.println("Longitud de contraseña:");
                len = input.nextInt();
                input.nextLine();
            } while (len<1 || len>20);
            String password = input.nextLine();
            boolean flag=true;
            if(password.length() == len){
                for (int j=0; j<password.length()-1; j++) {
                    char character = password.charAt(j);
                    char characterNext = password.charAt(j+1);
                    //0=48 9=57 a=97 z=122
                    if (
                        (int)character <= (int)characterNext &&
                        (
                            ((int)character >= 48 && (int)character <= 57) && 
                            ((int)characterNext >= 48 && (int)characterNext <= 57)
                        ) || 
                        (
                            ((int)character >= 48 && (int)character <= 57) && 
                            ((int)characterNext >= 97 && (int)characterNext <= 122)
                        ) || 
                        (
                            ((int)character >= 97 && (int)character <= 122) && 
                            ((int)characterNext >= 97 && (int)characterNext <= 122)
                        )
                    )flag = true;
                    else{
                        flag=false;
                        break;
                    }
                }
            }
            else flag = false;
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }


        input.close();
    }
}