package org.main.Quiz;


import org.main.Colors.ConsoleColors;
import org.main.Interface.InputForArrayListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Quiz implements InputForArrayListInterface {
    private int jarCoins;
    private ArrayList<Question> questions = new ArrayList<>();

    public Quiz(int amount){
        this.setQuestions(amount);
        this.jarCoins = answerQuestions(this.getQuestions());
    }

    public Quiz(){
        this.setJarCoins(0);
    }

    public int getJarCoins() {
        return jarCoins;
    }
    public void setJarCoins(int jarCoins) {
        this.jarCoins = jarCoins;
    }

    public ArrayList<Question> getQuestions() {
        return new ArrayList<>(questions);
    }

    public void setQuestions(int amount) {
       this.setInputForArrayList(amount);
    }

    /**
     * answerQuestions
     * Method that prompts the user to answer the questions to earn JarCoins
     * @param questions all the questions including the answers
     * @return int the jarCoins the player earned by answering the questions
     */

    public int answerQuestions(ArrayList<Question> questions){
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int jarCoins = 0;
        for (Question question : questions){
            System.out.println(ConsoleColors.PURPLE + question.getQuestion());
            System.out.println(ConsoleColors.RESET + question.getOptions());
            while(!(answer.equals("A") || answer.equals("B") || answer.equals("C"))){
                System.out.println("Please enter A, B or C");
                answer = scanner.next().toUpperCase();
            }
            if(answer.equals(question.getAnswer())){
                jarCoins += 5;
                System.out.println(ConsoleColors.TEAL + "Correct! You earned 5 JarCoins!\n" + ConsoleColors.RESET +"Your current balance: " + jarCoins + "\n");
            }else{
                System.out.println(ConsoleColors.RED + "Incorrect! You didn't earn any JarCoins.\n" + ConsoleColors.RESET + "Your current balance: " + jarCoins + "\n");
            }
            answer = "";

        }
        return jarCoins;
    }

    /**
     * setInputForArrayList
     * Method of Interface InputForArrayListInterface
     * @param amount the amount of questions you want to add to the ArrayList
     */

    @Override
    public void setInputForArrayList(int amount) {
        ArrayList<Question> allQuestions = new ArrayList<>();
        Collections.addAll(allQuestions,
                new Question("How do you write text in the console in Java?", "A)Console.Write(); B)System.out.print(); C)System.Print();" ,"B"),
                new Question("Choose the programming language", "A)HTML B)CSS C)JavaScript" ,"C"),
                new Question("Who is Linus Torvalds?", "A)He developed the Linux kernel B)He invented Python C)He is the owner of Apple" ,"A"),
                new Question("Which one isn't an HTTP method?", "A)Accept B)Purge C)View" ,"A"),
                new Question("Which data type can you use in Java?", "A)uint B)float C)rune" ,"B"),
                new Question("Which IDE is convenient for programming with Java?", "A)Visual Studio B)AWS Cloud9 C)IntelliJ Idea" ,"C"),
                new Question("What is !false ?", "A)true B)false C)undefined" ,"A"),
                new Question("With which programming language is this program developed?", "A)Python B)C# C)Java" ,"C"),
                new Question("Which executable can you generate with Java?", "A).exe B).jar C).run" ,"B"),
                new Question("Is Java case sensitive?", "A)Yes B)No C)sometimes" ,"A"),
                new Question("Do you like this app?", "A)false B)!true C)!false" ,"C"),
                new Question("How do you convert an int to a String in Java?", "A)Integer.toString() B).parseToString() C).convertIntToString()" ,"A"),
                new Question("How would you rate our app? (Mister Bucher please don't answer wrong!)", "A)1.5 Stars B)5 Stars C)1 Star" ,"B"),
                new Question("How to you make a constant in Java?", "A)static final int number = 6; B)static const int number = 6;  C)static const number = 6;" ,"A"),
                new Question("With which programming language do you program in SAP?", "A)SQL B)ABAP C)Java" ,"B"),
                new Question("What does AI mean?", "A)Advanced Intelligence B)Artificial Intelligence C)Künstliche Intelligenz" ,"B"),
                new Question("Where is SAP from?", "A)Sweden B)Germany C)America" ,"B"),
                new Question("Which one does exist?", "A)MangaDB B)MangoDB C)MongoDB" ,"C"),
                new Question("Who programmed this app?", "A)Lilly and Bryan B)Mark Zuckerberg C)Microsoft" ,"A"),
                new Question("How to you push changes to a GitHub Repository?", "A)Push, Commit, Stage B)Commit, Stage, Push C)Stage, Commit, Push" ,"C")
        );
        for (int i = 0; i < amount; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(allQuestions.size());
            this.questions.add(allQuestions.get(randomNumber));
            allQuestions.remove(randomNumber);
        }
    }
}


