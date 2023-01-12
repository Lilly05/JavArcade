package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Reward;

import java.util.ArrayList;
import java.util.Collections;

public class SmallReward extends Reward implements InputForArrayListInterface {

    private ArrayList<String[]> smallRewards = new ArrayList<>();

    public SmallReward(int jarCoins) {
        super();
        this.setInputForArrayList(jarCoins);
    }

    public ArrayList<String[]> getSmallRewards() {
        return new ArrayList<>(smallRewards);
    }

    public void setSmallRewards(int jarCoins){
        this.setInputForArrayList(jarCoins);
    }

    @Override
    public void setInputForArrayList(int jarCoins) {
        ArrayList<String[]> allRewards = new ArrayList<>();
        Collections.addAll(allRewards,
                new String[]{"Chocolate", "5"},
                new String[]{"El Toni", "5"},
                new String[]{"Haribo", "5"},
                new String[]{"Shrek T-Shirt", "10"},
                new String[]{"Minecraft MousePad", "10"},
                new String[]{"Avatar Totebag", "10"},
                new String[]{"FIFA Pack", "15"},
                new String[]{"Legendary Fortnite Skin", "15"},
                new String[]{"Minion Plushie", "15"}
        );
        for (String[] reward : allRewards) {
            if (Integer.parseInt(reward[1]) <= jarCoins) {
                this.smallRewards.add(reward);
            }
        }
        super.addRewards(this.getSmallRewards());
    }

    @Override
    public String rewardType(){
        return "Small";
    }
}
