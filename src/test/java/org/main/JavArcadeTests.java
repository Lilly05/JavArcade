package org.main;

import org.junit.Test;
import org.main.Quiz.Questions;
import org.main.Quiz.Quiz;
import org.main.Rewards.Reward;
import org.main.Rewards.Shelf;
import org.main.Rewards.Shop;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JavArcadeTests {

    /**
     * testAmountOfQuestions
     * Method to test if the right amount of questions are given back
     */
    @Test
    public void testAmountOfQuestions(){
        Questions questions = new Questions(5);
        assertEquals(5, questions.getQuestions().size());
    }

    /**
     * testAmountOfRewards
     * Method to test if the right rewards according to the amount of JarCoins are given back
     */
    
    @Test
    public void testAmountOfRewards(){
        Shop shop = new Shop(15);
        assertEquals(9, shop.getRewards().size());
    }

    /**
     * testAnswerQuestions
     * Method to test if the algorithm to check the user's answer is working correctly
     */

    @Test
    public void testAnswerQuestions(){
        String answer = "A";
        System.setIn(new ByteArrayInputStream(answer.getBytes()));
        Quiz quiz = new Quiz();
        ArrayList<String[]> question = new ArrayList<>();
        question.add(new String[]{"Will this test be successful?", "A) Yes B) No C) Maybe", "A"});
        assertEquals(5, quiz.answerQuestions(question));
    }

    /**
     * testChooseReward
     * Method to check if the reward the user has won is added to the earnedRewards list
     */

    @Test
    public void testChooseReward(){
        Shop shop = new Shop(5);
        String input = "1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Shelf shelf = new Shelf(5, shop.getRewards());
        assertEquals(1, shelf.getEarnedRewards().size());
    }

}