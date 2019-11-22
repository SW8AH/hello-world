
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        int i = Integer.valueOf(lukija.nextLine());
        if (i >= 18) {
            System.out.println("Olet täysi-ikäinen!");        
        }
        if (i <= 17) {
            System.out.println("Et ole täysi-ikäinen!");        
        }
    }
}
