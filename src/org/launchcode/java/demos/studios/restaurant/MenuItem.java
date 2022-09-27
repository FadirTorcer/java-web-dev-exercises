package org.launchcode.java.demos.studios.restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

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

    public static boolean isBeforeDay(Calendar cal1, Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        if (cal1.get(Calendar.ERA) < cal2.get(Calendar.ERA)) return true;
        if (cal1.get(Calendar.ERA) > cal2.get(Calendar.ERA)) return false;
        if (cal1.get(Calendar.YEAR) < cal2.get(Calendar.YEAR)) return true;
        if (cal1.get(Calendar.YEAR) > cal2.get(Calendar.YEAR)) return false;
        return cal1.get(Calendar.DAY_OF_YEAR) < cal2.get(Calendar.DAY_OF_YEAR);
    }
    public boolean checkIfNew() {
        Calendar calendarAdded = Calendar.getInstance();
        calendarAdded.setTime(this.added);
        Calendar calendarFresh = Calendar.getInstance();
        calendarFresh.add(Calendar.DATE, -14); //2 weeks
        return (!isBeforeDay(calendarFresh, calendarAdded));
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", added=" + added +
                '}';
    }

    public void printItem() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && description.equals(menuItem.description) && category.equals(menuItem.category) && Objects.equals(added, menuItem.added);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, added);
    }
}
