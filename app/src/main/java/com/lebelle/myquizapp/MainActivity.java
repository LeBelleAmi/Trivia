package com.lebelle.myquizapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Declare name of font used for trivia
         */
        TextView textView1 = (TextView) findViewById(R.id.trivia_text);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/billabong.ttf");
        textView1.setTypeface(customFont);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startActivity = new Intent(MainActivity.this, MainActivityProfilePage.class);
                startActivity(startActivity);
                finish();
            }
        }, 3000);

    }
}
