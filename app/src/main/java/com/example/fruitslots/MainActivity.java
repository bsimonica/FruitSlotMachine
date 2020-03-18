package com.example.fruitslots;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button start;
    public Button rules;
    public Drawable cherry;
    public Drawable grape;
    public Drawable pear;
    public Drawable strawberry;
    public Drawable fruit;
    public RadioButton easy;
    public RadioButton medium;
    public RadioButton hard;
    public TextView score;
    public GridLayout slotWindow;
    public ImageView[] imageViews;
    public boolean spin;
    public Handler handler;
    public SpinSlots spinslots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.startButton);
        rules = findViewById(R.id.rulesButton);
        cherry = getDrawable(R.drawable.cherry);
        grape = getDrawable(R.drawable.grape);
        pear = getDrawable(R.drawable.pear);
        strawberry = getDrawable(R.drawable.strawberry);
        easy = findViewById(R.id.easy);
        medium = findViewById(R.id.medium);
        hard = findViewById(R.id.hard);
        score = findViewById(R.id.score);
        slotWindow = findViewById(R.id.slotWindow);
        imageViews = new ImageView[3];
        fruit = cherry;
        spin = false;
        spinslots = new SpinSlots();
        handler = new Handler();
        for( int i=0; i<3; i++){
            imageViews[i] = (ImageView) getLayoutInflater().inflate(R.layout.fruit_border, null);
            imageViews[i].setMinimumWidth(270);
            imageViews[i].setMinimumHeight(270);
            imageViews[i].setImageDrawable(fruit);
            slotWindow.addView(imageViews[i]);
        }

    }

    public void startSlot(View v){
        if(spin){
            spin = false;
            start.setText("START");
            handler.removeCallbacks(spinslots);
        }

    }

    private class SpinSlots implements Runnable{
        public void run(){

        }
    }

    public void goRules(View v){

    }
}
