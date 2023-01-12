package org.main.Rewards.RewardTypes;

import org.main.Rewards.Reward;


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

    /**
     * rewardType
     * Method to define the rewardType (inherited from Reward)
     * @return String (the rewardType)
     */
    @Override
    public String rewardType() {
        return "Small";
    }
}
