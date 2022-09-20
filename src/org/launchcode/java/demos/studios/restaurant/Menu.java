package org.launchcode.java.demos.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<String> menuList;
    private Date updated;

    public Menu(ArrayList<String> menuList, Date updated) {
        this.menuList = menuList;
        this.updated = updated;
    }

    public ArrayList<String> getMenuList() {
        return menuList;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setMenuList(ArrayList<String> menuList) {
        this.menuList = menuList;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
