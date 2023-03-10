public class Main {
    public static void main(String[] args) {
        System.out.println("Привет друг! Давай поиграем!");
        SimpleGame simpleGame = new SimpleGame();

        simpleGame.playNumbers();
        System.out.println();
        simpleGame.playNames();
        System.out.println();
        simpleGame.showNumbersMultiplesOfThree();
    }
}
