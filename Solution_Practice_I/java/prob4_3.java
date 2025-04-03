import java.util.Scanner;
public class prob4_3  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,a=1,b=2,c=3,d=4, sum;
        do {
            System.out.println("Ingrese cuantos digitos ver");
            num=input.nextInt();
        } while (num<0);
        for(int i=0; i<num; i++){
            if(i==0) System.out.print(a+" ");
            else if(i==1) System.out.print(b+" ");
            else if(i==2) System.out.print(c+" ");
            else if(i==3) System.out.print(d+" ");
            else{
                sum=a+b+c+d;
                a=b;
                b=c;
                c=d;
                d=sum;
                System.out.print(sum+" ");
            }
        }

        input.close();
    }
}