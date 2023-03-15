package com.example.fooddelivery.soups;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.databinding.SoupsItem1Binding;
import com.example.fooddelivery.databinding.SoupsItem2Binding;


public class SoupsViewHolder extends RecyclerView.ViewHolder {

    public SoupsItem2Binding binding;

    public SoupsViewHolder(SoupsItem2Binding soupsItem2Binding) {
        super(soupsItem2Binding.getRoot());
        binding = soupsItem2Binding;
    }
}
