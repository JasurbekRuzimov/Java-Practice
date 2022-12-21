import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        IsPalindrome(a,b);


    }

    public static boolean IsPalindrome(int a, int b) {
        int c;
        if (a==b){
            System.out.println(a + b);
        }

        return false;
    }

}