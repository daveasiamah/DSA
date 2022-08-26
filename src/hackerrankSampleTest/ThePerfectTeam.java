package hackerrankSampleTest;

import java.util.HashMap;
import java.util.Map;

public class ThePerfectTeam {
    public static int perfectTeam(String skills) {
        if (skills.length() == 0)
            return 0;
        Map<Character, Integer> subjects = new HashMap<>();

        while(subjects.size() !=5){
            subjects.put('p',0);
            subjects.put('c',0);
            subjects.put('m',0);
            subjects.put('b',0);
            subjects.put('z',0);
        }

        for (int i=0; i < skills.length(); i++) {
            char ch = skills.charAt(i);
            subjects.put(ch, (subjects.get(ch) + 1));
        }

        int min = Integer.MAX_VALUE;
        for(Character ch : subjects.keySet()) {
            int value = subjects.get(ch);
            if(value < min){ min = value;}
        }
        return min;

    }

    public static void main(String[] args) {
        String skills = "bbbbcccmmmmppppzzzz";
        int counter = perfectTeam(skills);
        System.out.println(counter);
    }
}
