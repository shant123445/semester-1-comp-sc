/* 
*/
package pkg;

public class potato{
    
    // Global Variable
    
    String color;
    boolean isEdibile;
    String type;
    double mass;
    //Constructor
    
    public potato(){
        color = "Brown";
        isEdibile = true;
        type = "French Fry";
        mass = 178.5;
        
    }
    public potato(String c, String t, double m){
        color = c;
        isEdibile = false;
        type = t;
        mass = m;
    }
    public boolean getEdibility(){
        return isEdibile;
    }
    public void eatpotato(){
        mass = 0;
    }
}