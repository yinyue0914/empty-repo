package Menus.java;

import java.util.Scanner;

public class MainMenu extends AbstractMenu {


    @Override
    public void displayMenu() {
        System.out.println("Pick action:");
        System.out.println("1: Contribute!");
    }

    @Override
    public void handleUserInput() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                ContributeInfoMenu contributeInfoMenu = new ContributeInfoMenu();
                contributeInfoMenu.displayMenu();
                contributeInfoMenu.handleUserInput();
                break;
        }
    }
}
