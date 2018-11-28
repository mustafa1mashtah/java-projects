package week32.ex1.EX4;

public class HackerApplication {
    public static void main(String[] args) {

        String message="Musfives,tfa";
        Messenger messenger=new Messenger();
        String encryptedMessage= messenger.send(message);
        messenger.receives(encryptedMessage);
    }
}
