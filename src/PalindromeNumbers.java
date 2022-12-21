import java.util.*;

class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ->  ");
        int n = scanner.nextInt();

        int a = 0, b, c;
        b = n;

        while (n != 0) {
            c = n % 10;
            a = (a * 10) + c;
            n = n / 10;
        }

        if (b == a) {
            System.out.println("Yes, it is palindrome number");
        } else {
            System.out.println("No, it is not palindrome number");
        }
    }
}