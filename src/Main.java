// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Menus.java.AbstractMenu;
import Menus.java.MainMenu;

import java.util.Scanner;
import java.util.Stack;


public class Main {

    //tbh basically all this stack push pop stuff is copied
    //private static Stack<AbstractMenu> menuStack = new Stack<>();


    public void start(){

        MainMenu mainMenu = new MainMenu();
        //menuStack.push(mainMenu);

        /*while (!menuStack.isEmpty()) {
            AbstractMenu currentMenu = menuStack.peek();
            currentMenu.displayMenu();
            currentMenu.handleUserInput();



            // After handling user input, you can implement a "back" option
            if (currentMenu instanceof MainMenu) {
                // Don't allow "back" from the main menu
                continue;
            }

         */


        mainMenu.displayMenu();
        mainMenu.handleUserInput();
        User u1 = new User();






    }


    public static void main(String[] args) {

        Main start1 = new Main();
        start1.start();;



    }
}