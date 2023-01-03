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


    @Override
    public ArrayList<String[]> getRandomQuestions(int amount) {
        ArrayList<String[]> chosenQuestions = new ArrayList<>();
        ArrayList<String[]> allQuestions = new ArrayList<>();
        Collections.addAll(allQuestions,
                new String[]{"Do you like cats?", "B"},
                new String[]{"Do you like dogs?", "C"},
                new String[]{"Do you like hampter?", "A"},
                new String[]{"Do you like pigs?", "A"},
                new String[]{"Do you like guinea?", "B"},
                new String[]{"Do you like gin tonic?", "C"},
                new String[]{"Do you like kittens?", "A"},
                new String[]{"Do you like ponys?", "C"},
                new String[]{"Do you like birds?", "B"},
                new String[]{"Do you like fish?", "A"},
                new String[]{"Do you like puppies?", "C"},
                new String[]{"Do you like ineichen?", "A"},
                new String[]{"Do you like sursee?", "B"},
                new String[]{"Do you like me?", "A"},
                new String[]{"Do you like anyone?", "B"}
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
