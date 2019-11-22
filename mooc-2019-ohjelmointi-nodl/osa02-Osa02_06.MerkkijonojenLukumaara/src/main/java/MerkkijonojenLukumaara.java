
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        
        //lukemiseen käytettävä Scanner-apuväline
        Scanner lukija = new Scanner(System.in);
        
        // Tehtävänä lukumäärän säilöminen
        int lukuja = 0;
        
        // Tehtävänä lukemisen toistaminen, kunnes "loppu"        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
            break;
            }
            
            // Tehtävänä lukumäärän kasvattaminen yhdellä
                lukuja = lukuja + 1;
            }
        System.out.println(lukuja);
    }
}