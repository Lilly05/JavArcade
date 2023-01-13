package org.main.Shop.RewardTypes;

import org.main.Shop.Reward;

public class BigReward extends Reward {
    public BigReward(String description, String price){
        super(description, price);
    }

    public BigReward getBigReward(){
        return new BigReward(super.getDescription(), super.getPrice());
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
