package org.main.Quiz;

public class Question {
    private String question;
    private String options;
    private String answer;

    public Question(String question, String options, String answer) {
        this.setQuestion(question);
        this.setOptions(options);
        this.setAnswer(answer);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
