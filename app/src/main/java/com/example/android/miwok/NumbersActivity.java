package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Initialize words ArrayList
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find root view of whole layout
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // Create a new {@link TextView} for each word in words and add it to rootView
        for (int index = 0; index < words.size(); index++) {
            TextView textView = new TextView(this);
            textView.setText(words.get(index));
            rootView.addView(textView);

        }
    }
}
