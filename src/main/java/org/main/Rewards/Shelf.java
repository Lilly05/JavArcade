package org.main.Rewards;

import org.main.Colors.ConsoleColors;
import org.main.Rewards.RewardTypes.BigReward;
import org.main.Rewards.RewardTypes.MediumReward;
import org.main.Rewards.RewardTypes.SmallReward;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelf{
    Reward reward;
    private ArrayList<String[]> earnedRewards = new ArrayList<>();

    public Shelf(int jarCoins) {
        this.reward = new Reward(jarCoins);
        this.drawShelf(reward.getRewards(), jarCoins);
        this.chooseReward(jarCoins, reward.getRewards());
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
        String ShelfBorder = "  _____________________________________________________________________________________________________________________________________________________________________________________";
        System.out.println(ConsoleColors.RESET + ShelfBorder);
        for (String[] reward : rewards) {
            System.out.print(ConsoleColors.RESET + " | " + counter + ") " + ConsoleColors.TEAL + reward[0] + " "  + ConsoleColors.RESET + reward[1] + " " + ConsoleColors.PURPLE + reward[2] + " JarCoins " + ConsoleColors.RESET);
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
        int length = reward[0].length() + reward[1].length() + reward[2].length() + Integer.toString(counter).length() + 17;
        for (int i = length; i <= 60; i++){
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
        String[] reward = rewardsInventory.get(chosenReward-1);
        earnedRewards.add(reward);
        jarCoins -= Integer.parseInt(reward[2]);
        System.out.println(ConsoleColors.RESET + "You chose the following " + reward[0] + " reward: " + reward[1] + " \nYou have " + jarCoins + " JarCoins left");
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
                this.reward = new Reward(jarCoins);
                drawShelf(this.reward.getRewards(), jarCoins);
                chooseReward(jarCoins, this.reward.getRewards());
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
            System.out.println("- " + reward[1]);
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
