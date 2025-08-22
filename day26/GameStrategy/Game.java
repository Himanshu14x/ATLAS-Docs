package PracticeSet.atlaslearnings.day26.GameStrategy;

public class Game {
    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy){
        this.gameStrategy = gameStrategy;
    }

    public void start(){
        if(gameStrategy==null){
            System.out.println("Select a game level");
        } else{
            gameStrategy.play();
        }
    }
}
