package com.example.fooddelivery;

public class Soups {
    public String typeOfSoup;
    public String details;
    public String servingNumber;
    public String weightGr;
    public String dollers;

    public Soups() {
    }

    public Soups(String typeOfSoup, String details, String servingNumber, String weightGr, String dollers) {
        this.typeOfSoup = typeOfSoup;
        this.details = details;
        this.servingNumber = servingNumber;
        this.weightGr = weightGr;
        this.dollers = dollers;
    }
}
