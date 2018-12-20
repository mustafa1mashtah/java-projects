package week7java.ex6;



public abstract class SecretHandshake {
    public String number;

    public SecretHandshake(String number) {
        this.number = number;
    }

    public abstract String getName();

    public Boolean isHandshakeTHere(String price) {

            if (!price.contains(number)) {
                return false;

            }




        return true;


    }
}
