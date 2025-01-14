import java.util.Arrays;

class Arrays_PalindromeNumber {
    public static boolean palindromeNum(int num) {
        // Negative number condition
        if (num < 0) {
            return false;
        }

        // Calculating the number of digits in num
        int temp = num;
        int length = 0;
        while (temp > 0) {
            length++;
            temp /= 10;
        }

        // Create an array of the same length
        int[] result = new int[length];

        // Traverse from last and add to result[] array
        for (int i = length - 1; i >= 0; i--) {
            result[i] = num % 10; // Get the last digit
            num /= 10; // Remove the last digit
        }

        // Palindrome Number checking
        for (int i = 0; i < length / 2; i++) {
            if (result[i] != result[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = -121;
        System.out.println(palindromeNum(num));
    }
}

