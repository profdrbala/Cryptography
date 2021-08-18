package RSA;


import java.io.File;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;

/**
 *
 * @author Dr.Bala
 */
public class RSADec {
    public static void main(String[] args) throws Exception {
    //read the privare key from file
    byte[] keyBytes = Files.readAllBytes(new File("KeyPair/privateKey.txt").toPath());
    
    //load the specific key
    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(keyBytes);
    PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);

    // Read plain text
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Cipher Text");
    String ciphertext=sc.nextLine();

    //Create and Initialize the Cipher
    Cipher dcipher = Cipher.getInstance("RSA");
    dcipher.init(Cipher.DECRYPT_MODE, privateKey);
    
    //Decryption
    byte[] deccipherbytes =Base64.getDecoder().decode(ciphertext);
    byte[] decplainbytes = dcipher.doFinal(deccipherbytes);
    String decryptedplaintext=new String(decplainbytes, "UTF32");
    System.out.println(" Decrypted Plain Text:" + decryptedplaintext);
    }
    
}
