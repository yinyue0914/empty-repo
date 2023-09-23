package UserContributions.java;

import java.util.ArrayList;
import java.util.Objects;

public class Contributions {

    private static ArrayList<StudySpaces> studySpaceArrayList = new ArrayList<StudySpaces>();
    private static ArrayList<PlacesToEat> placesToEatArrayList = new ArrayList<PlacesToEat>();
    private static ArrayList<SpotsNearCampus> spotsNearCampusArrayList = new ArrayList<SpotsNearCampus>();


    public Contributions(){


    }


    //getter ------------------------------------------------------------------




    //setter ----------------------------------------------------------------------




    //--------------------------------------------------------------------------------------

    public static void addContribution(int i, String header, String description){
        switch (i){
            //1-spot
            //2-places
            //3-study
            case 1:
                SpotsNearCampus spotsNearCampus = new SpotsNearCampus(header, description);
                spotsNearCampusArrayList.add(spotsNearCampus);
                break;
            case 2:
                PlacesToEat placesToEat = new PlacesToEat(header, description);
                placesToEatArrayList.add(placesToEat);
                break;
            case 3:
                StudySpaces studySpaces = new StudySpaces(header, description);
                studySpaceArrayList.add(studySpaces);
                break;
                default:
                throw new IllegalStateException("Unexpected value: " + i);
        }

    }




}
