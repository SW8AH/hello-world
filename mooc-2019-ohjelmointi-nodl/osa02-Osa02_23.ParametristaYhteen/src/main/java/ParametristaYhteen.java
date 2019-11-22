
import java.util.Scanner;

public class ParametristaYhteen {

//pääohjelma
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int mista = 5;

        tulostaLuvustaYhteen(mista);
    }
    //luodaan metodi joka tulostaa luvut mista lukuun i
    public static void tulostaLuvustaYhteen(int mista) {
        
        int i = 1;
        while (i <= mista) {
            System.out.println(mista);
            mista--;
        }
    }
}