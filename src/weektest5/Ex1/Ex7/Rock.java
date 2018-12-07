package weektest5.Ex1.Ex7;

public class rock implements move {
    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public Boolean moveWinn(String move) {
        if (move.equals("scissors")){
            return true;
        }
        return false;

    }
}
