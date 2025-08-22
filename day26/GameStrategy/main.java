package PracticeSet.atlaslearnings.day26.GameStrategy;

public class main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setGameStrategy(new EasyLevel());
        game.start();

        game.setGameStrategy(new MediumLevel());
        game.start();

        game.setGameStrategy(new DifficultLevel());
        game.start();
    }
}
