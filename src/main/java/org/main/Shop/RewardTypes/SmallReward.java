package org.main.Shop.RewardTypes;

import org.main.Shop.Reward;


public class SmallReward extends Reward {

    public SmallReward(String description, String price){
        super(description, price);
    }

    public SmallReward getSmallReward(){
        return new SmallReward(super.getDescription(), super.getPrice());
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
