package com.lebelle.myquizapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import static com.lebelle.myquizapp.R.id.score;
import static com.lebelle.myquizapp.R.id.wrong_score;

public class MainActivityAnswers extends AppCompatActivity {

    public int finalScore = calculateScore();
    public TextView scoreMessage;
    public ImageView scoreImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_answers);
        TextView nameField = (TextView) findViewById(R.id.add_name);
        TextView getEmail = (TextView) findViewById(R.id.mail_text);
        TextView finalScore = (TextView) findViewById(score); // find the id of the text view score
        TextView wrongScore = (TextView) findViewById(wrong_score);
        TextView gender = (TextView) findViewById(R.id.gender);
        TextView interest = (TextView) findViewById(R.id.interest_text);
        scoreMessage = (TextView) findViewById(R.id.score_message);
        scoreImage = (ImageView) findViewById(R.id.score_image);

        nameField.setText(MainActivityProfilePage.name);
        getEmail.setText(MainActivityProfilePage.email);
        gender.setText(MainActivityProfilePage.sex);
        interest.setText(MainActivityProfilePage.interest);


        finalScore.setText(Integer.toString(calculateScore()));
        wrongScore.setText(calculateFailed());
        displayMessage();

            }


    // method that calculate the score of the test taker or user
    public int calculateScore() {

        int score = 0; // declare an int variable score and instantiate it to 1

        if (MainActivityQuestions.answer_one.equals("Burj Khalifa")) { // if answer for question 1 equals Burj Khalifa, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_two.equals("River Nile")) { // if answer for question 2 equals River Nile, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_three.equals("Vatican")) { // if answer for question 3 equals Vatican, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_four.equals("Spring Temple Buddha")) { // if answer for question 4 equals Spring Temple Buddha, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_five.equals("Montane")) { // if answer for question 5 equals Montane, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_six.equals("West")) { // if answer for question 6 equals West, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_seven.equals("Equator")) { // if answer for question 7 equals Equator, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_eight.equals("One")) { // if answer for question 8 equals One, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_nine.equals("Osun Neck Bead")) { // if answer for question 9 equals Osun Neck Bead, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_ten.equals("Pidgin English")) { // if answer for question 10 equals Pidgin English, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_eleven.equals("Ladi Kwali")) { // if answer for question 11 equals Ladi Kwali, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_twelve.equals("Mortal Inheritance")) { // if answer for question 12 equals Mortal Inheritance, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_thirteen.equals("Afro")) { // if answer for question 13 equals Afro, increment score by 1
            score += 1;
        }
        if (MainActivityQuestions.answer_fourteen.equals("Slide")) { // if answer for question 14 equals Slide, increment score by 1
            score += 1;
        }
        return score;// return the final value of score and failed
    }


public String calculateFailed (){
    String failed = " ";
    if (!MainActivityQuestions.answer_one.equals("Burj Khalifa")) { // if answer for question 1 equals Burj Khalifa, increment score by 1
        failed += "1 ";
    }
    if (!MainActivityQuestions.answer_two.equals("River Nile")) { // if answer for question 2 equals River Nile, increment score by 1
        failed += "2 ";
    }
    if (!MainActivityQuestions.answer_three.equals("Vatican")) { // if answer for question 3 equals Vatican, increment score by 1
        failed += "3 ";
    }
    if (!MainActivityQuestions.answer_four.equals("Spring Temple Buddha")) { // if answer for question 4 equals Spring Temple Buddha, increment score by 1
        failed += "4 ";
    }
    if (!MainActivityQuestions.answer_five.equals("Montane")) { // if answer for question 5 equals Montane, increment score by 1
        failed += "5 ";
    }
    if (!MainActivityQuestions.answer_six.equals("West")) { // if answer for question 6 equals West, increment score by 1
        failed += "6 ";
    }
    if (!MainActivityQuestions.answer_seven.equals("Equator")) { // if answer for question 7 equals Equator, increment score by 1
        failed += "7 ";
    }
    if (!MainActivityQuestions.answer_eight.equals("One")) { // if answer for question 8 equals One, increment score by 1
        failed += "8 ";
    }
    if (!MainActivityQuestions.answer_nine.equals("Osun Neck Bead")) { // if answer for question 9 equals Osun Neck Bead, increment score by 1
        failed += "9 ";
    }
    if (!MainActivityQuestions.answer_ten.equals("Pidgin English")) { // if answer for question 10 equals Pidgin English, increment score by 1
        failed += "10 ";
    }
    if (!MainActivityQuestions.answer_eleven.equals("Ladi Kwali")) { // if answer for question 11 equals Ladi Kwali, increment score by 1
        failed += "11 ";
    }
    if (!MainActivityQuestions.answer_twelve.equals("Mortal Inheritance")) { // if answer for question 12 equals Mortal Inheritance, increment score by 1
        failed += "12 ";
    }
    if (!MainActivityQuestions.answer_thirteen.equals("Afro")) { // if answer for question 13 equals Afro, increment score by 1
        failed += "13 ";
    }
    if (!MainActivityQuestions.answer_fourteen.equals("Slide")) { // if answer for question 14 equals Slide, increment score by 1
        failed += "14 ";
    }

  return failed;
}


    public void displayMessage() {
        if (finalScore == 14) {
            scoreMessage.setText(R.string.answertext8);
            scoreImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kingsmiley));
        } else if (finalScore >= 7) {
            scoreMessage.setText(R.string.answertext7);
            scoreImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.happysmiley));
        } else {
            scoreMessage.setText(R.string.answertext3);
            scoreImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.unhappysmiley));
        }
    }

}
