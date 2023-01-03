package org.main.Quiz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private int money;
    private Questions questions;

    public Quiz(){
        this.questions = new Questions();
        this.money = answerQuestions(questions.getQuestions());
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<String[]> getQuestions() {
        return questions.getQuestions();
    }

    public void setQuestions() {
        this.questions = new Questions();
    }

    /**
     " answerQuestions
     * @param questions all the questions including the answers
     * @return the money the player earned by answering the questions
     */

    public int answerQuestions(ArrayList<String[]> questions){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int money = 0;
        for (String[] question : questions){
            System.out.println(question[0]);
            System.out.println(question[1]);
            while(!(answer.equals("A") || answer.equals("B") || answer.equals("C"))){
                System.out.println("Please enter A, B or C");
                answer = scanner.next().toUpperCase();
            }
            if(answer.equals(question[2])){
                money += 5;
            }
            answer = "";

        }
        return money;

    }
}


