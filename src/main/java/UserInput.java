import java.util.Scanner;

public class UserInput {
    private static Scanner scanner;
    static String encoding = System.getProperty("encoding");


    public static int inputInt() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String inputString() {
        if (encoding != null) {
            scanner = new Scanner(System.in, encoding);
            return scanner.nextLine();
        }
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
