package week2;

import java.util.ArrayList;
import java.util.List;

public class Jornalist {
    public List<Kid>getNeighborhoodKids(){
        List<Kid>kids=new ArrayList<>();
        Kid jimmy=new Kid("jimmy",10);
        kids.add(jimmy);
        kids.add(new Kid("riyad",100));
        kids.add(new Kid("sam",16));
        kids.add(new Kid("pamela",11));
        return kids;

    }
}
