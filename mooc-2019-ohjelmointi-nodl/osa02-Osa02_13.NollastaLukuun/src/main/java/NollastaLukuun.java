
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
    
        int nolla = 0;
        int luku = Integer.valueOf(lukija.nextLine());
        //while toistolause
        while ( nolla <= luku ) {
            System.out.println( nolla );
            nolla = nolla + 1;    
        }    
    }
}
