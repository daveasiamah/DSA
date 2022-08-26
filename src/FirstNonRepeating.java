public class FirstNonRepeating {
    //Given the string "aaaaabcccdeef", "abcbad", "abcabcabc"
    //a5bc3de2f
    // Find the first non repeating character in the string "aaabcccdeeef".

    public char getFirstNonRepeating(String s) {
        for(int i = 0; i < s.length(); i++) {
            boolean nonRepeating = false;

            for(int j = 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && i != j) {
                    nonRepeating = true;
                    break;
                }
                return s.charAt(i);
            }
        }
        return '_';
    }


}
