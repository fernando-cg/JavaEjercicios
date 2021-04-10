package cifrados;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.Cipher;

public class rsa
{
    static String plainText = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que viva un hidalgo de los de lanza en astillero, adarga antigua, rocon flaco y galgo corredor.";
    
    public static void main(String[] args) throws Exception
    {
        // Get an instance of the RSA key generator
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(4096);
        
        // Generate the KeyPair
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        
        // Get the public and private key
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        
        System.out.println("Original : "+plainText);
        
        // Encrypt
        byte[] cipherTextArray = encrypt(plainText, publicKey);
        String encryptedText = Base64.getEncoder().encodeToString(cipherTextArray);
        System.out.println("Crifrado : "+encryptedText);
        
        // Decrypt
        String decryptedText = decrypt(cipherTextArray, privateKey);
        System.out.println("Descifrado : "+decryptedText);
    }
    
    public static byte[] encrypt (String plainText,PublicKey publicKey ) throws Exception
    {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
        
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        
        byte[] cipherText = cipher.doFinal(plainText.getBytes()) ;

        return cipherText;
    }
    
    public static String decrypt (byte[] cipherTextArray, PrivateKey privateKey) throws Exception
    {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
        
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        
        byte[] decryptedTextArray = cipher.doFinal(cipherTextArray);
        
        return new String(decryptedTextArray);
    }
}