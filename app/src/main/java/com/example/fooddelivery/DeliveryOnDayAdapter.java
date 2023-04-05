package com.example.fooddelivery;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.databinding.DeliveryOnDayItemBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DeliveryOnDayAdapter extends RecyclerView.Adapter<DeliveryOnDayViewHolder> {

    ArrayList<DeliveryOnDay> deliveryOnDays;
    void setData(ArrayList<DeliveryOnDay> deliveryOnDays) {
        this.deliveryOnDays = deliveryOnDays;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public DeliveryOnDayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DeliveryOnDayItemBinding binding = DeliveryOnDayItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        DeliveryOnDayViewHolder deliveryOnDayViewHolder = new DeliveryOnDayViewHolder(binding);
        return deliveryOnDayViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryOnDayViewHolder holder, int position) {
        DeliveryOnDay deliveryOnDay = deliveryOnDays.get(position);
        Picasso.get().load(deliveryOnDay.backImage).into(holder.binding.backImageImg);
        Picasso.get().load(deliveryOnDay.profileImg).into(holder.binding.profileImageImg);
        holder.binding.dayDateText.setText(deliveryOnDay.dayDateText);
        holder.binding.personNameTxt.setText(deliveryOnDay.personName);
        holder.binding.nameWithCountryTxt.setText(deliveryOnDay.nameWithCountry);
        holder.binding.starRatingTxt.setText(deliveryOnDay.starRatingText);
        holder.binding.withinMinutesTxt.setText(deliveryOnDay.withinMinutes);
    }

    @Override
    public int getItemCount() {
        return deliveryOnDays.size();
    }
}
