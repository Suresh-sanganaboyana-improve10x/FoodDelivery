package com.example.fooddelivery;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.databinding.SoupsItem1Binding;
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
        SoupsItem1Binding binding = SoupsItem1Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        SoupsViewHolder soupsViewHolder = new SoupsViewHolder(binding);
        return soupsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SoupsViewHolder holder, int position) {
        Soups soups = soupsArrayList.get(position);
        holder.binding.typesOfSoups.setText(soups.typeOfSoup);
        holder.binding.detailsTxt.setText(soups.details);
        holder.binding.servingNumberTxt.setText(soups.servingNumber);
        holder.binding.dollerTxt.setText(soups.dollers);
        holder.binding.weightTxt.setText(soups.weightGr);
    }

    @Override
    public int getItemCount() {
        return soupsArrayList.size();
    }
}
