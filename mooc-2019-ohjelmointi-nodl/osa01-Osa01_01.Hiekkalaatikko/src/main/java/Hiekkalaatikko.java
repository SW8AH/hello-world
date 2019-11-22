
import java.util.Scanner;

    public class Hiekkalaatikko {

    public static void main(String[] args) {
            Scanner lukija = new Scanner(System.in);

        int luku = 3;
        muokkaaLukua(luku);
        System.out.println(lisaaJaPalauta(luku));
    }

    public static void muokkaaLukua(int luku) {
        luku = luku + 2;
    }

        public static int lisaaJaPalauta(int luku) {
            return luku + 10;
        }
    }