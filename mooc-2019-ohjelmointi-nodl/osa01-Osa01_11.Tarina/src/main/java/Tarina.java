
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\n"
                + "Minkä niminen tarinassa esiintyvä hahmo on?");
        String v_1 = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String v_2 = lukija.nextLine();
        System.out.println("Tässä tarina:\n"
                + "Olipa kerran " + v_1 + ", joka oli ammatiltaan " + v_2 + ".\n"
                + "Matkatessaan töihin, " + v_1 + " mietti arkeaan. Kun työnä\n"
                + "on " + v_2 + ", tekemistä riittää välillä hyvin paljon ja\n"
                + "välillä ei lainkaan. Ehkäpä " + v_1 + " ei olekaan koko\n"
                + "elämäänsä " + v_2 + ".");
    }
}
