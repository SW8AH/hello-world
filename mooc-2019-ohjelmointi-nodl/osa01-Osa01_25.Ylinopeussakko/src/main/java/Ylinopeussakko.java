
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kerro nopeus:");
        int n = Integer.valueOf(lukija.nextLine());
        if (n > 120) {
            System.out.println("Ylinopeusakko!");
        }
    }
}
