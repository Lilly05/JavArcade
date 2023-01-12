package org.main.Rewards.RewardTypes;

import org.main.Rewards.Reward;

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

    /**
     * rewardType
     * Method to define the rewardType (inherited from Reward)
     * @return String (the rewardType)
     */
    @Override
    public String rewardType() {
        return "Big";
    }

}
