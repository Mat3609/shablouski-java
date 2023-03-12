public class Main {
    public static void main(String[] args) {
        System.out.println("Привет друг! Давай поиграем!");
        SimpleGame simpleGame = new SimpleGame();

        simpleGame.playNumbers();
        System.out.println();
        simpleGame.playNames();
        System.out.println();
        System.out.println("Введи число и узнай числа кратные ему:");
        simpleGame.showNumbersMultiplesOf(UserInput.inputInt());
        System.out.println();
        simpleGame.checkBracketSequence();
    }
}
