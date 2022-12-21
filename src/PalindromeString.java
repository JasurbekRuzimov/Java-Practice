import java.util.Scanner;
// 21- oktabr
public class PalindromeString {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" So'zni kiriting: ");
        str = scanner.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("Bu palindrome so'z");
        } else {
            System.out.println("Bu palindrome so'z emas");
        }
    }
}
