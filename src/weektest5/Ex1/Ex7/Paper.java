package weektest5.Ex1.Ex7;

public class paper implements move {
    @Override
    public String getName() {
        return "paper";
    }

    @Override
    public Boolean moveWinn(String move) {
        if (move.equals("rock")){
            return true;
        }
        return false;
    }
}
