package Menus.java;

import java.util.Scanner;

public class MainMenu extends AbstractMenu {

    User user;

    @Override
    public void displayMenu() {
        System.out.println("Pick action:");
        System.out.println("1: Contribute!");
        System.out.println("2: Create account");
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
            case 2:
                System.out.println("Enter Account name: ");
                String a = sc.nextLine();
                User u1 = new
        }
    }
}
