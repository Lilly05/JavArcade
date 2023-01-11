package org.main.Rewards;

import org.main.Colors.ConsoleColors;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Shelf{
    private Rewards rewards;
    private ArrayList<String[]> earnedRewards = new ArrayList<>();

    public Shelf(int jarCoins) {
        this.rewards = new Rewards(jarCoins);
        this.drawShelf(rewards.getRewards(), jarCoins);
        this.chooseReward(jarCoins, rewards.getRewards());
    }

    public ArrayList<String[]> getRewards() {
        return this.rewards.getRewards();
    }

    public void setRewards() {
        this.rewards.setRewards();
    }

    public ArrayList<String[]> getEarnedRewards() {
        return new ArrayList<>(this.earnedRewards);
    }

    public void setEarnedRewards(ArrayList<String[]> earnedRewards) {
        this.earnedRewards = new ArrayList<>(earnedRewards);
    }

    /**
     * drawShelf
     * Method to draw the shelf to the console
     * @param rewards all the rewards that should be shown on the shelf
     */
    public void drawShelf(ArrayList<String[]> rewards, int jarCoins){
        if (jarCoins == 0){
            badEnding();
        }
        int counter = 1;
        String ShelfBorder = "  ____________________________________________________________________________________________________________________________________________________";
        System.out.println(ConsoleColors.RESET + ShelfBorder);
        for (String[] reward : rewards) {
            System.out.print(ConsoleColors.RESET + " | " + counter + ") " + reward[0] + " " + ConsoleColors.PURPLE + reward[1] + " JarCoins " + ConsoleColors.RESET);
            fillString(reward, counter);
            if (counter % 3 == 0) {
                System.out.print("|\n");
            }
            counter++;
        }
        System.out.println("\n" + ShelfBorder);
    }

    /**
     * fillString
     * Method to make each box of the shelf the same size for a prettier look
     * @param reward the reward that's in the box
     * @param counter the number that's shown in front of the reward
     */

    public void fillString(String[] reward, int counter){
        int length = reward[0].length() + reward[1].length() + Integer.toString(counter).length() + 17;
        for (int i = length; i <= 50; i++){
            System.out.print(" ");
        }
    }

    /**
     * chooseReward
     * Method to choose the reward you would like to win
     * @param jarCoins the amount of jarCoins you won while playing the quiz
     * @param rewardsInventory all the rewards you could win according to the amount of JarCoins you got
     */

    public void chooseReward(int jarCoins, ArrayList<String[]> rewardsInventory){
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println(ConsoleColors.PURPLE + "\nYou have " + jarCoins + " JarCoins! \nChoose a reward! To do so, just enter the number of the reward");
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > 0 && input <= rewardsInventory.size()) {
                    break;
                } else {
                    System.out.println(ConsoleColors.RED + "Please enter a number between 1 and " + rewardsInventory.size());
                }
            } else {
                System.out.println(ConsoleColors.RED + "Please enter the number of the reward");
                scanner.next();
            }
        }
        int chosenReward = input;
        String[] reward = rewardsInventory.get(chosenReward - 1);
        earnedRewards.add(reward);
        jarCoins -= Integer.parseInt(reward[1]);
        System.out.println(ConsoleColors.RESET + "You chose the following reward: " + reward[0] + " \nYou have " + jarCoins + " JarCoins left");
        playAgain(jarCoins);
    }

    /**
     * playAgain
     * Method to ask the player if they want to play again
     * @param jarCoins all the jarCoins you have left after choosing a reward
     */
    public void playAgain(int jarCoins){
        Scanner scanner = new Scanner(System.in);
        if (jarCoins > 0) {
            System.out.println("Do you want to choose more rewards? YES / NO");
            String answer = scanner.next().toUpperCase();
            if (answer.equals("YES")) {
                this.rewards = new Rewards(jarCoins);
                drawShelf(this.rewards.getRewards(), jarCoins);
                chooseReward(jarCoins, this.rewards.getRewards());
            } else {
                goodEnding(earnedRewards);
            }
        } else {
            goodEnding(earnedRewards);
        }
    }

    /**
     * goodEnding
     * Method to end the game in a good way
     * @param earnedRewards all the rewards you won while playing
     */
    public void goodEnding(ArrayList<String[]> earnedRewards){
        System.out.println(ConsoleColors.TEAL + "You won all those rewards: ");
        for (String[] reward : earnedRewards){
            System.out.println("- " + reward[0]);
        }
        System.out.println("Thanks for playing!");
    }

    /**
     * badEnding
     * Method to end the game in a bad way when you won 0 jarCoins while playing the quiz
     */
    public void badEnding(){
        System.out.println(ConsoleColors.RED + "Game over! You earned 0 JarCoins.");
        System.exit(0);
    }
}
