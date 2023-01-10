package org.main;

import org.junit.Before;
import org.junit.Test;
import org.main.Questions.Questions;
import org.main.Questions.Quiz;
import org.main.Rewards.Rewards;
import org.main.Rewards.Shelf;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JavArcadeTests {

    @Before
    public void setup(){

    }

    @Test
    public void testAmountOfQuestions(){
        Questions questions = new Questions(5);
        assertEquals(5, questions.getQuestions().size());
    }
    
    @Test
    public void testAmountOfRewards(){
        Rewards rewards = new Rewards(15);
        assertEquals(9, rewards.getRewards().size());
    }

    @Test
    public void testAnswerQuestions(){
        String answer = "A";
        System.setIn(new ByteArrayInputStream(answer.getBytes()));
        Quiz quiz = new Quiz();
        ArrayList<String[]> question = new ArrayList<>();
        question.add(new String[]{"Will this test be successful?", "A) Yes B) No C) Maybe", "A"});
        assertEquals(5, quiz.answerQuestions(question));
    }

    @Test
    public void testChooseReward(){
        String input = "1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Shelf shelf = new Shelf(5);
        ArrayList<String[]> rewards = new ArrayList<>();
        rewards.add(new String[]{"Test", "5"});
        shelf.chooseReward(5, rewards);
        assertEquals(1, shelf.getEarnedRewards().size());
    }

}