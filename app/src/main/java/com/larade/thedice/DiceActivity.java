package com.larade.thedice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceActivity extends AppCompatActivity {


    int delayTimed = 20;
    String resultatDiceD = "";

    String resultatDiceD1 = "";

    String resultatDiceD2 = "";
    




    // Store the number of Dice roll animations per execution
    int rollAnimationsd = 40;

    int[] diceImagesd = new int[]{R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};

    Random random = new Random();

    TextView tvHelpD;
    TextView cellOneG1C1;
    TextView cellOneG1C2;
    TextView cellOneG1C3;
    TextView cellOneG1C4;
    TextView cellOneG1C5;
    TextView cellOneG1C6;
    TextView cellOneG1C7;
    TextView cellOneG1C8;
    TextView cellOneG1C9;
    TextView cellOneG1C10;
    TextView cellOneG1C11;
    TextView cellOneG1C12;
    TextView cellOneG1C13;
    TextView cellOneG1C14;
    TextView cellOneG1C15;
    TextView cellOneG1C16;
    TextView cellOneG1C17;
    TextView cellOneG1C18;
    TextView cellOneG1C19;
    TextView cellOneG1C20;
    TextView cellOneG1C21;
    TextView cellOneG1C22;


    TextView diceResultD;
    TextView diceResultD1;
    TextView diceResultD2;
    ImageView die3;
    ImageView die4;
    ImageView die5;
    ImageView die6;
    ImageView die7;
    ImageView die8;
    ImageView die9;
    ImageView die10;
    ImageView die11;
    ImageView die12;
    ImageView die13;
    ImageView die14;

    Button nextOneD;

    LinearLayout diceContainer;
    // Declare a MediaPlayer object reference
    MediaPlayer mpD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        List<Cellule> choiceGrid1 = new ArrayList<>();
        tvHelpD = findViewById(R.id.tvHelp);
        diceContainer = findViewById(R.id.diceContainerD);
        cellOneG1C1 = findViewById(R.id.Grd1Cell1);
        cellOneG1C2 = findViewById(R.id.Grd1Cell2);
        cellOneG1C3 = findViewById(R.id.Grd1Cell3);
        cellOneG1C4 = findViewById(R.id.Grd1Cell4);
        cellOneG1C5 = findViewById(R.id.Grd1Cell5);
        cellOneG1C6 = findViewById(R.id.Grd1Cell6);
        cellOneG1C7 = findViewById(R.id.Grd1Cell7);
        cellOneG1C8 = findViewById(R.id.Grd1Cell8);
        cellOneG1C9 = findViewById(R.id.Grd1Cell9);
        cellOneG1C10 = findViewById(R.id.Grd1Cell10);
        cellOneG1C11 = findViewById(R.id.Grd1Cell11);
        cellOneG1C12 = findViewById(R.id.Grd1Cell12);
        cellOneG1C13 = findViewById(R.id.Grd1Cell13);
        die3 = findViewById(R.id.die3);
        die4 = findViewById(R.id.die4);
        die5 = findViewById(R.id.die5);
        die6 = findViewById(R.id.die6);
        die7 = findViewById(R.id.die7);
        die8 = findViewById(R.id.die8);
        die9 = findViewById(R.id.die9);
        die10 = findViewById(R.id.die10);
        die11 = findViewById(R.id.die11);
        die12 = findViewById(R.id.die12);
        die13 = findViewById(R.id.die13);
        die14 = findViewById(R.id.die14);

        nextOneD = findViewById(R.id.nextactD);
        mpD = MediaPlayer.create(this, R.raw.roll);
        diceResultD = findViewById(R.id.resultatOfDiceD);
        diceResultD1 = findViewById(R.id.resultatOfDiceD1);
        diceResultD2 = findViewById(R.id.resultatOfDiceD2);



        Cellule celG1T1 = new Cellule(cellOneG1C1,cellOneG1C1.getText().toString());
        Cellule celG1T2 = new Cellule(cellOneG1C2,cellOneG1C2.getText().toString());
        Cellule celG1T3 = new Cellule(cellOneG1C3,cellOneG1C3.getText().toString());
        Cellule celG1T4 = new Cellule(cellOneG1C4,cellOneG1C4.getText().toString());
        Cellule celG1T5 = new Cellule(cellOneG1C5,cellOneG1C5.getText().toString());
        Cellule celG1T6 = new Cellule(cellOneG1C6,cellOneG1C6.getText().toString());
        choiceGrid1.add(celG1T1);
        choiceGrid1.add(celG1T2);
        choiceGrid1.add(celG1T3);
        choiceGrid1.add(celG1T4);
        choiceGrid1.add(celG1T5);
        choiceGrid1.add(celG1T6);

        System.out.println("LA TAILLE DE LA GRILLE EST:" + choiceGrid1.size());

        nextOneD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiceActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



        for(Cellule c : choiceGrid1)
            //System.out.println(c.getNumberChoice());
            btnChoice( c );





        diceContainer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                try {
                    // In a try block call rollDice() method to show the
                    // dice roll animation. We'll define this method below.
                    rollDice();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



    }

    private void rollDice() {
        // Define a Runnable object
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // In the run() method, use a for loop to iterate
                // some code to show rolling dice animation
                for (int i = 0; i < rollAnimationsd; i++) {
                    // Generate two random numbers between 1 and 6
                    // and store them in two integer variables
                    int dice1 = random.nextInt(6) + 1;
                    int dice2 = random.nextInt(6) + 1;
                    int dice3 = random.nextInt(6) + 1;
                    int dice4 = random.nextInt(6) + 1;
                    int dice5 = random.nextInt(6) + 1;
                    int dice6 = random.nextInt(6) + 1;
                    int dice7 = random.nextInt(6) + 1;
                    int dice8 = random.nextInt(6) + 1;
                    int dice9 = random.nextInt(6) + 1;
                    int dice10 = random.nextInt(6) + 1;
                    int dice11 = random.nextInt(6) + 1;
                    int dice12 = random.nextInt(6) + 1;

                    resultatDiceD = String.valueOf(dice1 + dice2 + dice3 + dice4);
                    diceResultD.setText(resultatDiceD);
                    resultatDiceD1 = String.valueOf(dice5 + dice6 + dice7 + dice8);
                    diceResultD1.setText(resultatDiceD1);
                    resultatDiceD2 = String.valueOf(dice9 + dice10 + dice11 + dice12);
                    diceResultD2.setText(resultatDiceD2);

                    // Get the Image ids from diceImages array
                    // using the above random numbers as array-index.
                    // Then, set the ImageViews for die1 and die2 with them.
                    die3.setImageResource(diceImagesd[dice1 - 1]);
                    die4.setImageResource(diceImagesd[dice2 - 1]);
                    die5.setImageResource(diceImagesd[dice3 - 1]);
                    die6.setImageResource(diceImagesd[dice4 - 1]);
                    die7.setImageResource(diceImagesd[dice5 - 1]);
                    die8.setImageResource(diceImagesd[dice6 - 1]);
                    die9.setImageResource(diceImagesd[dice7 - 1]);
                    die10.setImageResource(diceImagesd[dice8 - 1]);
                    die11.setImageResource(diceImagesd[dice9 - 1]);
                    die12.setImageResource(diceImagesd[dice10 - 1]);
                    die13.setImageResource(diceImagesd[dice11 - 1]);
                    die14.setImageResource(diceImagesd[dice12 - 1]);

                    try {
                        // In a try block sleep the thread for a
                        // smooth animation
                        Thread.sleep(delayTimed);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // Define a Thread object and pass the runnable object
        // in the constructor.
        Thread thread = new Thread(runnable);
        // Start the thread. This will cause the run() method to be called
        // where all the dice rolling animation happens.
        thread.start();
        // If the MediaPlayer object is not null then start playing
        // the music.
        if (mpD != null) {
            mpD.start();
        }
    }
    
    private void btnChoice( Cellule cellule ){

        cellule.getTvChoice().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DiceActivity.this, cellule.getNumberChoice(),Toast.LENGTH_LONG).show();
                cellule.getTvChoice().setBackgroundColor(Color.parseColor("#ff0000"));
            }
        });
    }
}