//public class AssertJava {
//    public static void main(String[] args) {
//        int x = 5;
//        int y = 6;
//        assert x > y : "x katta emas";
//        System.out.println(x);
//    }
//}







import java.util.Scanner;

public class AssertJava {
    public static boolean palindrome(String s) {
        assert s != null;
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                //  System.out.println("Bu  Palindrom satr emas");
                return false;
            }
        }
        //  System.out.println(" Bu Palindrom satr");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "aziza";
        palindrome(s);
//        assert (palindrome(s) == true) ;
        assert (palindrome("jasur") == true );
        System.out.println("Test OK");
    }



}