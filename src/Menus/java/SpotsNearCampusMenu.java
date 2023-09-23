package Menus.java;

import UserContributions.java.Contributions;
import UserContributions.java.PlacesToEat;
import UserContributions.java.SpotsNearCampus;

import java.util.Scanner;

public class SpotsNearCampusMenu extends ContributeInfoMenu {


    public void addPlace(String header, String description){
        SpotsNearCampus.addContribution(header, description);
    }
}
