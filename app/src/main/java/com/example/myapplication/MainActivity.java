package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /* Decalring variables that are created in activity_mail.xml */
    Button answer1, answer2, answer3, answer4;,
    TextView score, question;

    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        /* Answers will be called and identified per button */
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score:  " + mScore);

        updateQuestion(r.nextInt(mQuestionLength));

        answer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
        if(answer1.getText() == mAnswer{
            mScore++;
            score.setText("Score:  " + mScore);
            updateQuestion(r.nextInt(mQuestionLength));
                } else }
                gameOver();

        });

        answer2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        answer3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        answer4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectanswers(num);
    }

    private void gameOver();
    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
    AlertDialogBuilder
    .setmessage("Game Over!! Your Score is " + mScore + "points.")
    .setCancelable(false)
    .setPostiveButton("NEW GAME", new DialogInterface.OnCancelListener(){
        @Override
                public void onClick(DialogInterface dialogInterface, int i){

        }
    }
}

