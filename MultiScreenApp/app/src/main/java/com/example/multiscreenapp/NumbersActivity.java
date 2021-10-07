package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","lutti"));
        words.add(new Word("Two","ottiko"));
        words.add(new Word("Three","tolookosu"));
        words.add(new Word("Four","oyyisa"));
        words.add(new Word("Five","massokka"));
        words.add(new Word("Six","temmoka"));
        words.add(new Word("Seven","kenekaku"));
        words.add(new Word("Eight","kawinta"));
        words.add(new Word("Nine","wo'e"));
        words.add(new Word("Ten","na'aacha"));

        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        /*for(int i=0;i<10;i++)
        {
            TextView wordsView = new TextView(this);
            wordsView.setText(words.get(i));
            rootView.addView(wordsView);
        }*/
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}