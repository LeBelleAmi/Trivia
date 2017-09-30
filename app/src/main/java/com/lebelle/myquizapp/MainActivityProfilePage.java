package com.lebelle.myquizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivityProfilePage extends AppCompatActivity {
    Spinner spinner;
    EditText nameField, getEmail;
    public static String name, email, sex;
    public static String interest = "";
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile_page);

        spinner = (Spinner) findViewById(R.id.gender);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_array, android.R.layout.simple_spinner_item);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //apply the adapter to the spinner
        spinner.setAdapter(adapter);
        addListenerOnSpinner();
    }

    public void addListenerOnSpinner() {
        // This method is supposed to call the on item selected listener on the spinner class
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//                this method gets called automatically when the user selects an item so we need to retrieve what the use has clicked
                sex = spinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "This is a Trivia Android Application designed for research purposes for completion of Andela Android Beginner's Program. Property of Omawumi Eyekpimi© 2017.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Intent feedbackEmail = new Intent(Intent.ACTION_SENDTO);
                feedbackEmail.setData(Uri.parse("mailto:omawumieyekpimi@gmail.com")); // only email apps should handle this
                feedbackEmail.putExtra(Intent.EXTRA_EMAIL, "");
                feedbackEmail.putExtra(Intent.EXTRA_SUBJECT, "Help & Feedback");
                if (feedbackEmail.resolveActivity(getPackageManager()) != null){
                    startActivity(Intent.createChooser(feedbackEmail, "Send Feedback via"));}
                return true;
            case R.id.item3:
                Toast.makeText(this, "This app is strictly for research and should not be used otherwise, by downloading and playing you agree to all rules within the laws of Nigeria", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "Privacy of each player is protected, all email addresses entered are within the user's limit", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item5:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void launchPopQuizActivity(View view) {
        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkbox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkbox7);

        if (checkBox1.isChecked()) {
            interest = interest + checkBox1.getText().toString() + " ";
        }
        if (checkBox2.isChecked()) {
            interest = interest + checkBox2.getText().toString() + " ";
        }
        if (checkBox3.isChecked()) {
            interest = interest + checkBox3.getText().toString() + " ";
        }
        if (checkBox4.isChecked()) {
            interest = interest + checkBox4.getText().toString() + " ";
        }
        if (checkBox5.isChecked()) {
            interest = interest + checkBox5.getText().toString() + " ";
        }
        if (checkBox6.isChecked()) {
            interest = interest + checkBox6.getText().toString() + " ";
        }
        if (checkBox7.isChecked()) {
            interest = interest + checkBox7.getText().toString() + " ";
        }

        //Get user's name
        nameField = (EditText) findViewById(R.id.add_name);
        name = nameField.getText().toString();

        //Get user's email
        getEmail = (EditText) findViewById(R.id.mail_text);
        email = getEmail.getText().toString();

        //If name textview is empty
        nameField = (EditText) findViewById(R.id.add_name);
        String strnameField = nameField.getText().toString();

        if (TextUtils.isEmpty(strnameField)){
            nameField.setError("This Field is compulsory");
            return;
        }

        //If email textview is empty
        getEmail = (EditText) findViewById(R.id.mail_text);
        String stremail = getEmail.getText().toString();

        if (TextUtils.isEmpty(stremail)){
            getEmail.setError("This Field is compulsory");
            return;
        }

// Perform this action when done button is clicked
        Intent intent = new Intent(MainActivityProfilePage.this, MainActivityPopQuiz.class);
        startActivity(intent);

    }

}
