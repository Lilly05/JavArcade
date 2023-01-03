package org.main.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    Questions questions = new Questions();

    public Quiz(){
        System.out.println(getMoney(questions.questions));
    }

    /**
     * getMoney
     * @param questions all the questions including the answers
     * @return the money the player earned by answering the questions
     */

    public int getMoney(ArrayList<String[]> questions){
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        for (String[] question : questions){
            System.out.println(question[0]);
            System.out.println(question[1]);
            String answer = scanner.next().toUpperCase();
            if(answer.equals(question[2])){
                money += 5;
            }
        }
        return money;
    }
}


