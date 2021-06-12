import java.util.Random;

public class Die {
    String mType;
    int numberOfSides;
    int currentSideUp;

    // 0 argument constructor
    public Die() {
        System.out.println("Creating a default d6...");
        this.mType = "d6";
        this.numberOfSides = 6;
        this.currentSideUp = generateRandomNumber(this.numberOfSides);
    }
    //1 arguemnt constructor
    public Die(int numOfSides) {
        System.out.println("Creating a d"+ numOfSides + "...");
        this.mType = "d" + numOfSides;
        this.numberOfSides = numOfSides;
        this.currentSideUp = generateRandomNumber(this.numberOfSides);

    }
    // 2 argument constructor
    public Die(String type, int numOfSides) {
        System.out.println("Creating a " + type + " die (a special d" + numOfSides + ")...");
        this.mType = type;
        this.numberOfSides = numOfSides;
        this.currentSideUp = generateRandomNumber(this.numberOfSides);
    }
    // Math function to generate the random numbers
    public int generateRandomNumber(int max) {
        // define the range
        int min = 1;
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
    // If user want to change the number of sides
    public void changeTheNumberOFSides(int numOfSides) {
        this.numberOfSides = numOfSides;
    }

    public void changeTheNumberOFSides(String type, int numOfSides) {
        this.mType = type;
        this.numberOfSides = numOfSides;
    }

    public void roll() {
        System.out.println("Rolling the " + this.mType + "...");
        this.currentSideUp = generateRandomNumber(this.numberOfSides);
        printCurrentValue(true);
    }
    // If statement to display the rolling value of the dices
    public void printCurrentValue(boolean isNew) {
        if(isNew) {
            if(this.currentSideUp == this.numberOfSides) {
                System.out.println("YAY! It's a " + this.currentSideUp);
            }
            else {
                System.out.println("The new value is " + this.currentSideUp);
            }
        }
        else {
            System.out.println("The current side up for " + this.mType + " is " + this.currentSideUp);
        }
    }
    // To get the bonus value
    public void rollWithoutPrint() {
        this.currentSideUp = generateRandomNumber(this.numberOfSides);
    }
    // To get the highest value
    public void setHighestValueDice() {
        System.out.println("\nSetting the " + this.mType + " to show " + this.numberOfSides + "...");
        this.currentSideUp = this.numberOfSides;
        System.out.println("The side up is now " + this.currentSideUp + ". Finally.");
    }
}
