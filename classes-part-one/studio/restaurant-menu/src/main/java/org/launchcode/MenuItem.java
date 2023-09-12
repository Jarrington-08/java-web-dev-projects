package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    private String name;

    public MenuItem(String n, double p, String d, String c, boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
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

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setName(String aName) { name = aName; }

    public String getDescription() { return this.description; }
    public boolean isNew() {
        return isNew;
    }

    @Override
    public boolean equals(Object toBeCompared) {

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem theMenuItem = (MenuItem) toBeCompared;
        return theMenuItem.getDescription().equals(getDescription());
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n%.2f\n\n", this.name, this.description, this.price);
    }

}
