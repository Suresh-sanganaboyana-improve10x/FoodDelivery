package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fooddelivery.databinding.ActivitySoupsBinding;

import java.util.ArrayList;

public class SoupsActivity extends AppCompatActivity {

    public ActivitySoupsBinding binding;

    public ArrayList<Soups> soupList = new ArrayList<>();

    public SoupsAdapter soupsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySoupsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupData();
        setupSoupsRv();
    }

    public void setupData() {
        Soups soups = new Soups();
        soups.dp = "";
        soups.typeOfSoup = "Chicken soup";
        soups.details = "Chicken, vegetables, butter, tiny pasta, green beans, carrots,...";
        soups.servingNumber = "2";
        soups.weightGr = "345gr";
        soups.dollers = "8.00$";
        soupList.add(soups);
    }

    public void setupSoupsRv() {
        binding.soupsRv.setLayoutManager(new LinearLayoutManager(this));
        soupsAdapter = new SoupsAdapter();
        soupsAdapter.setData(soupList);
        binding.soupsRv.setAdapter(soupsAdapter);
    }
}