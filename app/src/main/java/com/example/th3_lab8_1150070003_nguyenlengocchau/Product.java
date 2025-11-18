package com.example.th3_lab8_1150070003_nguyenlengocchau;

public class Product {
    int image;
    String title;
    String description;

    public Product(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() { return image; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
}