package Map;

import Map.Anagram;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();

        if (anagram.anagramCheck("ssoaj", "osasi")) {
            System.out.println("Jest Anagramem");
        }
        else{
            System.out.println("Nie jest Anagramem");
        }

        List<Integer> list = new ArrayList<Integer>();
    }
}
