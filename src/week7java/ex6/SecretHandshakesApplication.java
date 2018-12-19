package week7java.ex6;

public class SecretHandshakesApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator secretHandshakeMovesTranslator=new SecretHandshakeMovesTranslator();
        System.out.println(secretHandshakeMovesTranslator.getSecretHandshakeMoves(9299));
    }
}
