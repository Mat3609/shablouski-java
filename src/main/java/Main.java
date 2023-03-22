public class Main {
    public static void main(String[] args) {
        if (args.length != 0) UserInput.encoding = args[0];

        System.out.println("Привет друг! Давай поиграем!");
        SimpleGame simpleGame = new SimpleGame();

        simpleGame.playNumbers();
        System.out.println();

        simpleGame.playNames();
        System.out.println();

        simpleGame.showNumbersMultiplesOfThree();
        System.out.println();
        simpleGame.checkBracketSequence();



    }
}
