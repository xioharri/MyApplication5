package com.example.myapplication;

public class Questions {

    public String mQuestions[] = {

            "In the children's book series, where is Paddington Bear originally from?",
            "What letter must appear at the beginning of the registration number of all non-military aircraft in the U.S.?",
            "Who delivered the less famous two-hour speech that preceded Abraham Lincoln's two-minute Gettysburg Address?",
            "Nephelococcygia is the practice of doing what?",
            "Which insect shorted out an early supercomputer and inspired the term computer bug",
            "Which of the following men does not have a chemical element named for him?",
            "Which of these ships was not one of the three taken over by colonists during the Boston Tea Party?",
            "Now used to refer to a cat, the word \"tabby\" is derived from the name of a district of what world capital?",
            "Which First Lady was a ninth-generation descendant of Pocahontas?",
            "For ordering his favorite beverages on demand, LBJ had four buttons installed in the Oval Office labeled \"coffee\", \"tea\", \"Coke\", and what?",
            "Khrushchev's famous 1960 \"shoe-banging\" outburst at the U.N. was in response to a delegate from what nation?"


    };

    private String mChoices[][] ={
            {"India", "Peru", "Canada", "Iceland"},
            {"N", "A", "U", "L"},
            {"Wendell Phillips", "Daniel Webster", "Robert G. Ingersoll","Edward Everett"},
            {"Finding shapes in clouds", "Sleeping with your eyes open", "Breaking glass with your voice","Swimming in freezing water"},
            {"Moth", "Roach", "Fly","Japanese Beetle"},
            {"Albert Einstein", "Niels Bohr", "Issac Newton","Enrico Fermi"},
            {"Eleanor", "Dartmouth", "Beaver","William"},
            {"Baghdad", "New Delhi", "Cairo","Moscow"},
            {"Helen Taft", "Edith Wilson", "Bess Truman","Mamie Eisenhower"},
            {"Fresca", "V8", "Yoo-hoo","A&W"},
            {"Australia", "The Netherlands", "The Philippines","Turkey"}
    };

    private String mCorrectanswers[]={"Peru", "N", "Edward Everett", "Finding shapes in clouds", "Moth", "Issac Newton", "William", "Baghdad", "Edith Wilson", "Fresca", "The Philippines"};

    private String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectanswers(int a){
        String answer = mCorrectanswers[a];
        return answer;
    }
}
