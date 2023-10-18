import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "aa";
        String t = "bb";
        // String s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        

        return Arrays.equals(sChar, tChar);

        
    }
}