import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        String a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simmetrikka tekshiradigan so'zingizni kiriting !");
        a = scanner.nextLine();
        isSymmetric(a);
    }

    public static boolean isSymmetric(String a) {
        String n, m;
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boshlang'ich indexi");
        i = scanner.nextInt();
        System.out.println("Tugash indexi");
        j = scanner.nextInt();

        n = a.substring(i,j);
        m = a.substring(j, i);

        System.out.println(n.equals(m));
        return false;
    }

}