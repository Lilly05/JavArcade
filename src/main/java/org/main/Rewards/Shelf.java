package org.main.Rewards;

public class Shelf {
    private Rewards rewards;

    public Shelf(int money) {
        this.rewards = new Rewards(money);
    }

    public Rewards getRewards() {
        return rewards;
    }

    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }
}
