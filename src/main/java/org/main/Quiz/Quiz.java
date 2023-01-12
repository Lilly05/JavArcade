package org.main.Quiz;


import org.main.Colors.ConsoleColors;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private int jarCoins;
    private Questions questions;

    public Quiz(int amount){
        this.questions = new Questions(amount);
        this.jarCoins = answerQuestions(questions.getQuestions());
    }

    public Quiz(){
        this.jarCoins = 0;
    }

    public int getJarCoins() {
        return jarCoins;
    }
    public void setJarCoins(int jarCoins) {
        this.jarCoins = jarCoins;
    }

    public ArrayList<String[]> getQuestions() {
        return questions.getQuestions();
    }

    public void setQuestions(int amount) {
        questions.setQuestions(amount);
    }

    /**
     " answerQuestions
     * @param questions all the questions including the answers
     * @return int the jarCoins the player earned by answering the questions
     */

    public int answerQuestions(ArrayList<String[]> questions){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int jarCoins = 0;
        for (String[] question : questions){
            System.out.println(ConsoleColors.PURPLE + question[0]);
            System.out.println(ConsoleColors.RESET + question[1]);
            while(!(answer.equals("A") || answer.equals("B") || answer.equals("C"))){
                System.out.println("Please enter A, B or C");
                answer = scanner.next().toUpperCase();
            }
            if(answer.equals(question[2])){
                jarCoins += 5;
                System.out.println(ConsoleColors.TEAL + "Correct! You earned 5 JarCoins!\n" + ConsoleColors.RESET +"Your current balance: " + jarCoins + "\n");
            }else{
                System.out.println(ConsoleColors.RED + "Incorrect! You didn't earn any JarCoins.\n" + ConsoleColors.RESET + "Your current balance: " + jarCoins + "\n");
            }
            answer = "";

        }
        return jarCoins;
    }
}


