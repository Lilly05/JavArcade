package org.main.Interface;

import java.util.ArrayList;

public interface QuestionsInterface {

    /**
     * getRandomQuestions
     * @param amount the amount of questions you want to get back
     * @return ArrayList<String[]> with the amount of questions
     */
    public ArrayList<String[]> getRandomQuestions(int amount);
}
