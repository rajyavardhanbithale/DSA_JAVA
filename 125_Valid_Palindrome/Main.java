import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String s = " ";

        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        

        
        
        String[] newStringArray = s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        
        StringBuilder finalString = new StringBuilder();

        for(String str: newStringArray){
            finalString.append(str);
        }

        if(finalString.length()%2==0 && finalString.equals(" ")){
            return false;
        }

        return finalString.equals(finalString.reverse());
    }
}