package com.example.fooddelivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;

import com.example.fooddelivery.databinding.ActivityDeliveryOnDayBinding;

import java.util.ArrayList;

public class DeliveryOnDayActivity extends AppCompatActivity {

    public ArrayList<DeliveryOnDay> deliveryOnDays = new ArrayList<>();
    public ActivityDeliveryOnDayBinding binding;
    public DeliveryOnDayAdapter deliveryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDeliveryOnDayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupData();
        setupDeliveryRv();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return false;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void setupData() {
        DeliveryOnDay deliveryOnDay = new DeliveryOnDay("https://mytastycurry.com/wp-content/uploads/2016/05/quick-and-delicious-hyderabadi-dum-style-chicken-biryani-recipe-with-step-by-step-instructional-video.1024x1024.jpg",
                "TUSEDAY 01", "12min", "4.8",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPO7pH5CNgBWfWOa8jP-ZcdP79t54dnT0rnqD5eZuxY6qRi23JNl7UNcvvX1fGWKx2pqE&usqp=CAU",
                "B's Balkans H...", "ARABIC,INTERNATIONAL");
        deliveryOnDays.add(deliveryOnDay);
        deliveryOnDays.add(deliveryOnDay);
        deliveryOnDays.add(deliveryOnDay);
        deliveryOnDays.add(deliveryOnDay);
        deliveryOnDays.add(deliveryOnDay);
        deliveryOnDays.add(deliveryOnDay);
        deliveryOnDays.add(deliveryOnDay);
        deliveryOnDays.add(deliveryOnDay);
    }

    public void setupDeliveryRv() {
        binding.deliveryRv.setLayoutManager(new LinearLayoutManager(this));
        deliveryAdapter =  new DeliveryOnDayAdapter();
        deliveryAdapter.setData(deliveryOnDays);
        binding.deliveryRv.setAdapter(deliveryAdapter);
    }
}