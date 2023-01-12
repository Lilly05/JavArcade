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
        ArrayList<String[]> allMerchRewards = new ArrayList<>();
        Collections.addAll(allMerchRewards,
                new String[]{"Helicopter", "40"},
                new String[]{"F1 Racecar", "40"},
                new String[]{"Private Jet", "45"},
                new String[]{"Yacht", "45"},
                new String[]{"Star Destroyer in Reallife", "50"},
                new String[]{"Living in Hogwarts", "50"});
        for (String[] merchReward : allMerchRewards){
            if (Integer.parseInt(merchReward[1]) <= jarCoins){
                bigRewards.add(merchReward);
            }
        }
    }
}
