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
    }

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

    public ArrayList<String[]> getRewards() {
        return new ArrayList<>(this.rewards);
    }

    public void setRewards(ArrayList<String[]> rewards){
        this.rewards = new ArrayList<>(rewards);
    }

    public void addRewards(ArrayList<String[]> rewards){
        this.rewards.addAll(rewards);
    }

    public String rewardType(){
        return "";
    }
}
