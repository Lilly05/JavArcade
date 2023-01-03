package org.main.Quiz;

import java.util.ArrayList;

public class Quiz {

    Questions questions = new Questions();

    public Quiz(){
        printArrayList(questions.questions);
    }

    public void printArrayList(ArrayList<String[]> arraylist){
        for (String[] element : arraylist){
            System.out.println(element[0]);
            System.out.println(element[1]);
        }
    }


}


