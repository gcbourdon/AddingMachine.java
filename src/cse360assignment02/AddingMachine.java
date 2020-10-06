/*
   Name: Griffin Bourdon
   ASU Email Address: gbourdon@asu.edu
   Lecture Time: Th 9:00am-10:15am
   GitHub Repo URL: https://github.com/gcbourdon/AddingMachine.java.git
   Description: This class creates an object which can
   add or subtract values and keep a history of all values passed in. These values
   can then be printed to the screen using the toString method.
*/

package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history = "0";

    public static void main(String[] args) {
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        System.out.println(myCalculator.toString());
    }

    //Constructor for the AddingMachine class.
    public AddingMachine() {
        total = 0;
    }

    //Returns the total.
    public int getTotal() {
        return total;
    }

    //Adds the value passed in to the total and updates the history String.
    public void add (int value) {
        total += value;
        history = history + " + " +  value;
    }

    //Subtracts the value passed in from the total and updates the history String.
    public void subtract(int value) {
        total -= value;
        history = history + " - " + value;
    }

    //Returns the history String.
    public String toString() {
        return history;
    }

    //Resets the total and history variables.
    public void clear() {
        total = 0;
        history = "0";
    }
}
