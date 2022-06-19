import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for (int i = 0; i< n; i++) {

            String num = s.nextLine();

            try {
                long longNumber = Long.parseLong(num);
                System.out.println(num + " can be fitted in:");

                if (Byte.MIN_VALUE <= longNumber && longNumber <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (Short.MIN_VALUE <= longNumber && longNumber <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (Integer.MIN_VALUE <= longNumber && longNumber <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(num + " can't be fitted anywhere.");

            }
        }
    }
}

