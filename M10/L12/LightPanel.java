public class LightPanel{

    private int[][] panel;
    private int onValue;
    private int offValue;
    
    public LightPanel(int[][] p, int on, int off){
    panel = p;
    onValue = on;
    offValue = off;
    }
    
    public boolean isColumnError(int column){
    //returns true if the column contains 1 or more lights in error
    //returns false if the column has no error lights
    //to be implemented in part a
        for (int i = 0; i < panel.length; i++){
            if (panel[i][column] != onValue && panel[i][column] != offValue){
                return true;
            }
        }
        return false;
    }
    
    public void updateColumn(){
    //shifts a column to replace a column in error
    //to be implemented in part b
        for (int i = 0; i < panel[0].length; i++){
            if (isColumnError(i)){
                int sourceColumn = (i+1) % panel[0].length;// this is so if it's the last column it pulls from the first column
                for (int j = 0; j < panel.length; j++){
                    panel[j][i] = panel[j][sourceColumn];
                }
            }
        }
    }
    //there may be other instance variables, constructors, and methods not shown
    
    }