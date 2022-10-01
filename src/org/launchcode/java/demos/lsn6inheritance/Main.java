package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main (String[] args) {
        HouseCat oscar = new HouseCat("Oscar", 8);
        oscar.eat();
        System.out.println(oscar.isTired());

        HouseCat oliver = new HouseCat("Oscar");
        System.out.println(oliver.getWeight());

        //Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        //System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"
    }
}
