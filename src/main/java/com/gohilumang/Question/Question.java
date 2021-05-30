package com.gohilumang.Question;

public class Question {
    String question;
    String a;
    String b;
    String c;
    String d;
    String correct;

    public Question(String question, String a, String b, String c, String d, String correct){
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.correct = correct;
    }

    public String getA(){
        return this.a;
    }

    public void setA(String a){
        this.a = a;
    }

    public String getB(){
        return this.b;
    }

    public void setB(String b){
        this.b = b;
    }

    public String getC(){
        return this.c;
    }

    public void setC(String c){
        this.c = c;
    }

    public String getD(){
        return this.d;
    }

    public void setD(String d){
        this.d = d;
    }

    public String getCorrect(){
        return this.correct;
    }

    public void setCorrect(String correct){
        this.correct = correct;
    }
}
