package org.main.Rewards;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelf {
    private Rewards rewards;
    private ArrayList<String[]> earnedRewards = new ArrayList<>();

    public Shelf(int money) {
        this.rewards = new Rewards(money);
    }

    public ArrayList<String[]> getRewards() {
        return rewards.getRewards();
    }

    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }

    public void drawShelf(ArrayList<String[]> rewards){
        if (rewards.size() == 0){
            badEnding();
        }
        int counter = 1;
        String ShelfBorder = "  ____________________________________________________________________________________________________________________________________________________";
        System.out.println(ShelfBorder);
        for (String[] reward : rewards) {
            System.out.print(" | " + counter + ") " + reward[0] + " " + reward[1] + " JarCoins ");
            fillString(reward, counter);
            if (counter % 3 == 0) {
                System.out.print("|\n");
            }
            counter++;
        }
        System.out.println("\n" + ShelfBorder);
    }

    public void fillString(String[] reward, int counter){
        int length = reward[0].length() + reward[1].length() + Integer.toString(counter).length() + 17;
        for (int i = length; i <= 50; i++){
            System.out.print(" ");
        }
    }

    public void chooseReward(int jarCoins, ArrayList<String[]> rewardsInventory){
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("\nCongratulations! You earned " + jarCoins + " JarCoins! \nChoose a reward! To do so, just enter the number of the reward");
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > 0 && input <= rewardsInventory.size()) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and " + rewardsInventory.size());
                }
            } else {
                System.out.println("Please enter the number of the reward");
                scanner.next();
            }
        }
        int chosenReward = input;
        String[] reward = rewardsInventory.get(chosenReward - 1);
        earnedRewards.add(reward);
        jarCoins -= Integer.parseInt(reward[1]);
        System.out.println("You chose the following reward: " + reward[0] + " \nYou have " + jarCoins + " JarCoins left");
        if (jarCoins > 0) {
            System.out.println("Do you want to choose more rewards? YES / NO");
            String answer = scanner.next().toUpperCase();
            if (answer.equals("YES")) {
                this.rewards.setInputForArrayList(jarCoins);
                drawShelf(this.rewards.getRewards());
                chooseReward(jarCoins, this.rewards.getRewards());
            } else {
                goodEnding(earnedRewards);
            }
        } else {
            goodEnding(earnedRewards);
        }
    }

    public void goodEnding(ArrayList<String[]> earnedRewards){
        System.out.println("You won all those rewards: ");
        for (String[] reward : earnedRewards){
            System.out.println("- " + reward[0]);
        }
        System.out.println("Thanks for playing!");
    }

    public void badEnding(){
        System.out.println("Game over! You earned 0 JarCoins.");
        System.exit(0);
    }
}
