package hashSet;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetProblems {
    public boolean hasDuplicates(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        boolean duplicateFound = false;

        HashSet<Integer> set = new HashSet<>();

        for (int l : list) {
            if (!set.add(l))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);

        HashSetProblems hsp = new HashSetProblems();

        var result = hsp.hasDuplicates(list);
        System.out.println(result);
    }
}
