public class State {
    //PROPERTIES
    private String[] state;

    //CONSTRUCTORS
    public State(){
        this.state = new String[5];
    }

    public State(int rowcol){
        this.state = new String[rowcol];
    }

    //METHODS
    public String[] getState(){
        return state;
    }
}
