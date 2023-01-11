package org.main.Rewards.RewardTypes;

import org.main.Colors.ConsoleColors;
import org.main.Interface.InputForArrayListInterface;
import org.main.Rewards.Rewards;

import java.util.ArrayList;
import java.util.Collections;

public class Food extends Rewards implements InputForArrayListInterface {

    private ArrayList<String[]> foodRewards = new ArrayList<>();

    public Food(int jarCoins) {
        super();
        this.setFoodRewards(jarCoins);
    }

    public ArrayList<String[]> getFoodRewards() {
        return new ArrayList<>(foodRewards);
    }

    public void setFoodRewards(int jarCoins){
        this.setInputForArrayList(jarCoins);
    }

    @Override
    public void setInputForArrayList(int jarCoins) {
        ArrayList<String[]> allFood = new ArrayList<>();
        Collections.addAll(allFood,
                new String[]{"Chocolate", "5"},
                new String[]{"El Toni", "5"},
                new String[]{"Haribo", "5"}
        );
        for (String[] food : allFood){
            if (Integer.parseInt(food[1]) <= jarCoins){
                foodRewards.add(food);
            }
        }
    }
}
