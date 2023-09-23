import UserContributions.java.Contributions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class User {

    private String name;
    //arraylist
    ArrayList<ArrayList<Objects>> contributionsList = new ArrayList<>();

    public User(String name){
        this.name = name;

    }

    public static void displayAllContributions(ArrayList<ArrayList<Objects>> contributionsList) {
        for (ArrayList<Objects> innerList : contributionsList) {
            System.out.println("");
            for (Objects element : innerList) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }



}
