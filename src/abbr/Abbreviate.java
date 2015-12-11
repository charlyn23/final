package abbr;

import java.util.ArrayList;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        // TODO: Write this method. Remove all vowels
        ArrayList<Character> array = new ArrayList<Character>();
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        String resultString = "";

        for (int p = 0; p <string.length(); p++) {
            array.add(string.charAt(p));
        }
        for (int s = 0; s < array.size(); s++) {
            if (array.get(s) == a) {
                array.remove(s);
            }
            if (array.get(s) == e){
                array.remove(s);
            }
            if (array.get(s) == i){
                array.remove(s);
            }
            if (array.get(s) == o){
                array.remove(s);
            }
            if (array.get(s) == u){
                array.remove(s);
            }
        }
        for (int x = 0; x < array.size(); x++) {
            resultString += array.get(x);
        }
        return resultString;


    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }


}
