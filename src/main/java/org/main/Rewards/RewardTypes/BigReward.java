package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Reward;

import java.util.ArrayList;
import java.util.Collections;

public class BigReward extends Reward implements InputForArrayListInterface {

    private ArrayList<String[]> bigRewards = new ArrayList<>();

    public BigReward(int jarCoins) {
        super();
        this.setBigRewards(jarCoins);
    }

    public ArrayList<String[]> getBigRewards() {
        return new ArrayList<>(bigRewards);
    }

    public void setBigRewards(int jarCoins) {
        this.setInputForArrayList(jarCoins);
    }

    @Override
    public void setInputForArrayList(int jarCoins) {
        ArrayList<String[]> allRewards = new ArrayList<>();
        Collections.addAll(allRewards,
                new String[]{"Helicopter", "40"},
                new String[]{"F1 Racecar", "40"},
                new String[]{"Private Jet", "45"},
                new String[]{"Yacht", "45"},
                new String[]{"Star Destroyer in Reallife", "50"},
                new String[]{"Living in Hogwarts", "50"});
        for (String[] reward : allRewards){
            if (Integer.parseInt(reward[1]) <= jarCoins){
                super.setDescription(reward[0]);
                super.setPrice(reward[1]);
                bigRewards.add(new String[]{rewardType(), super.getDescription(), super.getPrice()});
            }
        }
    }

    @Override
    public String rewardType(){
        return "Big";
    }
}
