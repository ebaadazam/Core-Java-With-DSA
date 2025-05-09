import java.util.HashSet;
import java.util.Set;

public class Arrays_HappyNumber{
    private static int sumOfSquares(int num){
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += (rem * rem);
            num /= 10;
        }
        return sum;
    }

    private static boolean happy(int num) {
        // Set<Integer> set = new HashSet<>();
        // we used a set just to keep track of the visited numbers and avoid a cycle
        while (num != 1) {
            // set.add(num);
            num = sumOfSquares(num);
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int num = 19;
        System.out.println(num + (happy(num) ? " is a Happy Number!" : " is not a Happy Number."));
    }
}