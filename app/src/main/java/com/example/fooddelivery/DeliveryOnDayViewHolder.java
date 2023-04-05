package com.example.fooddelivery;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.databinding.DeliveryOnDayItemBinding;

public class DeliveryOnDayViewHolder extends RecyclerView.ViewHolder {

    public DeliveryOnDayItemBinding binding;

    public DeliveryOnDayViewHolder(DeliveryOnDayItemBinding deliveryOnDayItemBinding) {
        super(deliveryOnDayItemBinding.getRoot());
        binding = deliveryOnDayItemBinding;
    }
}
