// Project: Dice Program
// Author: Referdinand G Balanquit Jr
// Version: 1
// Date: 24/10/2023
package diceprogram;
import java.util.concurrent.ThreadLocalRandom; // importing current java library

public class Dice {
    
    // Creating Instance variables
    private int noOfFaces = 6;
    private int  currentShownFace = 1;
    
    
    // Method
    
    public int rollDice(){  
        currentShownFace = ThreadLocalRandom.current().nextInt(1, noOfFaces+1); // generate a random number between 1 - 6
        return currentShownFace;
    }
    
    // Getters and Setters
    public void setNumberOfFaces(int noOfFaces) {
        this.noOfFaces = noOfFaces;
    }
    
    public int getNumberOfFaces(){
        return noOfFaces;
    }
    
    public int getCurrentShownFace(){
        return currentShownFace;
    }
            
}
