
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int luku1 = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());
        int summa = luku1 + luku2;
        double neliojuuri = Math.sqrt(summa);
        System.out.println(neliojuuri);
    }
}
