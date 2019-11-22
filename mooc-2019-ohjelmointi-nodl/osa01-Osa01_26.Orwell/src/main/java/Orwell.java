
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku:");
        int o = Integer.valueOf(lukija.nextLine());
        if (o == 1984) {
            System.out.println("Orwell");        
        }
    }
}