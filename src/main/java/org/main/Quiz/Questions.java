package org.main.Quiz;

import org.main.Interface.QuestionsInterface;
import org.main.Main;

import java.util.*;
import java.util.stream.IntStream;

public class Questions implements QuestionsInterface {
    ArrayList<String[]> questions;

    public Questions() {
        this.questions = getRandomQuestions(10);
    }

    public ArrayList<String[]> getQuestions() {
        return this.questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = getRandomQuestions(10);
    }

    /**
     * getRandomQuestions
     * @param amount the amount of questions you want to get back
     * @return ArrayList<String[]> with the amount of questions
     */
    @Override
    public ArrayList<String[]> getRandomQuestions(int amount) {
        ArrayList<String[]> chosenQuestions = new ArrayList<>();
        ArrayList<String[]> allQuestions = new ArrayList<>();
        Collections.addAll(allQuestions,
                new String[]{"Do you like cats?", "A)No B)Yes C)No" ,"B"},
                new String[]{"Do you like dogs?", "A)No B)No C)Yes" ,"C"},
                new String[]{"Do you like hampter?", "A)Yes B)No C)No" ,"A"},
                new String[]{"Do you like pigs?", "A)Yes B)No C)No" ,"A"},
                new String[]{"Do you like guinea?", "A)No B)Yes C)No" ,"B"},
                new String[]{"Do you like gin tonic?", "A)No B)No C)Yes" ,"C"},
                new String[]{"Do you like kittens?", "A)Yes B)No C)No" ,"A"},
                new String[]{"Do you like ponys?", "A)No B)No C)Yes" ,"C"},
                new String[]{"Do you like birds?", "A)No B)Yes C)No" ,"B"},
                new String[]{"Do you like fish?", "A)Yes B)No C)No" ,"A"},
                new String[]{"Do you like puppies?", "A)No B)No C)Yes" ,"C"},
                new String[]{"Do you like ineichen?", "A)Yes B)No C)No" ,"A"},
                new String[]{"Do you like sursee?", "A)No B)Yes C)No" ,"B"},
                new String[]{"Do you like me?", "A)Yes B)No C)No" ,"A"},
                new String[]{"Do you like anyone?", "A)No B)Yes C)No" ,"B"}
        );
        for (int i = 0; i < amount; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(allQuestions.size());
            chosenQuestions.add(allQuestions.get(randomNumber));
            allQuestions.remove(randomNumber);
        }
        return chosenQuestions;
    }
}
