package org.main.Rewards.RewardTypes;

import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Reward;

import java.util.ArrayList;
import java.util.Collections;

public class SmallReward extends Reward {

    public SmallReward(String description, String price){
        super(description, price);
    }

    public String[] getSmallReward(){
        return new String[]{rewardType(), super.getDescription(), super.getPrice()};
    }

    public void setSmallReward(String description, String price){
        super.setDescription(description);
        super.setPrice(price);
    }

    @Override
    public String rewardType() {
        return "Small";
    }
}
