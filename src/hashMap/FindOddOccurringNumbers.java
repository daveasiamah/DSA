package hashMap;

import java.util.HashMap;

public class FindOddOccurringNumbers {
    public String findOddOccurring(String s){
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();

        for(String l:s.split("")){
            if(map.containsKey(l)){
                map.put(l, map.get(l) + 1);
            }else{
                map.put(l,1);
                sb.append(map.get(l)+map.get(l)+1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FindOddOccurringNumbers obj = new FindOddOccurringNumbers();
        System.out.println(obj.findOddOccurring("aaaaabcccdeeef"));
    }
}
