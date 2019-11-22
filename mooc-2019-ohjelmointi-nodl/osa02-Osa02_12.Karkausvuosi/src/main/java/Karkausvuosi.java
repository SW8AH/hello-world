
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna vuosi: ");
        //lukee käyttäjältä vuosiluvun
        
        int vuosi = Integer.valueOf(lukija.nextLine());
        
        boolean karkaus = false;
       
        // vuosiluku on jaollinen neljällä ja neljälläsadalla
        if (vuosi % 4 == 0)
        {
            if (vuosi % 100 == 0)
            {
                // vuosi on jaollinen 400
                if (vuosi % 400 == 0)
                    karkaus = true;
                else
                    karkaus = false;
            }
            else
                karkaus = true;
        }
        else
            karkaus = false;
        
        if (karkaus)
            System.out.println("Vuosi on karkausvuosi.");
        else
            System.out.println("Vuosi ei ole karkausvuosi.");
    }
}