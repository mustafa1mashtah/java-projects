package week2.ex2.gather;

import week2.ex1.exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GathererAgent {

    public List<Hiker> signUp(){
        AutomaticGatherer   automaticGatherer=new AutomaticGatherer();
        List<Hiker>hikers=automaticGatherer.getConfirmedHikers();

        System.out.println("give me a name:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();


        while (!name.isEmpty()) {

            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            System.out.println("give me a name:");
            name = scanner.nextLine();
        }

            return hikers;

        }






    }

