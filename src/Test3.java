import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a ni kiriting");
        a = scanner.nextInt();
        try {
            for (int i = 10; i >= -10; i--) {
                System.out.println(a / i);
            }
        } catch (Exception e) {
           throw new ArithmeticException("0 ga bo'lish mumkin emas");
        }
        }
    }

