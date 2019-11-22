
import java.util.Scanner;

public class YhdestaParametriin {
//pääohjelma
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int mihin = 5;

        tulostaLukuunAsti(mihin);

    }
    //luodaan metodi joka tulostaa luvut "mihin" lukuun asti
    public static void tulostaLukuunAsti(int mihin) {
        
        int i = 1;
        while (i <= mihin) {
            System.out.println(i);
            i++;
        }
    }
}
