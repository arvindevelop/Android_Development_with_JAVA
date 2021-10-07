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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","weṭeṭṭi"));
        words.add(new Word("Green","chokokki"));
        words.add(new Word("Brown","ṭakaakki"));
        words.add(new Word("Gray","ṭopoppi"));
        words.add(new Word("Black","kululli"));
        words.add(new Word("White","kelelli"));
        words.add(new Word("Dusty Yellow","ṭopiisә"));
        words.add(new Word("Mustard Yellow","chiwiiṭә"));


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