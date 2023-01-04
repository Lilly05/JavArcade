package org.main;

import org.main.Quiz.Questions;
import org.main.Quiz.Quiz;
import org.main.Rewards.Shelf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz(10);
        Shelf shelf = new Shelf(quiz.getMoney());
    }

}