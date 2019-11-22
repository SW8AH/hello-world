
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("lopeta")) {
                System.out.println("hurraa!");
                break;
            } else {
                System.out.print("hip!\n");
            }
        }
    }
}