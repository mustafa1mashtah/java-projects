package week2;

import java.util.List;

public class HalloweenAplication {

    public static void main(String[] args) {

        Jornalist jornalist=new Jornalist();
        List<Kid>kids=jornalist.getNeighborhoodKids();
        HalloweenJudge judge=new HalloweenJudge();
        judge.displayWhoIsTheWinner(kids);

    }
}
