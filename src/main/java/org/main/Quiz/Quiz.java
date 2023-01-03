package org.main.Quiz;

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
        int money = 0;
        int i = 1;
        for (String[] question : questions){
            i++;
            System.out.println(question[0]);
            System.out.println(question[1]);
            String answer = scanner.next().toUpperCase();
            System.out.println(answer);
            if(answer.equals(question[2])){
                money += 5;
            }
        }
        System.out.println(i);
        return money;
    }
}


