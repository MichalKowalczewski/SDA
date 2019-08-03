package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Anagram {
    public boolean anagramCheck(String str1, String str2) {
        //Tworzymy 2 mapy, dla których każda litera będzie kluczem, a wartością będzie ilość wystąpień
        Map<Character, Integer> word1 = new TreeMap<Character, Integer>();
        Map<Character, Integer> word2 = new TreeMap<Character, Integer>();

        //Co tu jest źle, co można by było naprawić
        for (Character c : str1.toCharArray()) {
            if (word1.get(c) == null) {
                word1.put(c, 1);
            } else {
                word1.put(c, word1.get(c) + 1);
            }
        }

        for (Character c : str2.toCharArray()) {
            if (word2.get(c) == null) {
                word2.put(c, 1);
            }
            else {
                word2.put(c, word2.get(c) + 1);
            }
        }

        //Jeżeli obie mapy są różnych rozmiarów, to z góry wiemy że słowa nie są anagramami
        if (word1.size() != word2.size()){
            System.out.println("Słowa są różnej długości");
            return false;
        }

        for (Map.Entry entry: word1.entrySet() ) {
            int firstValue = word1.get(entry.getKey());

            //jeżeli słowo nr 2 zawiera literę z klucza słowa nr 1, wyświetlamy ilość wystąpień, danej litry - a następnie porównujemy czy ilość wystąpień jest taka sama
            //jeśli nie, przerywamy zwracamy FALSE
            if (word2.containsKey(entry.getKey())) {
                int secondValue = word2.get(entry.getKey());
                System.out.println("Litera " +entry.getKey() + " występuje: " +firstValue + " w pierszym słowie");
                System.out.println("Litera " +entry.getKey() + " występuje: " +secondValue+ " w drugim słowie");
                System.out.println("***");
                if (firstValue != secondValue) {
                    System.out.println("Litera: " + entry.getKey() + "nie występuje w takiej samej ilości w obu słowach");
                    return false;
                }
            }
            //Jeżeli słowo nr 1 zawiera literę, której nie zawiera słowo nr 2 zwracamy FALSE
            else {
                System.out.println("Litera: "+ entry.getKey() + " nie występuje w drugim słowie");
                return false;
            }
        }
        //Jeżeli żaden z negatywnych warunków nie zostanie spełniony - zwracamy TRUE
        return true;
    }
}




