package week3java.ex12;


import week3java.ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterReader {

    public List<Character> getCharacters(String filePath) {
        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.getLines(filePath);
        List<Character> characterList = new ArrayList<>();


        for (String line : lines
        ) {
            String[] split = line.split(";");
            List<String> data = new ArrayList<>(Arrays.asList(split));
            String name = data.get(0);
            String bookOfDeath = data.get(3);
            String gender = data.get(6);
            Character character = new Character(name, bookOfDeath, gender);
            characterList.add(character);


        }


        return characterList;


    }


}


//Create the CharacterReader class that has the getCharacters method that receives a filePath,
// uses a FileReader to read its lines,
// transforms them into Characters and returns them.