import java.lang.Math;

public class Game {
    //PROPERTIES
    private State state;
    private int wumpusLocation;


    //CONSTRUCTOR
    public Game(State theState){
        this.state = theState;

        this.wumpusLocation = (int) Math.random(0, state.length());
    }

    //METHODS
    
}
