import java.util.Scanner;

public class SimpleGame {
    private Scanner scanner;
    private final String answer = "Вячеслав";
    private String currentName;
    private final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


    public void playNumbers() {
        scanner = new Scanner(System.in);
        System.out.println("Попробуй ввести любое число!");

        while (scanner.nextInt() <= 7) {
            System.out.println("Попробуй снова!");
        }
        System.out.println("Привет!");
    }


    public void playNames() {
        scanner = new Scanner(System.in, "ibm866");
        System.out.println("Попробуй угадать загаданное имя!");

        for (int i = 8; i > 0; i--) {
            currentName = scanner.nextLine();

            if (currentName.equals(answer)) {
                System.out.println("Привет, Вячеслав!");
                break;
            }

            if (i == 1){
                System.out.println("Коенец игры!");
                break;
            }
            System.out.println("Нет такого имени!");
            System.out.println("У тебя осталось " + (i - 1) + " попыток!");
        }
    }


    public void showNumbersMultiplesOfThree() {
        System.out.println("Числа кратные трем:");
        for (int n : numbers) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
    }

}
