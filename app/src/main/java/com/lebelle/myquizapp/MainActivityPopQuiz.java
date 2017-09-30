package com.lebelle.myquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivityPopQuiz extends AppCompatActivity {
FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pop_quiz);
        fab = (FloatingActionButton) findViewById(R.id.play);
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

public void launchQuestionsActivity (View view){
        // Perform this action when Play Floating Action Button is clicked
        Intent intent = new Intent(MainActivityPopQuiz.this, MainActivityQuestions.class);
        startActivity(intent);

    }
}
