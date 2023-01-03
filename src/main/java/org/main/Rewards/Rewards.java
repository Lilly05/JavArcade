package org.main.Rewards;

import java.util.ArrayList;
import java.util.Collections;

public class Rewards {
    private ArrayList<String[]> rewards;

    public Rewards(int money) {
        this.rewards = new ArrayList<>();
        getRewardByPrice(money);

    }

    public ArrayList<String[]> getRewards() {
        return rewards;
    }

    public void setRewards(ArrayList<String[]> rewards) {
        this.rewards = rewards;
    }

    public void getRewardByPrice(int money){
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
