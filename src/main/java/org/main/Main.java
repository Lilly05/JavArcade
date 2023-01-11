package org.main;

import org.main.Questions.Quiz;
import org.main.Rewards.Shelf;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz(10);
        Shelf shelf = new Shelf(quiz.getJarCoins());
    }

}