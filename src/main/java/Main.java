import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();

        if (anagram.anagramCheck("ssoaj", "osasi")) {
            System.out.println("Jest Anagramem");
        }
        else{
            System.out.println("Nie jest Anagramem");
        }
    }
}
