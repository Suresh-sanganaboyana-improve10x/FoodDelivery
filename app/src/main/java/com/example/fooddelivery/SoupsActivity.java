package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class SoupsActivity extends AppCompatActivity {

    private ArrayList<Soups> soupList = new ArrayList<Soups>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soups);
        setupData();
    }

    public void setupData() {
        Soups soups = new Soups();
        soups.typeOfSoup = "Chicken soup";
        soups.details = "Chicken, vegetables, butter, tiny pasta, green beans, carrots,...";
        soups.servingNumber = "2";
        soups.weightGr = "345gr";
        soupList.add(soups);
    }
}