package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Rewards;

import java.util.ArrayList;
import java.util.Collections;

public class Technologie extends Rewards implements InputForArrayListInterface {

    private ArrayList<String[]> technologieRewards = new ArrayList<>();

    public Technologie(int jarCoins) {
        super();
        this.setTechnologieRewards(jarCoins);
    }

    public ArrayList<String[]> getTechnologieRewards() {
        return new ArrayList<>(technologieRewards);
    }

    public void setTechnologieRewards(int jarCoins) {
        this.setInputForArrayList(jarCoins);
    }

    @Override
    public void setInputForArrayList(int jarCoins) {
        ArrayList<String[]> allTechnologieRewards = new ArrayList<>();
        Collections.addAll(allTechnologieRewards,
                new String[]{"JBL BOOM Box", "20"},
                new String[]{"TV", "30"},
                new String[]{"E-Scooter", "30"},
                new String[]{"Opel Corsa", "35"},
                new String[]{"Helicopter", "40"},
                new String[]{"F1 Racecar", "40"},
                new String[]{"Private Jet", "45"},
                new String[]{"Yacht", "45"});

        for (String[] technologieReward : allTechnologieRewards){
            if (Integer.parseInt(technologieReward[1]) <= jarCoins){
                technologieRewards.add(technologieReward);
            }
        }

    }
}
