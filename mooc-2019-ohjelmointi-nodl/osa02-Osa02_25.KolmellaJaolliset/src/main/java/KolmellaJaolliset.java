
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int alku = 3;
        int loppu = 9;

        kolmellaJaollisetValilta(alku, loppu);
    }

    public static void kolmellaJaollisetValilta(int alku, int loppu) {

        int j = 3;

        while (alku <= loppu) {
            
            System.out.println(alku);
            alku++;
            //int vastaus = alku + j;
        }
    }
}
