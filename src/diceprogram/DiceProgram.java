// Project: Dice Program
// Author: Referdinand G Balanquit Jr
// Version: 1
// Date: 24/10/2023
package diceprogram;

public class DiceProgram {

    public static void main(String[] args) {
        Dice player1 = new Dice();
        System.out.println(player1.getCurrentShownFace());
        System.out.println(player1.rollDice());
    }
    
}
