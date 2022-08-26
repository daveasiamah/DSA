import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringUtils {
    public static int countVowels(String s){
        if(s == null) return 0;
        int count=0;
        String vowels = "aeiou"; //Convert to a set later
        int len = s.toCharArray().length;

        for(var c: s.toLowerCase().toCharArray()){
            if(vowels.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String s){
        StringBuilder reversed = new StringBuilder();

        for(int i= s.length()-1; i >=0;i--){
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseWords(String s){
        if(s == null) return "";

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =words.length-1; i >=0; i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
       var result = countVowels("sten");
       var result2 = reverseString("master");
       var result3 = reverseWords("The brown fox jumped over the lazy dog");
        System.out.println(result);
        System.out.println(result2);

        List<String> str = new ArrayList<>();
        str.add("Ham");
        System.out.println(result3);
    }
}
