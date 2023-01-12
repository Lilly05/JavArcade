package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Reward;

import java.util.ArrayList;
import java.util.Collections;

public class MediumReward extends Reward implements InputForArrayListInterface {

    private ArrayList<String[]> mediumRewards = new ArrayList<>();

    public MediumReward(int jarCoins) {
        super();
        this.setMediumRewards(jarCoins);
    }

    public ArrayList<String[]> getMediumRewards() {
        return new ArrayList<>(mediumRewards);
    }

    public void setMediumRewards(int jarCoins) {
        this.setInputForArrayList(jarCoins);
    }

    @Override
    public void setInputForArrayList(int jarCoins) {
        ArrayList<String[]> allTechnologieRewards = new ArrayList<>();
        Collections.addAll(allTechnologieRewards,
                new String[]{"JBL BOOM Box", "20"},
                new String[]{"Razer Headphones", "20"},
                new String[]{"Gaming Mouse", "20"},
                new String[]{"36inch Monitor", "25"},
                new String[]{"Gaming Keyboard", "25"},
                new String[]{"TV", "30"},
                new String[]{"E-Scooter", "30"},
                new String[]{"Opel Corsa", "35"},
                new String[]{"Life sized figure of Batman", "35"});
        for (String[] technologieReward : allTechnologieRewards){
            if (Integer.parseInt(technologieReward[1]) <= jarCoins){
                mediumRewards.add(technologieReward);
            }
        }

    }
}
