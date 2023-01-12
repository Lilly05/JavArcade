package org.main.Rewards;

import org.main.Colors.ConsoleColors;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelf{
    private ArrayList<Reward> earnedRewards = new ArrayList<>();

    public Shelf(int jarCoins, ArrayList<Reward> rewards) {
        this.drawShelf(rewards, jarCoins);
        this.chooseReward(jarCoins, rewards);
    }

    public ArrayList<Reward> getEarnedRewards() {
        return new ArrayList<>(this.earnedRewards);
    }

    public void setEarnedRewards(ArrayList<Reward> earnedRewards) {
        this.earnedRewards = new ArrayList<>(earnedRewards);
    }

    /**
     * drawShelf
     * Method to draw the shelf to the console
     * @param rewards all the rewards that should be shown on the shelf
     */
    public void drawShelf(ArrayList<Reward> rewards, int jarCoins){
        if (jarCoins == 0){
            badEnding();
        }
        int counter = 1;
        String ShelfBorder = "  _____________________________________________________________________________________________________________________________________________________________________________________";
        System.out.println(ConsoleColors.RESET + ShelfBorder);
        for (Reward reward : rewards) {
            System.out.print(ConsoleColors.RESET + " | " + counter + ") " + ConsoleColors.TEAL + reward.rewardType() + " "  + ConsoleColors.RESET + reward.getDescription() + " " + ConsoleColors.PURPLE + reward.getPrice() + " JarCoins " + ConsoleColors.RESET);
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

    public void fillString(Reward reward, int counter){
        int length = reward.rewardType().length() + reward.getDescription().length() + reward.getPrice().length() + Integer.toString(counter).length() + 17;
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

    public void chooseReward(int jarCoins, ArrayList<Reward> rewardsInventory){
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
        Reward reward = rewardsInventory.get(chosenReward-1);
        earnedRewards.add(reward);
        jarCoins -= Integer.parseInt(reward.getPrice());
        System.out.println(ConsoleColors.RESET + "You chose the following " + reward.rewardType() + " reward: " + reward.getDescription() + " \nYou have " + ConsoleColors.TEAL + jarCoins + " JarCoins " + ConsoleColors.RESET +"left");
        playAgain(jarCoins);
    }

    /**
     * playAgain
     * Method to ask the player if they want to play again
     * @param jarCoins all the jarCoins you have left after choosing a reward
     */
    public void playAgain(int jarCoins){
        Shop shop = new Shop(jarCoins);
        Scanner scanner = new Scanner(System.in);
        if (jarCoins > 0) {
            System.out.println("Do you want to choose more rewards? YES / NO");
            String answer = scanner.next().toUpperCase();
            if (answer.equals("YES")) {
                drawShelf(shop.getRewards(), jarCoins);
                chooseReward(jarCoins, shop.getRewards());
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
    public void goodEnding(ArrayList<Reward> earnedRewards){
        System.out.println(ConsoleColors.TEAL + "You won all those rewards: ");
        for (Reward reward : earnedRewards){
            System.out.println("- " + reward.getDescription());
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
