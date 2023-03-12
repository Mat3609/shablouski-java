import java.util.Scanner;

public class UserInput {
    private static Scanner scanner;

    public static int inputInt() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String inputString() {
        scanner = new Scanner(System.in, "ibm866");
        return scanner.nextLine();
    }
}
