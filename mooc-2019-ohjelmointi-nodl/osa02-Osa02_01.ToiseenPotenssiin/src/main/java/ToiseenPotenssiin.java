
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int s = 0;
        int luku = Integer.valueOf(lukija.nextLine());
        int summa = luku * luku;
        System.out.println(summa);
    }
}
