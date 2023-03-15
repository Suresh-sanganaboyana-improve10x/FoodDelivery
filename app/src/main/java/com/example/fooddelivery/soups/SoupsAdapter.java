package com.example.fooddelivery.soups;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.databinding.SoupsItem2Binding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SoupsAdapter extends RecyclerView.Adapter<SoupsViewHolder> {
    ArrayList<Soups> soupsArrayList;
    void setData(ArrayList<Soups> soupsArrayList) {
        this.soupsArrayList = soupsArrayList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public SoupsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SoupsItem2Binding binding = SoupsItem2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        SoupsViewHolder soupsViewHolder = new SoupsViewHolder(binding);
        return soupsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SoupsViewHolder holder, int position) {
        Soups soups = soupsArrayList.get(position);
        Picasso.get().load(soups.dp).into(holder.binding.soupImageUrl);
        holder.binding.soupTxt.setText(soups.typeOfSoup);
        holder.binding.detailsText.setText(soups.details);
        holder.binding.servingTxt.setText(soups.servingNumber);
        holder.binding.dollersText.setText(soups.dollers);
        holder.binding.weightText.setText(soups.weightGr);
    }

    @Override
    public int getItemCount() {
        return soupsArrayList.size();
    }
}
