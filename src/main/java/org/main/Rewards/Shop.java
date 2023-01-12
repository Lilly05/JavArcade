package org.main.Rewards;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.RewardTypes.BigReward;
import org.main.Rewards.RewardTypes.MediumReward;
import org.main.Rewards.RewardTypes.SmallReward;

import java.util.ArrayList;

public class Shop implements InputForArrayListInterface {

    private ArrayList<Reward> rewards = new ArrayList<>();

    public Shop(int jarCoins){
        this.setRewards(jarCoins);
    }

    public ArrayList<Reward> getRewards() {
        return new ArrayList<>(rewards);
    }

    public void setRewards(int jarCoins) {
        this.setInputForArrayList(jarCoins);
    }
    @Override
    public void setInputForArrayList(int jarCoins){
        rewards.add(new SmallReward("Chocolate", "5"));
        rewards.add(new SmallReward("El Toni", "5"));
        rewards.add(new SmallReward("Haribo", "5"));
        rewards.add(new SmallReward("Shrek T-Shirt", "10"));
        rewards.add(new SmallReward("Minecraft Mouse Pad", "10"));
        rewards.add(new SmallReward("Avatar Totebag", "10"));
        rewards.add(new SmallReward("Legendary Fortnite Skin", "15"));
        rewards.add(new SmallReward("Minion Plushie", "15"));
        rewards.add(new SmallReward("Harry Potter Backpack", "15"));
        rewards.add(new MediumReward("JBL BOOM Box", "20"));
        rewards.add(new MediumReward("Razer Headphones", "20"));
        rewards.add(new MediumReward("Gaming Mouse", "20"));
        rewards.add(new MediumReward("36inch Monitor", "25"));
        rewards.add(new MediumReward("Gaming Keyboard", "25"));
        rewards.add(new MediumReward("TV", "30"));
        rewards.add(new MediumReward("E-Scooter", "30"));
        rewards.add(new MediumReward("Opel Corsa", "35"));
        rewards.add(new MediumReward("Life sized figure of Batman", "35"));
        rewards.add(new BigReward("Helicopter", "40"));
        rewards.add(new BigReward("F1 Racecar", "40"));
        rewards.add(new BigReward("Private Jet", "45"));
        rewards.add(new BigReward("Yacht", "45"));
        rewards.add(new BigReward("Star Destroyer in Reallife", "50"));
        rewards.add(new BigReward("Living in Hogwarts", "50"));

        for (int i = 0; i < rewards.size(); i++){
            if (jarCoins < Integer.parseInt(rewards.get(i).getPrice())){
                rewards.remove(i);
                i--;
            }
        }
    }
}

