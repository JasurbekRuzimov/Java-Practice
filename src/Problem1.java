
                            // t(k)=t(k-1)+1/l*lg(z)

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        float t, l, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("T ni kiriting: ");
        t = scanner.nextFloat();
        System.out.println("L ni kiriting: ");
        l = scanner.nextFloat();
        System.out.println("Z ni kiriting: ");
        z = scanner.nextFloat();

        for (float i = t; i < 100; i++) {
            t = (float) (t - 1 + 1 / l * Math.log(z));
            t=t+1;
            System.out.println(t);
        }

    }

}
