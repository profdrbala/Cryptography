/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsaprg;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;
import javax.crypto.Cipher;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 *
 * @author bala
 */
public class RSAPrg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Key Generation
    KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
    kpg.initialize(1024);
    KeyPair keypair = kpg.generateKeyPair();
    PrivateKey privateKey = keypair.getPrivate();
    PublicKey publicKey = keypair.getPublic();
        System.out.println("Private key " + privateKey.getEncoded());
    // Read plain text
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Plain Text ( Message )");
    String plaintext=sc.nextLine();
    //Create and Initialize the Cipher
    Cipher ecipher = Cipher.getInstance("RSA");
    Cipher dcipher = Cipher.getInstance("RSA");
    ecipher.init(Cipher.ENCRYPT_MODE, publicKey);
    dcipher.init(Cipher.DECRYPT_MODE, privateKey);
    //Encryption
    byte[] plainbytes = plaintext.getBytes();
    byte[] cipherbytes = ecipher.doFinal(plainbytes);
    String ciphertext=new BASE64Encoder().encode(cipherbytes);
    System.out.println(" Plain Text:" + plaintext);
    System.out.println(" Cipher Text:" + ciphertext);
    byte[] deccipherbytes = new BASE64Decoder().decodeBuffer(ciphertext);
    byte[] decplainbytes = dcipher.doFinal(deccipherbytes);
    String decryptedplaintext=new String(decplainbytes, "UTF8");
    System.out.println(" Decrypted Plain Text:" + decryptedplaintext);
    }
    
}
