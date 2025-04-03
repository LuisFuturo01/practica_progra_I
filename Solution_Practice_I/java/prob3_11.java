import java.util.Scanner;
public class prob3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese sus palabras");
        String words = input.nextLine(), newWord="";
        boolean upper=true;
        for (int i=0; i<words.length(); i++) {
            char word=words.charAt(i);
            if(Character.isLetter(word)){
                if(upper) {
                    newWord+=Character.toUpperCase(word); 
                    upper=!upper;
                }
                else {
                    newWord+=Character.toLowerCase(word);
                    upper=!upper;
                }
            }else newWord+=word;
        }
        System.out.println(newWord);
        input.close();
    }
}