package Menus.java;

import UserContributions.java.PlacesToEat;
import UserContributions.java.StudySpaces;

public class StudySpacesMenu extends ContributeInfoMenu{


    public void addPlace(String header, String description){

        StudySpaces.addContribution(3,header, description);
    }
}
