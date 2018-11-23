package week32.ex1.EX4;

public class Messenger {
    private Encryptor encryptor=new Encryptor();
    private Decryptor decryptor=new Decryptor();



    public String send(String message){
        String encryptedMessage= encryptor.encrypt(message);
        System.out.println("the encrypted message is "+ encryptedMessage);
        return encryptedMessage;

}
    public void receives(String message){
        String decryptedMessage= decryptor.decrypt(message);
        System.out.println("the encrypted message is "+ decryptedMessage);

    }










}
//The Messenger has an encryptor and a decryptor as attributes.
// It has the send method that receives a String, encrypts it and displays the encrypted message.
// It has the receive method that receives a String, decrypts it and displays the decrypted message.