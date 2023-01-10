package org.main.Questions;

import org.main.Colors.Colors;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz extends Questions {
    private int jarCoins;
    private Questions questions = new Questions();

    public Quiz(int amount){
        super(amount);
        this.jarCoins = answerQuestions(questions.getQuestions());
    }

    public int getJarCoins() {
        return jarCoins;
    }
    public void setJarCoins(int jarCoins) {
        this.jarCoins = jarCoins;
    }

    public ArrayList<String[]> getQuestions() {
        return super.getQuestions();
    }

    public void setQuestions(int amount) {
        super.setQuestions(amount);
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
            System.out.println(Colors.PURPLE + question[0]);
            System.out.println(Colors.RESET + question[1]);
            while(!(answer.equals("A") || answer.equals("B") || answer.equals("C"))){
                System.out.println("Please enter A, B or C");
                answer = scanner.next().toUpperCase();
            }
            if(answer.equals(question[2])){
                jarCoins += 5;
                System.out.println(Colors.TEAL + "Correct! You earned 5 JarCoins!\nYour current balance: " + jarCoins + "\n");
            }else{
                System.out.println(Colors.RED + "Incorrect! You didn't earn any JarCoins.\nYour current balance: " + jarCoins + "\n");
            }
            answer = "";

        }
        return jarCoins;
    }
}


