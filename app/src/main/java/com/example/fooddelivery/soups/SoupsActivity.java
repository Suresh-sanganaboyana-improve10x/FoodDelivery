package com.example.fooddelivery.soups;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fooddelivery.DeliveryOnDayActivity;
import com.example.fooddelivery.R;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.soups_menu_delivery, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.soups_menu_del) {
            Intent intent = new Intent(this, DeliveryOnDayActivity.class);
            startActivity(intent);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }


    public void setupData() {
        Soups soups = new Soups(
                "https://victoriajunction.in/uploads/products/hot-sour-soup_1592725686.jpg",
                "Chicken soup",
                "Chicken, vegetables, butter, tiny pasta, green beans, carrots,...",
                "2", "345gr", "8.00$");
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