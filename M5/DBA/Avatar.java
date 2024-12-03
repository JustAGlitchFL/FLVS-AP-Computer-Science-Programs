package M5.DBA;
/**
 * DBA Assignment   
 *
 * @author (Roshan Patel)
 * @version (11/26/2024)
 */
public class Avatar
{
//to be implemented in Part A
//declare instance variables for Avatar name and score
private int level;
private String name;

/**
* pre-condition: constructor level parameter >= 0
*/

//create the constructor with parameters
    public Avatar(String name, int level){
    this.name = name; 
    this.level = level;
    
    }
    
    //setter & getter methods for each instance variable
    
    public void setName(String name){
        this.name = name;
        ;
        
    }
    public String getName(){
        return this.name;   
    }
    public void updateLevel( int Increase_Level){
        if ((this.level + Increase_Level) > 0 ){
        this.level += Increase_Level;
        }
        else {
        this.level = 0; 
        }
    }
        
           
    
    public int getLevel(){
        return this.level; 
    }
    
    
    
        
    }
    


/**
* pre-condition: constructor level parameter >= 0
*/


