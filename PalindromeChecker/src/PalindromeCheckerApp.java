import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();

        long startTime = System.nanoTime();

        boolean result = isPalindrome(input);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    private static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}