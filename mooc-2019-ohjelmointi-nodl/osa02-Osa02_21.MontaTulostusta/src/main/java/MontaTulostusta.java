import java.util.Scanner;

public class MontaTulostusta {
    
    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // kysyy kuinka monta kertaa tulostetaan
        System.out.println("Kuinka monta?");
        int monta = Integer.parseInt(reader.nextLine());
        //laskuri
        int laskin = 1;
        // while komento kysyy montako kertaa toistetaan
        while (laskin <= monta) {
            tulostaTeksti();
            laskin++;
        }
    }
}