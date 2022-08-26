public class LogarithmCalc {
    public int calculateLog(int base, int number) {
        if (number == 0) return 0;
        int count = 0;

        while(number > 1){
           number = number/base;
           count++;
        }
        return count;
    }
}
