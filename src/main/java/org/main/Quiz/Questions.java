package org.main.Quiz;

import org.main.Colors.Colors;
import org.main.Interface.InputForArrayListInterface;

import java.util.*;

public class Questions implements InputForArrayListInterface {
    private ArrayList<String[]> questions = new ArrayList<>();

    public Questions(int amount) {
        this.setQuestions(amount);
    }

    public ArrayList<String[]> getQuestions() {
        return new ArrayList<>(this.questions);
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
                new String[]{"How do you write text in the console in Java?", "A)Console.Write(); B)System.out.print(); C)System.Print();" ,"B"},
                new String[]{"Choose the programming language", "A)HTML B)CSS C)JavaScript" ,"C"},
                new String[]{"Who is Linus Torvalds?", "A)He developed the Linux kernel B)He invented Python C)He is the owner of Apple" ,"A"},
                new String[]{"Which one isn't an HTTP method?", "A)Accept B)Purge C)View" ,"A"},
                new String[]{"Which data type can you use in Java?", "A)uint B)float C)rune" ,"B"},
                new String[]{"Which IDE is convenient for programming with Java?", "A)Visual Studio B)AWS Cloud9 C)IntelliJ Idea" ,"C"},
                new String[]{"What is !false ?", "A)true B)false C)undefined" ,"A"},
                new String[]{"With which programming language is this program developed?", "A)Python B)C# C)Java" ,"C"},
                new String[]{"Which executable can you generate with Java?", "A).exe B).jar C).run" ,"B"},
                new String[]{"Is Java case sensitive?", "A)Yes B)No C)sometimes" ,"A"},
                new String[]{"Do you like this app?", "A)false B)!true C)!false" ,"C"},
                new String[]{"How do you convert an int to a String in Java?", "A)Integer.toString() B).parseToString() C).convertIntToString()" ,"A"},
                new String[]{"How would you rate our app? (Mister Bucher please don't answer wrong!)", "A)1.5 Stars B)5 Stars C)1 Star" ,"B"},
                new String[]{"How to you make a constant in Java?", "A)static final int number = 6; B)static const int number = 6;  C)static const number = 6;" ,"A"},
                new String[]{"With which programming language do you program in SAP?", "A)SQL B)ABAP C)Java" ,"B"},
                new String[]{"What does AI mean?", "A)Advanced Intelligence B)Artificial Intelligence C)Künstliche Intelligenz" ,"B"},
                new String[]{"Where is SAP from?", "A)Sweden B)Germany C)America" ,"B"},
                new String[]{"Which one does exist?", "A)MangaDB B)MangoDB C)MongoDB" ,"C"},
                new String[]{"Who programmed this app?", "A)Lilly and Bryan B)Mark Zuckerberg C)Microsoft" ,"A"},
                new String[]{"How to you push changes to a GitHub Repository?", "A)Push, Commit, Stage B)Commit, Stage, Push C)Stage, Commit, Push" ,"C"}
        );
        for (int i = 0; i < amount; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(allQuestions.size());
            this.questions.add(allQuestions.get(randomNumber));
            allQuestions.remove(randomNumber);
        }
    }
}
