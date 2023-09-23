// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Menus.java.AbstractMenu;
import Menus.java.MainMenu;

import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args){

        Main start1 = new Main();
        start1.start();


    }

    //tbh basically all this stack push pop stuff is copied
    //private static Stack<AbstractMenu> menuStack = new Stack<>();


    public void start() {

        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
        mainMenu.handleUserInput();
        /*menuStack.push(mainMenu);

        while (!menuStack.isEmpty()) {
            AbstractMenu currentMenu = menuStack.peek();
            currentMenu.displayMenu();
            currentMenu.handleUserInput();

            // After handling user input, you can implement a "back" option
            if (currentMenu instanceof MainMenu) {
                // Don't allow "back" from the main menu
                continue;
            }else {
                System.out.println("0. Go Back");
            }

            int choice = getUserInput();

            if (choice == 0 && !(currentMenu instanceof MainMenu)) {
                // User wants to go back, pop the current menu from the stack
                menuStack.pop();
            } else {
                currentMenu.processUserChoice(choice);
            }

         */


        }
    }
}