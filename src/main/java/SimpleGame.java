import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;


public class SimpleGame {
    private final String answer = "ВЯЧЕСЛАВ";


    public void playNumbers() {
        System.out.println("Попробуй ввести любое целое число!");
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некорректное значение!");
                scanner.next();
            }
                number = scanner.nextInt();

            if (number <= 7) {
                System.out.println("Попробуй снова!");
            }

        } while (number <= 7);
        System.out.println("Привет!");
    }


    public void playNames() {
        System.out.println("Попробуй угадать загаданное имя!");

        for (int i = 8; i > 0; i--) {

            if (UserInput.inputString().toUpperCase(Locale.ROOT).equals(answer)) {
                System.out.println("Ты угадал!");
                System.out.println("Привет, Вячеслав!");
                break;
            }
            if (i == 1){
                System.out.println("Нет такого имени!");
                System.out.println("Коенец игры!");
                break;
            }
            System.out.println("Нет такого имени!");
            System.out.println("У тебя осталось " + (i - 1) + " попыток!");
        }
    }


    public void showNumbersMultiplesOfThree() {
        System.out.println("Введи несколько чисел через пробел,\nчтобы узнать числа кратные трем:");
        String[] userInput;
        int[] numbers;
        int flag;

        do {
            flag = 0;
            userInput = UserInput.inputString().split(" ");
            numbers = new int[userInput.length];

            for (int i = 0; i < numbers.length; i++) {
                try {
                    numbers[i] = Integer.parseInt(userInput[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели некорректное значение!\nПопробуйте снова!");
                    break;
                }
                flag++;
            }

        } while (flag != userInput.length);

        System.out.println("Числа кратные 3:");
        for (int number : numbers) {

            if (number % 3 == 0 && number != 0) {
                System.out.println(number);
            }
        }
    }


    public void checkBracketSequence() {
        System.out.println("Введи последовательность скобок, например: [((())()(())]],\nдля проверки правильности последовательности:");
        Stack<String> stack;
        String bracket = "";
        String bracketSequence;
        boolean isGood;
        boolean flag = true;

        do {
            bracketSequence = UserInput.inputString();
            stack = new Stack<>();
            isGood = true;

            for (int i = 0; i < bracketSequence.length(); i++) {
                bracket = (String.valueOf(bracketSequence.charAt(i)));

                if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{")) {
                    stack.add(bracket);
                    System.out.println(stack);
                }
                else if (bracket.equals(")") || bracket.equals("]")  || bracket.equals("}")) {
                    if (stack.isEmpty()) {
                        isGood = false;
                        break;
                    }
                    String openBracket = stack.pop();
                    if (openBracket.equals("(") && bracket.equals(")")) continue;
                    if (openBracket.equals("[") && bracket.equals("]")) continue;
                    if (openBracket.equals("{") && bracket.equals("}")) continue;
                    isGood = false;
                }
                else isGood = false;
            }

            if (isGood && stack.isEmpty()) {
                System.out.println("Корректная последовательность!");
                flag = false;
            } else
                System.out.println("Некорректная последовательность!\nПопробуй еще раз!");
        } while (flag);


        System.out.println("Спасибо за участие!");
    }
}
