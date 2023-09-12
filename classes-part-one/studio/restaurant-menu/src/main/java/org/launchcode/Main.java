package org.launchcode;

import java.util.Date;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu(new Date(), new ArrayList<>());

        MenuItem frenchDip = new MenuItem("French Dip", 10.95, "A classic sandwich made from fresh ingredients. Au jus on the side.", "sandwich", true);
        MenuItem cuban = new MenuItem("Cuban", 9.95, "Traditional cuban with roast pork, ham, swiss cheese, pickles and yellow mustard.", "sandwich", true);

        menu.addMenuItem(frenchDip);
        menu.addMenuItem(cuban);

        menu.printMenu();
        menu.printMenuItem(cuban);

        menu.removeMenuItem(cuban);

        menu.printMenu();

    }
}
