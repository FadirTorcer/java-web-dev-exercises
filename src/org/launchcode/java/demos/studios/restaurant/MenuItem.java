package org.launchcode.java.demos.studios.restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date added;

    public MenuItem(double price, String description, String category, Date added) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.added = added;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getAdded() {
        return added;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAdded(Date added) {
        this.added = added;
    }
}
