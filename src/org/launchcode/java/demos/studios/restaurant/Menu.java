package org.launchcode.java.demos.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuList;
    private Date updated;

    public Menu(ArrayList<MenuItem> menuList, Date updated) {
        this.menuList = menuList;
        this.updated = updated;
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setMenuList(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public void addItem (MenuItem newItem) {
        this.menuList.add(newItem);
    }

    public void dropItem (MenuItem oldItem) {
        this.menuList.remove(oldItem);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuList=" + menuList +
                '}';
    }

    public void printMenu() {
        System.out.println("\n*****\nToday's Menu!\n*****");
        for (MenuItem tastyTidbit : this.menuList) {
            if (tastyTidbit.checkIfNew()) {System.out.print("* New Item! *");}
            tastyTidbit.printItem();
        }
        System.out.println("*****");
    }
}
