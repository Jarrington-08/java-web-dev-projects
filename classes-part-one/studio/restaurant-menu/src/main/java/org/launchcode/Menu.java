package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        this.items.remove(this.items.indexOf(item));
        this.lastUpdated = new Date();
    }

    public String isNew(MenuItem item) {
        if (item.isNew()) {
            return "This menu item is new";
        }
        return "This menu item is not new";
    }

    public String lastUpdated() {
        return "The menu was last updated on " + lastUpdated;
    }

    public void printMenu() {
        for (MenuItem item : this.items) {
            System.out.println(item.toString());
        }
    }

    public void printMenuItem(MenuItem item) {
        //update this later to make the formatting nicer and more helpful
        System.out.println(item.toString());
    }


    public String isEquals(MenuItem itemOne, MenuItem itemTwo) {
        if (itemOne.equals(itemTwo)) {
            return "They are the same menu items";
        }
        return "They are not the same menu items";
    }
}
