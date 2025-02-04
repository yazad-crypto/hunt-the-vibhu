public class State {
    //PROPERTIES
    private String[][] state;
    private int rowcol;

    //CONSTRUCTORS
    public State(){
        this.state = new String[5][5];
        this.rowcol = 5;
        //type cmon
    }

    public State(int rowcol){
        this.state = new String[rowcol][rowcol];
    }

    //METHODS
    public String[][] getState(){
        return state;
    }

    public int getRowCol(){
        return rowcol;
    }
}
