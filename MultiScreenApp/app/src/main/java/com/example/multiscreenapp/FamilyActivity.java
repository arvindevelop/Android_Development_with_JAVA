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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father","әpә"));
        words.add(new Word("Mother","әṭa"));
        words.add(new Word("Son","angsi"));
        words.add(new Word("Daughter","tune"));
        words.add(new Word("Older Brother","taachi"));
        words.add(new Word("Younger Brother","chalitti"));
        words.add(new Word("Older Sister","teṭe"));
        words.add(new Word("Younger Sister","kolliti"));
        words.add(new Word("Grandmother","ama"));
        words.add(new Word("Grandfather","paapa"));

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