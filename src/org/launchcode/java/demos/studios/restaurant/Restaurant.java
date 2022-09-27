package org.launchcode.java.demos.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main (String[] args) {

        Date firstDay = new Date();
        ArrayList<MenuItem> firstMenu = new ArrayList<>();

        MenuItem quesadilla = new MenuItem(4.99, "Cheese Quesadillas", "Appetizer", firstDay);
        MenuItem tamales = new MenuItem(6.99, "Pork Tamales", "Main", firstDay);
        MenuItem burrito = new MenuItem(8.99, "Beef Burrito", "Main", firstDay);
        MenuItem mangoPie = new MenuItem(3.99, "Mango Pie", "Desert", firstDay);

        firstMenu.add(quesadilla);
        firstMenu.add(tamales);
        firstMenu.add(burrito);
        firstMenu.add(mangoPie);

        Menu myMenu = new Menu(firstMenu, firstDay);
        myMenu.printMenu();
        System.out.println("\nInterested in desert?");
        mangoPie.printItem();

        //check removing an item
        myMenu.dropItem(tamales);
        myMenu.printMenu();
    }
}
