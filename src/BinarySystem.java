import java.util.Scanner;

public class BinarySystem {
        public static void main(String[] args) {

            System.out.println("   1. O'nlik");
            System.out.println("   2. Ikkilik");
            System.out.println("   3. Sakkizlik");
            System.out.println("   4. O'n oltiliq");
            System.out.println("Sanoq sistemani tanlang : ");
            int a = new Scanner(System.in).nextInt();
            int n;
            Scanner scanner = new Scanner(System.in);
            switch (a){
                case 1:
                    System.out.println("O'nlik sonni kiriting");
                    n = scanner.nextInt();
                    System.out.println("Ikkilikda : " + Integer.toBinaryString(n));
                    System.out.println("Sakkizlikda : " + Integer.toOctalString(n));
                    System.out.println("O'n oltiliqda : " + Integer.toHexString(n));
                    break;

                case 2:
                    System.out.println("Ikkilik sonni kiriting");
                    n = scanner.nextInt();
                    System.out.println("O'nlikda : " + Integer.parseInt(String.valueOf(n), 2));
                    System.out.println("Sakkizlikda : " + Integer.toOctalString(n));
                    System.out.println("O'n oltiliqda : " + Integer.toHexString(n));
                    break;

                case 3:
                    System.out.println("Sakkizlik sonni kiriting");
                    n = scanner.nextInt();
                    System.out.println("O'nlikda : " + Integer.parseInt(String.valueOf(n), 8));
                    System.out.println("Ikkilikda : " + Integer.toBinaryString(n));
                    System.out.println("O'n oltiliqda : " + Integer.toHexString(n));
                    break;

                case 4:
                    System.out.println("O'n oltiliq sonni kiriting");
                    n = scanner.nextInt();
                    System.out.println("O'nlikda : " + Integer.parseInt(String.valueOf(n), 16));
                    System.out.println("Ikkilikda : " + Integer.toBinaryString(n));
                    System.out.println("Sakkizlikda : " + Integer.toOctalString(n));
                    break;

                default:
                    System.out.println("Sanoq sistemani tanlang : ");
                    break;
            }
        }

    }


