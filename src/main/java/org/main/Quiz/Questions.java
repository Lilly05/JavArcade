package org.main.Quiz;

import org.main.Interface.InputForArrayListInterface;

import java.util.*;

public class Questions implements InputForArrayListInterface {
    private ArrayList<String[]> questions;

    public Questions(int amount) {
        this.questions = new ArrayList<>();
        this.setQuestions(amount);
    }

    public ArrayList<String[]> getQuestions() {
        return this.questions;
    }

    public void setQuestions(int amount) {
        setInputForArrayList(amount);
    }

    /**
     * setInputForArrayList
     * Method of Interface InputForArrayListInterface
     * @param amount the amount of questions you want to get back
     */

    @Override
    public void setInputForArrayList(int amount) {
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
            this.questions.add(allQuestions.get(randomNumber));
            allQuestions.remove(randomNumber);
        }
    }
}
