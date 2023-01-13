package org.main;

import org.main.Quiz.Quiz;
import org.main.Shop.Shelf;
import org.main.Shop.Shop;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz(10);
        Shop shop = new Shop(quiz.getJarCoins());
        Shelf shelf = new Shelf(quiz.getJarCoins(), shop.getRewards());
    }

}