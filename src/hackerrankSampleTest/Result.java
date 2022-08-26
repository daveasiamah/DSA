package hackerrankSampleTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

            while(l < r) {
                for (int i = l; i <= r; i++) {
                    nums.add(i);
                    l++;
                }
            }

//            Remove even numbers from the array
        for(int i: nums){
            if(i %2 !=0){
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int l = 2;
        int r = 20;

        List<Integer> nums = oddNumbers(l, r);

        System.out.println(nums);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your string: ");
//        String string = sc.nextLine();

//        System.out.println(string);

        System.out.println(isPalindrome("faraf"));
    }

    public static boolean isPalindrome(String string) {
        int len = string.length();
        int left =0;
        int right = len -1;

        while(left != len) {
        if(string.charAt(left) == string.charAt(right)) {
            return true;
        }
        left++;
        right--;
    }
        return false;
    }}
