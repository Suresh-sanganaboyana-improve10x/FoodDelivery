package com.example.fooddelivery;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.databinding.SoupsItem1Binding;


public class SoupsViewHolder extends RecyclerView.ViewHolder {

    public SoupsItem1Binding binding;

    public SoupsViewHolder(SoupsItem1Binding soupsItem1Binding) {
        super(soupsItem1Binding.getRoot());
        binding = soupsItem1Binding;
    }
}
