package org.main.Rewards;

import org.main.Rewards.RewardTypes.SmallReward;
import org.main.Rewards.RewardTypes.BigReward;
import org.main.Rewards.RewardTypes.MediumReward;

import java.util.ArrayList;

public abstract class Reward {
    private String description;
    private String price;

    public Reward(String description, String price) {
        this.setDescription(description);
        this.setPrice(price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * rewardType
     * An abstract method each subclass has to use to define it's rewardType
     * @return String (the rewardType)
     */

    public abstract String rewardType();
}
