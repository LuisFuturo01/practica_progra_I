import java.util.Scanner;
public class prob2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        double purchase;
        do {
            System.out.println("Ingrese el ID y cantidad de compra");
            id=input.nextInt();
            purchase=input.nextInt();
        } while (id<=0 || purchase<0);
        if(purchase>1200){
            purchase-=100;
        }
        if(id<100){
            purchase-=(purchase*0.2);
        }else if(id<1000 && purchase>400){
            purchase-=(purchase*0.1);
        }
        System.out.printf("%.1f", purchase);
        input.close();
    }
}