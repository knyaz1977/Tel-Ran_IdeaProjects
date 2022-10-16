package com.mytest.mytest.mytest;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hi, everybody!");
        String result = askQuestion();
        System.out.println(result);
    }
    public static String askQuestion() {
        System.out.println("Ask a question?");
        String result = askAdditionalQuestion();
        System.out.println(result);
        return "Gave the answer";
    }

    public static String askAdditionalQuestion() {

        System.out.println("Ask a clarifying question?");
        return "Gave an answer to a clarifying question";
    }
}



