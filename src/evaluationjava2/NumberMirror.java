package evaluationjava2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {
    public Integer mirror(Integer number) {


        String newNumber = number.toString();
        String[] split = newNumber.split("");
        List<String> numbers = new ArrayList<>(Arrays.asList(split));
        Collections.reverse(numbers);
        String reversed = "";
        for (String string : numbers) {
            reversed += string;
        }
        Integer reversedNumber = Integer.valueOf(reversed);
        return reversedNumber;


    }
    public Integer specialMirror(Integer number){
        String newNumber = number.toString();
        String[] split = newNumber.split("");
        List<String> numbers = new ArrayList<>(Arrays.asList(split));
        String modifedNumbers="";
        for (String string:numbers
             ) {
            Integer modifidNumber = Integer.valueOf(string);
            if (modifidNumber==9){
                modifidNumber=0;
            }
            else {
                modifidNumber += 1;
            }
                String newNumber1 = modifidNumber.toString();
                modifedNumbers = modifedNumbers + newNumber1;


        }
        Integer modifedNumber = Integer.valueOf(modifedNumbers);

        return modifedNumber;


    }


}
