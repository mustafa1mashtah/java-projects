package week3java.ex12;

import java.util.List;

public class GotApplication {
    public static void main(String[] args) {
        CharacterReader characterReader = new CharacterReader();
        List<Character> characters = characterReader.getCharacters("week3java/ex12/got-characters.csv");
        int charactersNumber = characters.size();
        System.out.println("The characters number: " + charactersNumber);
        Integer deadCharactors = 0;
        for (Character character : characters) {
            if (!deadCharactors(character)) {
                deadCharactors++;

            }

        }
        System.out.println("Number of dead characters: " + deadCharactors);

        Integer deadMenCharactors = 0;
        Integer deadWomenCharactors = 0;

        for (Character character : characters) {
            if (!deadCharactors(character) && isMan(character)) {
                deadMenCharactors++;

            }
            if (!deadCharactors(character) && !isMan(character)) {
                deadWomenCharactors++;


            }

        }
        System.out.println("Dead men: " + deadMenCharactors + "/" + "Dead women: " + deadWomenCharactors);
        System.out.println("Dead men: " + (deadMenCharactors * 100) / deadCharactors + "% " + "Dead women: " + (deadWomenCharactors * 100) / deadCharactors + "%");


    }


    private static boolean isMan(Character character) {
        return character.getGender().equals("1");
    }

    private static boolean deadCharactors(Character character) {

        return character.getBookOfDeath().equals("");

    }


}
//Create the GotApplication class that has a main method that uses the CharacterReader to read the got-characters.
// csv and performs the code that answers the previously given questions.