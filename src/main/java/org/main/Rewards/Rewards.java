package org.main.Rewards;

import org.main.Interface.InputForArrayListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Rewards implements InputForArrayListInterface {
    private ArrayList<String[]> rewards;

    public Rewards(int money) {
        this.rewards = new ArrayList<>();
        this.setRewards(money);
    }

    public ArrayList<String[]> getRewards() {
        return rewards;
    }

    public void setRewards(int money) {
        setInputForArrayList(money);
    }

    /**
     * setInputForArrayList
     * Method of Interface InputForArrayListInterface
     * @param money (in Interface called amount but we changed the name in this usage for more understandable code)
     *              the maximum price a reward can cost
     */

    @Override
    public void setInputForArrayList(int money){
        ArrayList<String[]> allRewards = new ArrayList<>();
        Collections.addAll(allRewards,
                new String[]{"Minion Plushie1", "5"},
                new String[]{"Minion Plushie2", "5"},
                new String[]{"Minion Plushie3", "5"},
                new String[]{"Minion Plushie4", "5"},
                new String[]{"Minion Plushie5", "10"},
                new String[]{"Minion Plushie6", "10"},
                new String[]{"Minion Plushie7", "10"},
                new String[]{"Minion Plushie8", "10"},
                new String[]{"Minion Plushie9", "15"},
                new String[]{"Minion Plushie10", "20"},
                new String[]{"Minion Plushie11", "20"}
        );
        for (String[] reward : allRewards) {
            int price = Integer.parseInt(reward[1]);
            if (price <= money) {
                System.out.println(reward[0]);
                System.out.println(reward[1]);
                this.rewards.add(reward);
            }
        }
    }
}
