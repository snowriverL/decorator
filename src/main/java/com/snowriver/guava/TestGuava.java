package com.snowriver.guava;

public class TestGuava {

    public static void main(String[] args) {
        GPerEvent event = GPerEvent.getInstance();
        Question question = new Question();
        question.setUserName("snowriver");
        question.setContent("258794613");
        event.publishQuestion(question);
    }

}