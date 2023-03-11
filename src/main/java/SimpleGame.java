import java.util.Scanner;
import java.util.Stack;

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


    public void checkBracketSequence() {
        System.out.println("Введи последовательность скобок, например: [((())()(())]],\nдля проверки правильности:");
        scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String bracketSequence = scanner.nextLine();
        String charAt;
        boolean isGood = true;

        for (int i = 0; i < bracketSequence.length(); i++) {
            charAt = (String.valueOf(bracketSequence.charAt(i)));

            if (charAt.equals("(") || charAt.equals("[") || charAt.equals("{")) {
                stack.add(charAt);
            }
            else if (charAt.equals(")") || charAt.equals("]")  || charAt.equals("}")) {
                if (stack.isEmpty()) {
                    isGood = false;
                    break;
                }
                String openBracket = stack.pop();
                if (openBracket.equals("(") && charAt.equals(")")) continue;
                if (openBracket.equals("[") && charAt.equals("]") ) continue;
                if (openBracket.equals("{") && charAt.equals("}")) continue;
                isGood = false;
            }
        }
        if (isGood && stack.size() == 0) {
            System.out.println("Корректноя последовательность!");
        } else
            System.out.println("Некорректноя последовательность!");

        System.out.println("Спасибо за участие!");
    }
}
