package TwoPointerSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> al = new ArrayList<>();

        int alicePoints = 0;
        int bobPoints=0;

        for (int i = 0; i < 3;i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } if(b.get(i) > a.get(i)) {
                bobPoints++;
            }
        }
        return  al;
    }
}
