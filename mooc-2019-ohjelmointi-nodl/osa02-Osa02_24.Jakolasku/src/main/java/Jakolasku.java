
import java.util.Scanner;

public class Jakolasku {

    public static void main(String[] args) {
        // Kun olet toteuttanut metodin jakolasku, voit testata
        // sen toimintaa täällä. Esimerkiksi kutsun jakolasku(3,5);
        // pitäisi tulostaa "0.6"
        
        int osoittaja = 7;
        int nimittaja = 2;
        
        jakolasku(osoittaja, nimittaja);
    }

    // metodi void
    public static void jakolasku(int osoittaja, int nimittaja) {

        double tulos = (double) osoittaja / nimittaja;

        System.out.println(tulos);
    }
}