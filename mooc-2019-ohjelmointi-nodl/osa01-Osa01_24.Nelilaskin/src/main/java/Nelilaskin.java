
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int a = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int b = Integer.valueOf(lukija.nextLine());
        int ab = (a + b);
        System.out.println(a + " + " + b + " = " + ab);
        int abm = (a - b);
        System.out.println(a + " - " + b + " = " + abm);
        int abk = (a * b);
        System.out.println(a + " * " + b + " = " + abk);
        double abj = (1.0 * a / b);
        System.out.println(a + " / " + b + " = " + abj);
    }
}