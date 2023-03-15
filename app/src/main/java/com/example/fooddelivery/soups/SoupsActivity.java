package com.example.fooddelivery.soups;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.fooddelivery.databinding.ActivitySoupsBinding;
import com.example.fooddelivery.soups.Soups;
import com.example.fooddelivery.soups.SoupsAdapter;

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
        soups.dp = "https://victoriajunction.in/uploads/products/hot-sour-soup_1592725686.jpg";
        soups.typeOfSoup = "Chicken soup";
        soups.details = "Chicken, vegetables, butter, tiny pasta, green beans, carrots,...";
        soups.servingNumber = "2";
        soups.weightGr = "345gr";
        soups.dollers = "8.00$";
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
        soupList.add(soups);
    }

    public void setupSoupsRv() {
        binding.soupsRv.setLayoutManager(new LinearLayoutManager(this));
        binding.soupsPastryRv.setLayoutManager(new LinearLayoutManager(this));
        soupsAdapter = new SoupsAdapter();
        soupsAdapter.setData(soupList);
        binding.soupsRv.setAdapter(soupsAdapter);
        binding.soupsPastryRv.setAdapter(soupsAdapter);
    }
}