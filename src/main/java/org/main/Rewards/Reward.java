package org.main.Rewards;

import org.main.Rewards.RewardTypes.SmallReward;
import org.main.Rewards.RewardTypes.BigReward;
import org.main.Rewards.RewardTypes.MediumReward;

import java.util.ArrayList;

public class Reward {
    private ArrayList<String[]> rewards = new ArrayList<>();
    private String description;
    private String price;

    public Reward(int jarCoins) {
        this.availableRewards(jarCoins);
    }

    public Reward(){
        this.rewards = new ArrayList<>();
        this.description = "";
        this.price = "";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList<String[]> getRewards() {
        return new ArrayList<>(this.rewards);
    }

    public void setRewards(ArrayList<String[]> rewards){
        this.rewards = new ArrayList<>(rewards);
    }

    /**
     * availableRewards
     * Method to check which rewards you can win
     * @param jarCoins the amount of JarCoins you won while taking the Quiz
     */
    public void availableRewards(int jarCoins){
        ArrayList<String[]> allRewards = new ArrayList<>();
        if (jarCoins > 0){
            SmallReward smallReward = new SmallReward(jarCoins);
            allRewards.addAll(smallReward.getSmallRewards());
        }
        if (jarCoins > 15){
            MediumReward mediumReward = new MediumReward(jarCoins);
            allRewards.addAll(mediumReward.getMediumRewards());
        }
        if (jarCoins > 35){
            BigReward bigReward = new BigReward(jarCoins);
            allRewards.addAll(bigReward.getBigRewards());
        }
        this.setRewards(allRewards);
    }

    public String rewardType(){
        return "";
    }
}
