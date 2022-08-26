package TwoPointerSolutions;

public class TwoSumWithTwoPointer {
    public int twoPointerTwoSum(int[] array, int target){
        int pointerOne = 0;
        int pointerTwo = array.length - 1;
        int result = 0;

        while (pointerOne < pointerTwo) {
            int sum = array[pointerOne]+array[pointerTwo];

            if(sum == target) {
                 result += array[pointerOne] + array[pointerTwo];
            }else if( sum < target) {
                pointerOne++;
            }else pointerTwo--;
            System.out.println(pointerTwo);
        }
        return result;
    }

}
