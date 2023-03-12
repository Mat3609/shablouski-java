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


    public void showNumbersMultiplesOf(int number) {
        System.out.println("Числа кратные " + number + ":");
        for (int i = 1; i < 30; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }


    public void checkBracketSequence() {
        System.out.println("Введи последовательность скобок, например: [((())()(())]],\nдля проверки правильности:");
        Stack<String> stack = new Stack<>();
        String bracketSequence = UserInput.inputString();
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
                if (openBracket.equals("[") && charAt.equals("]")) continue;
                if (openBracket.equals("{") && charAt.equals("}")) continue;
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
