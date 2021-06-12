/* This code is written for a DiceGame,
1. Creating different size dices.
2. Displaying the results by rolling dices.
3. Displaying the highest value by choosing a dice.
4. Rolling each Die in a loop until you getting  5 of a kind to Count and display
the number of rolls.

Student Informations,
Name - Uditha Lenora
Student ID - A00235273
*/

import java.util.ArrayList;
import java.util.List;

public class DiceGame {

    public static void main(String[] args) {

        //argument 0
        Die dieOne = new Die();

        //argument 1
        Die dieTwo = new Die(20);

        //argument 2
        Die dieThree = new Die("Percentile", 10);

        //printing the current value of the dices
        dieOne.printCurrentValue(false);
        dieTwo.printCurrentValue(false);
        dieThree.printCurrentValue(false);

        //roll the dices
        System.out.println("\nTesting the roll method \n");
        dieOne.roll();
        dieTwo.roll();
        dieThree.roll();

        //set highest Value of the dice
        dieTwo.setHighestValueDice();

        //BONUS values printing
        System.out.println("\n-----");
        System.out.println("BONUS");
        System.out.println("-----");

        int dieSize = 5;
        Die dieBonus = new Die(dieSize);
        List<Integer> castValues = new ArrayList<>();
        int noOfLoops = 0;
        //Roll each Die in a loop until you get 5.
        do{
            dieBonus.rollWithoutPrint();
            noOfLoops+=1;
            if(!castValues.contains(dieBonus.currentSideUp)) {
                castValues.add(dieBonus.currentSideUp);
            }
        }while(castValues.size() < dieSize);
        System.out.println("YAHTZEE! It took " + noOfLoops + " rolls ");
    }
  }
