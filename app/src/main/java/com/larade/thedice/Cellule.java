package com.larade.thedice;

import android.widget.TextView;

public class Cellule {

   private TextView tvChoice;
   private String numberChoice;

    public Cellule(TextView tvChoice, String numberChoice) {
        this.tvChoice = tvChoice;
        this.numberChoice = numberChoice;
    }

    public TextView getTvChoice() {
        return tvChoice;
    }

    public void setTvChoice(TextView tvChoice) {
        this.tvChoice = tvChoice;
    }

    public String getNumberChoice() {
        return numberChoice;
    }

    public void setNumberChoice(String numberChoice) {
        this.numberChoice = numberChoice;
    }





}


