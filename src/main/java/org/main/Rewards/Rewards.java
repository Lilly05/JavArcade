package org.main.Rewards;

import org.main.Interface.InputForArrayListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Rewards implements InputForArrayListInterface {
    private ArrayList<String[]> rewards = new ArrayList<>();

    public Rewards(int jarCoins) {
        this.setRewards(jarCoins);
    }

    public Rewards(){
        this.setRewards(0); // per default no rewards can be won
    }

    public ArrayList<String[]> getRewards() {
        return new ArrayList<>(this.rewards);
    }

    public void setRewards(int jarCoins) {
        setInputForArrayList(jarCoins);
    }

    /**
     * setInputForArrayList
     * Method of Interface InputForArrayListInterface
     * @param jarCoins (in Interface called amount but we changed the name in this usage for more understandable code)
     *              the maximum price a reward can cost
     */

    @Override
    public void setInputForArrayList(int jarCoins){
        this.rewards = new ArrayList<>();
        ArrayList<String[]> allRewards = new ArrayList<>();
        Collections.addAll(allRewards,
                new String[]{"Pencil", "5"},
                new String[]{"El Toni", "5"},
                new String[]{"Haribo", "5"},
                new String[]{"Minecraft MousePad", "10"},
                new String[]{"Shrek T-Shirt", "10"},
                new String[]{"Totebag", "10"},
                new String[]{"Minion Plushie", "15"},
                new String[]{"FIFA Pack", "15"},
                new String[]{"Legendary Fortnite Skin", "15"},
                new String[]{"Razer Headphones", "20"},
                new String[]{"JBL BOOM Box", "20"},
                new String[]{"Gaming Mouse", "20"},
                new String[]{"36inch Monitor", "25"},
                new String[]{"Gaming Keyboard", "25"},
                new String[]{"TV", "30"},
                new String[]{"E-Scooter", "30"},
                new String[]{"Opel Corsa", "35"},
                new String[]{"Gold Bar", "35"},
                new String[]{"Helicopter", "40"},
                new String[]{"F1 Racecar", "40"},
                new String[]{"Private Jet", "45"},
                new String[]{"Yacht", "45"},
                new String[]{"Star Destroyer in Reallife", "50"},
                new String[]{"Living in Hogwarts", "50"}
        );
        for (String[] reward : allRewards) {
            int price = Integer.parseInt(reward[1]);
            if (price <= jarCoins) {

                this.rewards.add(reward);
            }
        }
    }
}
