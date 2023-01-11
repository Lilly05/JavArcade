package org.main.Rewards;

import org.main.Interface.InputForArrayListInterface;
import org.main.Main;
import org.main.Rewards.RewardTypes.Food;
import org.main.Rewards.RewardTypes.GamingEquipment;
import org.main.Rewards.RewardTypes.Merch;
import org.main.Rewards.RewardTypes.Technologie;

import java.util.ArrayList;
import java.util.Collections;

public class Rewards {
    private ArrayList<String[]> rewards = new ArrayList<>();
    private Food food;
    private GamingEquipment gamingEquipment;
    private Merch merch;
    private Technologie technologie;

    public Rewards(int jarCoins) {
        food = new Food(jarCoins);
        gamingEquipment = new GamingEquipment(jarCoins);
        merch = new Merch(jarCoins);
        technologie = new Technologie(jarCoins);
        this.setRewards();
    }

    public Rewards(){
        this.rewards = new ArrayList<>();
    }

    public ArrayList<String[]> getRewards() {
        return new ArrayList<>(this.rewards);
    }

    public void setRewards() {
        this.rewards = new ArrayList<>();
        this.rewards.addAll(food.getFoodRewards());
        this.rewards.addAll(gamingEquipment.getGamingEquipmentRewards());
        this.rewards.addAll(merch.getMerchRewards());
        this.rewards.addAll(technologie.getTechnologieRewards());
    }
}
