package com.cursoandroid.pedrapapel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //oncreate estrutura a interface
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rock(View view){
        this.selectedOption("rock");
    }
    public void paper(View view){
        this.selectedOption("paper");
    }
    public void scisor(View view){
        this.selectedOption("scisor");
    }
    public void selectedOption(String selectedOption){

        ImageView imgResult = findViewById(R.id.imageResult);
        ImageView imgOvercome = findViewById(R.id.imageOvercome);
        int number = new Random().nextInt(3);
        String[] options = {"rock", "paper", "scisor"};
        String appOption = options[number];
        switch (appOption) {
            case "rock":
                imgResult.setImageResource(R.drawable.pedra);
                if(selectedOption.equalsIgnoreCase(appOption))
                    imgOvercome.setImageResource(R.drawable.ic_mood_black_24dp);
                else
                    imgOvercome.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp);
                break;
            case "paper":
                imgResult.setImageResource(R.drawable.papel);
                if(selectedOption.equalsIgnoreCase(appOption))
                    imgOvercome.setImageResource(R.drawable.ic_mood_black_24dp);
                else
                    imgOvercome.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp);
                break;
            case "scisor":
                imgResult.setImageResource(R.drawable.tesoura);
                if(selectedOption.equalsIgnoreCase(appOption))
                    imgOvercome.setImageResource(R.drawable.ic_mood_black_24dp);
                else
                    imgOvercome.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp);
                break;
        }


    }
}
