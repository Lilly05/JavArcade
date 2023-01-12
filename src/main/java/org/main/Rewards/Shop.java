package org.main.Rewards;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.RewardTypes.BigReward;
import org.main.Rewards.RewardTypes.MediumReward;
import org.main.Rewards.RewardTypes.SmallReward;

import java.util.ArrayList;
import java.util.Collections;

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

    /**
     * setInputForArrayList
     * Method of Interface InputForArrayListInterface
     * @param jarCoins the amount of jarCoins the player was able to get while taking the quiz
     *                 In the interface the parameter is called amount but we renamed it here to jarCoins for better understanding
     */
    @Override
    public void setInputForArrayList(int jarCoins){
        Collections.addAll(rewards,
                new SmallReward("Chocolate", "5"),
                new SmallReward("El Toni", "5"),
                new SmallReward("Haribo", "5"),
                new SmallReward("Shrek T-Shirt", "10"),
                new SmallReward("Minecraft Mouse Pad", "10"),
                new SmallReward("Avatar Totebag", "10"),
                new SmallReward("Legendary Fortnite Skin", "15"),
                new SmallReward("Minion Plushie", "15"),
                new SmallReward("Harry Potter Backpack", "15"),
                new MediumReward("JBL BOOM Box", "20"),
                new MediumReward("Razer Headphones", "20"),
                new MediumReward("Gaming Mouse", "20"),
                new MediumReward("36inch Monitor", "25"),
                new MediumReward("Gaming Keyboard", "25"),
                new MediumReward("TV", "30"),
                new MediumReward("E-Scooter", "30"),
                new MediumReward("Opel Corsa", "35"),
                new MediumReward("Life sized figure of Batman", "35"),
                new BigReward("Helicopter", "40"),
                new BigReward("F1 Racecar", "40"),
                new BigReward("Private Jet", "45"),
                new BigReward("Yacht", "45"),
                new BigReward("Star Destroyer in Reallife", "50"),
                new BigReward("Living in Hogwarts", "50")
        );

        for (int i = 0; i < rewards.size(); i++){
            if (jarCoins < Integer.parseInt(rewards.get(i).getPrice())){
                rewards.remove(i);
                i--;
            }
        }
    }
}

