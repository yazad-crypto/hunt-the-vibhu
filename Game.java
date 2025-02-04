import java.util.Random;


public class Game {
    //PROPERTIES
    private State state;
    private int wumpusLocation;


    //CONSTRUCTOR
    public Game(State theState){
        this.state = theState;

        Random random = new Random();
        wumpusLocation = random.nextInt(0, (state.getRowCol() * state.getRowCol()));
        

        //please
    }

    //METHODS
    
}
