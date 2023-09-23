package Menus.java;
import java.util.Scanner;



//places to eat, spots near campus, study spaces do not extend to abstract menu
//abstract menu is only for those who want one dispaly and one input
public abstract class AbstractMenu {

    public AbstractMenu(){
        Scanner sc = new Scanner(System.in);
    }



    public abstract void displayMenu();
    public abstract void handleUserInput();



}
