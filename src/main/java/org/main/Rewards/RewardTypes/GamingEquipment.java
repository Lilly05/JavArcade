package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Rewards;

import java.util.ArrayList;
import java.util.Collections;

public class GamingEquipment extends Rewards implements InputForArrayListInterface {

    private ArrayList<String[]> gamingEquipmentRewards = new ArrayList<>();

    public GamingEquipment(int jarCoins) {
        super();
        this.setGamingEquipmentRewards(jarCoins);
    }

    public ArrayList<String[]> getGamingEquipmentRewards() {
        return new ArrayList<>(gamingEquipmentRewards);
    }

    public void setGamingEquipmentRewards(int jarCoins) {
        this.setInputForArrayList(jarCoins);
    }

    @Override
    public void setInputForArrayList(int jarCoins) {
        ArrayList<String[]> allGamingEquipmentRewards = new ArrayList<>();
        Collections.addAll(allGamingEquipmentRewards,
                new String[]{"Minecraft MousePad", "10"},
                new String[]{"FIFA Pack", "15"},
                new String[]{"Legendary Fortnite Skin", "15"},
                new String[]{"Razer Headphones", "20"},
                new String[]{"Gaming Mouse", "20"},
                new String[]{"36inch Monitor", "25"},
                new String[]{"Gaming Keyboard", "25"}
        );
        for (String[] gamingEquipment : allGamingEquipmentRewards){
            if (Integer.parseInt(gamingEquipment[1]) <= jarCoins){
                gamingEquipmentRewards.add(gamingEquipment);
            }
        }
    }
}
