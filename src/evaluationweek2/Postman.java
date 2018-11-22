package evaluationweek2;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    private List<Letter>letters=new ArrayList<>();

    public Postman(List<Letter> letters) {
        this.letters = letters;
    }



    public void deliver(){
        while (letters.size()>0){
            Letter letter=letters.get(0);
            System.out.println("i delivered the letter to the address "+ letter.getAddress());
            letters.remove(letter);

        }


    }

}
//Create the class Postman that has a list of Letter.
// It has the deliver method that goes through all the letters he has and one by one,
// says that he delivered it to its address and removes it from his list (until there are no more letters left).