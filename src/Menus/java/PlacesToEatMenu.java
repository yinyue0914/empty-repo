package Menus.java;

import UserContributions.java.PlacesToEat;

import java.util.Scanner;


public class PlacesToEatMenu extends ContributeInfoMenu {





    public void addPlace(String header, String description){

        PlacesToEat.addContribution(2, header, description);
    }
}
