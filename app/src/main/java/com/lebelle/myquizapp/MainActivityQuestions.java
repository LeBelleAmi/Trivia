package com.lebelle.myquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityQuestions extends AppCompatActivity {

    public static String answer_one = "nil";
    public static String answer_two = "nil";
    public static String answer_three = "nil";
    public static String answer_four = "nil";
    public static String answer_five = "nil";
    public static String answer_six = "nil";
    public static String answer_seven = "nil";
    public static String answer_eight = "nil";
    public static String answer_nine = "nil";
    public static String answer_ten = "nil";
    public static String answer_eleven = "nil";
    public static String answer_twelve = "nil";
    public static String answer_thirteen = "nil";
    public static String answer_fourteen = "nil";
    private RadioButton radioButtonId1;
    private RadioButton radioButtonId2;
    private RadioButton radioButtonId3;
    private RadioButton radioButtonId4;
    private RadioGroup radioGroupId;
    private RadioButton radioButtonId;
    private int radioBtnId;
    int question_no = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_questions);

        TextView questions = (TextView) findViewById(R.id.questions_text_view);
        questions.setText(R.string.question1);
         radioButtonId1 = (RadioButton) findViewById(R.id.radiobutton1);
         radioButtonId2 = (RadioButton) findViewById(R.id.radiobutton2);
         radioButtonId3 = (RadioButton) findViewById(R.id.radiobutton3);
         radioButtonId4 = (RadioButton) findViewById(R.id.radiobutton4);

        radioButtonId1.setText(R.string.ques1opt1);
        radioButtonId2.setText(R.string.ques1opt2);
        radioButtonId3.setText(R.string.ques1opt3);
        radioButtonId4.setText(R.string.ques1opt4);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item5:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

        public void next(View view) {
        question_no += 1;
        TextView questions = (TextView) findViewById(R.id.questions_text_view);
        radioButtonId1 = (RadioButton) findViewById(R.id.radiobutton1);
        radioButtonId2 = (RadioButton) findViewById(R.id.radiobutton2);
        radioButtonId3 = (RadioButton) findViewById(R.id.radiobutton3);
        radioButtonId4 = (RadioButton) findViewById(R.id.radiobutton4);
        switch (question_no){
            case 1:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                answer_one = "nil"; // assign the value default if no button is selected
                Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
            } else {
                    answer_one = radioButtonId.getText().toString(); // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_one.equals("Burj Khalifa")) {
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
            }
                questions.setText(R.string.question2);
                radioButtonId1.setText(R.string.ques2opt1);
                radioButtonId2.setText(R.string.ques2opt2);
                radioButtonId3.setText(R.string.ques2opt3);
                radioButtonId4.setText(R.string.ques2opt4);
                radioGroupId.clearCheck();
                break;

            case 2:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_two = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                }
                else {
                    answer_two = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button, convert to string and updates answer_one
                    if (answer_two.equals("River Nile")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question3);
                radioButtonId1.setText(R.string.ques3opt1);
                radioButtonId2.setText(R.string.ques3opt2);
                radioButtonId3.setText(R.string.ques3opt3);
                radioButtonId4.setText(R.string.ques3opt4);
                radioGroupId.clearCheck();
                break;
            case 3:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_three = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                }
                else {
                    answer_three = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_three.equals("Vatican")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question4);
                radioButtonId1.setText(R.string.ques4opt1);
                radioButtonId2.setText(R.string.ques4opt2);
                radioButtonId3.setText(R.string.ques4opt3);
                radioButtonId4.setText(R.string.ques4opt4);
                radioGroupId.clearCheck();
                break;
            case 4:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_four = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                }
                else {
                    answer_four = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_four.equals("Spring Temple Buddha")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question5);
                radioButtonId1.setText(R.string.ques5opt1);
                radioButtonId2.setText(R.string.ques5opt2);
                radioButtonId3.setText(R.string.ques5opt3);
                radioButtonId4.setText(R.string.ques5opt4);
                radioGroupId.clearCheck();
                break;
            case 5:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_five = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_five = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_five.equals("Montane")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question6);
                radioButtonId1.setText(R.string.ques6opt1);
                radioButtonId2.setText(R.string.ques6opt2);
                radioButtonId3.setText(R.string.ques6opt3);
                radioButtonId4.setText(R.string.ques6opt4);
                radioGroupId.clearCheck();
                break;
            case 6:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_six = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_six = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_six.equals("West")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question7);
                radioButtonId1.setText(R.string.ques7opt1);
                radioButtonId2.setText(R.string.ques7opt2);
                radioButtonId3.setText(R.string.ques7opt3);
                radioButtonId4.setText(R.string.ques7opt4);
                radioGroupId.clearCheck();
                break;
            case 7:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_seven = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_seven = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_seven.equals("Equator")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question8);
                radioButtonId1.setText(R.string.ques8opt1);
                radioButtonId2.setText(R.string.ques8opt2);
                radioButtonId3.setText(R.string.ques8opt3);
                radioButtonId4.setText(R.string.ques8opt4);
                radioGroupId.clearCheck();
                break;
            case 8:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_eight = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_eight = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_eight.equals("One")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question9);
                radioButtonId1.setText(R.string.ques9opt1);
                radioButtonId2.setText(R.string.ques9opt2);
                radioButtonId3.setText(R.string.ques9opt3);
                radioButtonId4.setText(R.string.ques9opt4);
                radioGroupId.clearCheck();
                break;
            case 9:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_nine = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_nine = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_nine.equals("Osun Neck Bead")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question10);
                radioButtonId1.setText(R.string.ques10opt1);
                radioButtonId2.setText(R.string.ques10opt2);
                radioButtonId3.setText(R.string.ques10opt3);
                radioButtonId4.setText(R.string.ques10opt4);
                radioGroupId.clearCheck();
                break;
            case 10:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_ten = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_ten = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_ten.equals("Pidgin English")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question11);
                radioButtonId1.setText(R.string.ques11opt1);
                radioButtonId2.setText(R.string.ques11opt2);
                radioButtonId3.setText(R.string.ques11opt3);
                radioButtonId4.setText(R.string.ques11opt4);
                radioGroupId.clearCheck();
                break;
            case 11:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_eleven = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_eleven = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_eleven.equals("Ladi Kwali")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question12);
                radioButtonId1.setText(R.string.ques12opt1);
                radioButtonId2.setText(R.string.ques12opt2);
                radioButtonId3.setText(R.string.ques12opt3);
                radioButtonId4.setText(R.string.ques12opt4);
                radioGroupId.clearCheck();
                break;
            case 12:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_twelve = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_twelve = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_twelve.equals("Mortal Inheritance")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question13);
                radioButtonId1.setText(R.string.ques13opt1);
                radioButtonId2.setText(R.string.ques13opt2);
                radioButtonId3.setText(R.string.ques13opt3);
                radioButtonId4.setText(R.string.ques13opt4);
                radioGroupId.clearCheck();
                break;
            case 13:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_thirteen = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_thirteen = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_thirteen.equals("Afro")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                questions.setText(R.string.question14);
                radioButtonId1.setText(R.string.ques14opt1);
                radioButtonId2.setText(R.string.ques14opt2);
                radioButtonId3.setText(R.string.ques14opt3);
                radioButtonId4.setText(R.string.ques14opt4);
                TextView submit = (TextView) findViewById(R.id.submit);
                submit.setText("Submit");
                radioGroupId.clearCheck();
                break;
            case 14:
                radioGroupId = (RadioGroup) findViewById(R.id.questionOneAnswer); // get's the radio group id
                radioBtnId = radioGroupId.getCheckedRadioButtonId(); // returns an int of the checked radio button
                radioButtonId = (RadioButton) findViewById(radioBtnId);  // get's the id of the checked radio button
                if (radioBtnId == -1) {  // conditional statement to check if any button is selected or not.
                    answer_fourteen = "nil"; // assign the value default if no button is selected
                    Toast.makeText(this, "You didn't pick an answer!", Toast.LENGTH_SHORT).show();
                } else {
                    answer_fourteen = radioButtonId.getText().toString();  // get the value (CharSequence) of the selected button and updates answer_one
                    if (answer_fourteen.equals("Slide")){
                        Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent = new Intent(MainActivityQuestions.this, MainActivityAnswers.class);
                startActivity(intent);
                finish();
        }
    }

    public void hint(View view) {
        if (question_no == 0) {
            Toast.makeText(this, "Think middle east", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 1) {
            Toast.makeText(this, "Its in North Africa", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 2) {
            Toast.makeText(this, "A praying country", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 3) {
            Toast.makeText(this, "Chinese divinity", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 4) {
            Toast.makeText(this, "No cheating", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 5) {
            Toast.makeText(this, "The American continent", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 6) {
            Toast.makeText(this, "All humans are equal", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 7) {
            Toast.makeText(this, "I have 2 dogs and I give out one", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 8) {
            Toast.makeText(this, "Yoruba goddesses wear it", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 9) {
            Toast.makeText(this, "Warri no dey carry last", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 10) {
            Toast.makeText(this, "She was moulding clay", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 11) {
            Toast.makeText(this, "Omotola Jalade was in it", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 12) {
            Toast.makeText(this, "Round and High", Toast.LENGTH_SHORT).show();
        }
        if (question_no == 13) {
            Toast.makeText(this, "Micheal Jackson'favourite", Toast.LENGTH_SHORT).show();

    }
}
}





