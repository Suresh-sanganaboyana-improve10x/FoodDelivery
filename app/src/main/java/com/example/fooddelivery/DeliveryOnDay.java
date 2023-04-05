package com.example.fooddelivery;

public class DeliveryOnDay {

    public String backImage;
    public String dayDateText;
    public String withinMinutes;
    public String starRatingText;
    public String profileImg;
    public String personName;
    public String nameWithCountry;

    public DeliveryOnDay() {

    }

    public DeliveryOnDay(String backImage, String dayDateText, String withinMinutes, String starRatingText,
                         String profileImg, String personName, String nameWithCountry) {
        this.backImage = backImage;
        this.dayDateText = dayDateText;
        this.withinMinutes = withinMinutes;
        this.starRatingText = starRatingText;
        this.profileImg = profileImg;
        this.personName = personName;
        this.nameWithCountry = nameWithCountry;

    }

}
