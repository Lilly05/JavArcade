package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Reward;

import java.util.ArrayList;
import java.util.Collections;

public class BigReward extends Reward {
    public BigReward(String description, String price){
        super(description, price);
    }

    public String[] getBigReward(){
        return new String[]{rewardType(), super.getDescription(), super.getPrice()};
    }

    public void setBigReward(String description, String price){
        super.setDescription(description);
        super.setPrice(price);
    }

    @Override
    public String rewardType() {
        return "Big";
    }

}
