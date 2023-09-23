package Menus.java;

import java.util.Scanner;

public class AccountMenu extends AbstractMenu{
    @Override
    public void displayMenu() {
        System.out.println("1: See your posts");
    }

    @Override
    public void handleUserInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:



        }

    }
}
