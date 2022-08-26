import TwoPointerSolutions.TwoSumWithTwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // public static class Node head;
//    //        Find the Kth Node from the End of a LinkedList in one Pass
//    public static int getKthNodeFromTheEnd(int k){
//        if(k == 0)
//            throw new IllegalStateException();
//        var a = Node
//        return k;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Hello Java");
////   Create a LinkedList of Integers
//        var numberList = new java.util.LinkedList<Integer>();
//        numberList.add(100);
//        numberList.add(200);
//        numberList.add(300);
//        numberList.add(400);
//        numberList.add(500);
//        numberList.add(600);
//
//        System.out.println("My Number List: "+numberList);
////      Linked List Question: Reverse a LinkedList in place
//          [10 -> 20 -> 30 -> 40 -> 50] becomes [50 -> 40 -> 30 -> 20 -> 10]

//        var myList = new LinkedList();
//        myList.addTail(20);
//        System.out.println(myList);

    //    }
    public static void main(String[] args) {
//        System.out.println("Integer to Roman Numeral: " + IntToRoman.IntegerToRoman(100));
//
//        StringReverser reverser = new StringReverser();
//        var result = reverser.reverse("abracadabra");
//        System.out.println("The reversed string is: " + result);
//
//        String myString = "(racecar)";
//        String myString2 = "(racecar(";
//
//        StackUtils stackU = new StackUtils();
//
//        var result1 = stackU.isBalanced(myString);
//        var result2 = stackU.isBalanced(myString2);
//
//        System.out.println("Is "+myString+ " balanced?: "+result1);
//        System.out.println("Is "+myString2+ " balanced?: "+result2);

        //My +++-- logarithm calculator
//        LogarithmCalc logcalc = new LogarithmCalc();
//        var logResult = logcalc.calculateLog(3, 270);
//        System.out.println("The log is: "+(logResult));

//        TwoSumBruteforce myTwoSums = new TwoSumBruteforce();
//        int[] myNumbers = {100, 200, 75, 10, 50, 10};
//        int target = 20;
//        int[] results = myTwoSums.twoSum(myNumbers, target);
//        for (int i = 0; i < results.length; i++)
//            System.out.println(" " + results[i]);
//
//        TwoSumOptimized myOptimizedTwoSum = new TwoSumOptimized();
//        int[] output = myOptimizedTwoSum.twoSum(myNumbers, target);
//        for (int i = 0; i < output.length; i++)
//            System.out.println(" " + output[i]);


//        TwoSumWithTwoPointer myTwoSums2 = new TwoSumWithTwoPointer();
        int[] myNumbers2 = {1, 4};
        int target2 = 10;
//        int results3 = myTwoSums2.twoPointerTwoSum(myNumbers2, target2);
//        System.out.println(results3);

        int[] result4 = myTwoSum(myNumbers2, target2);
        for (int num : result4) {
            System.out.println(num);
//        }

//        List<Integer> myNumbers4 = Arrays.asList(5, 3, 3, 3, 7, 8, 9, 10);
//        System.out.println(findDuplicates(myNumbers4));
        }
    }

    public static int[] myTwoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }

    public static List<Integer> findDuplicates(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.contains(numbers.get(i))){
                result.add(numbers.get(i));
                System.out.println(i+":"+numbers.get(i));
                return result;
            }
        }
        return numbers;
    }
}
