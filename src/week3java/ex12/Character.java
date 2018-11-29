package week3java.ex12;

public class Character {
    String name;
    String bookOfDeath;
    String gender;

    public Character(String name, String bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name= " + name  +
                " bookOfDeath= " + bookOfDeath  +
                " gender= " + gender
                ;
    }

    public String getName() {
        return name;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }
}
