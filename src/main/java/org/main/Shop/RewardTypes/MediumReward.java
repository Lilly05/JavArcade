package org.main.Shop.RewardTypes;

import org.main.Shop.Reward;

public class MediumReward extends Reward {

    public MediumReward(String description, String price){
        super(description, price);
    }

    public MediumReward getMediumReward(){
        return new MediumReward(super.getDescription(), super.getPrice());
    }

    public void setMediumReward(String description, String price){
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
        return "Medium";
    }
}
