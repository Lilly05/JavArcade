package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Rewards;

import java.util.ArrayList;
import java.util.Collections;

public class Merch extends Rewards implements InputForArrayListInterface {

    private ArrayList<String[]> merchRewards = new ArrayList<>();

    public Merch(int jarCoins) {
        super();
        this.setMerchRewards(jarCoins);
    }

    public ArrayList<String[]> getMerchRewards() {
        return new ArrayList<>(merchRewards);
    }

    public void setMerchRewards(int jarCoins) {
        this.setInputForArrayList(jarCoins);
    }

    @Override
    public void setInputForArrayList(int jarCoins) {
        ArrayList<String[]> allMerchRewards = new ArrayList<>();
        Collections.addAll(allMerchRewards,
                new String[]{"Shrek T-Shirt", "10"},
                new String[]{"Avatar Totebag", "10"},
                new String[]{"Minion Plushie", "15"},
                new String[]{"Life sized figure of Batman", "35"},
                new String[]{"Star Destroyer in Reallife", "50"},
                new String[]{"Living in Hogwarts", "50"}
                );

        for (String[] merchReward : allMerchRewards){
            if (Integer.parseInt(merchReward[1]) <= jarCoins){
                merchRewards.add(merchReward);
            }
        }
    }
}
