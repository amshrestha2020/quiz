package com.example.quiz;

public class Helper {
    private Question[] questions = new Question[5];


    public Helper() {
        questions[0] = new Question("What do we call a newly hatched butterfly?",
                new String[]{"A moth", "A caterpillar", "A chrysalis"},
                new int[]{1}
        );
        questions[1] = new Question("What is the main component of the sun?",
                new String[]{"Gas", "Molten iron", "Rock"},
                new int[]{0}
        );
        questions[2] = new Question("Which of the following animals can run the fastest?",
                new String[]{"Cheetah", "Leopard",
                        "Tiger"},
                new int[]{0}
        );
        questions[3] = new Question("What is React?",
                new String[]{"A JavaScript framework made by facebook",
                        "A JavaScript library made by facebook", "An app"},
                new int[]{1}
        );
        questions[4] = new Question("Where did the powers of Spiderman come from?",
                new String[]{"He was born with them", "He was bitten by a radioactive spider", "He went through a scientific experiment"},
                new int[]{1}
        );

    }

    public Question[] getQuestions() {
        return questions;
    }
}

