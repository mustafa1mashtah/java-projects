package weektest5.Ex1.Ex7;

public class scissors implements move {
    @Override
    public String getName() {
        return "scissors";
    }

    @Override
    public Boolean moveWinn(String move) {
        if (move.equals("paper")){
            return true;
        }
        return false;
    }
}
