import java.util.Stack;


public class SimpleGame {
    private final String answer = "Вячеслав";


    public void playNumbers() {
        System.out.println("Попробуй ввести любое число!");

        while (UserInput.inputInt() <= 7) {
            System.out.println("Попробуй снова!");
        }
        System.out.println("Привет!");
    }


    public void playNames() {
        System.out.println("Попробуй угадать загаданное имя!");

        for (int i = 8; i > 0; i--) {

            if (UserInput.inputString().equals(answer)) {
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
        String[] userInput = UserInput.inputString().split(" ");
        int[] numbers = new int[userInput.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(userInput[i]);
        }

        System.out.println("Числа кратные 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }



    public void checkBracketSequence() {
        System.out.println("Введи последовательность скобок, например: [((())()(())]],\nдля проверки правильности последовательности:");
        Stack<String> stack = new Stack<>();
        String bracketSequence = UserInput.inputString();
        String bracket;
        boolean isGood = true;

        for (int i = 0; i < bracketSequence.length(); i++) {
            bracket = (String.valueOf(bracketSequence.charAt(i)));

            if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{")) {
                stack.add(bracket);
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
        }
        if (isGood && stack.isEmpty()) {
            System.out.println("Корректная последовательность!");
        } else
            System.out.println("Некорректная последовательность!");

        System.out.println("Спасибо за участие!");
    }
}
