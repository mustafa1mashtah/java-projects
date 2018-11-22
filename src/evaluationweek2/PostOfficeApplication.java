package evaluationweek2;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {
    public static void main(String[] args) {
        Letter letter = new Letter("hallo123");
        PostOfficeAssistant postOfficeAssistant = new PostOfficeAssistant();
        postOfficeAssistant.stamp(letter);
        postOfficeAssistant.send(letter);
        Letter letter1 = new Letter("456");
        Letter letter2 = new Letter("789");
        Letter letter3 = new Letter("0148");

        List<Letter> letters =new ArrayList<>();
        Postman postman = new Postman(letters);
        letters.add(letter1);
        letters.add(letter2);
        letters.add(letter3);
        postman.deliver();


    }

}
//In the PostOfficeApplication class main method,
// create a Letter and a PostOfficeAssistant, and use it to stamp the letter and then send it.
//In the PostOfficeApplication class main method, create three letters and a Postman with them,
// and use it to deliver all the letters.