/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;
import java.io.File;
import java.io.FileOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
/**
 *
 * @author bala
 */
public class RSAEnc {

    public static void main(String[] args) throws Exception {
    
    //Key Generation
    KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
    kpg.initialize(1024);    
    KeyPair keypair = kpg.generateKeyPair();
    PrivateKey privateKey = keypair.getPrivate();
    PublicKey publicKey = keypair.getPublic();
    
    //write the key in file system
    File f = new File("KeyPair/privateKey.txt");
    f.getParentFile().mkdirs();
    FileOutputStream fos = new FileOutputStream(f);
    fos.write(privateKey.getEncoded());
    fos.close();
        

    // Read plain text
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Plain Text");
    String plaintext=sc.nextLine();
    
    
    //Create and Initialize the Cipher
    Cipher ecipher = Cipher.getInstance("RSA");
    ecipher.init(Cipher.ENCRYPT_MODE, publicKey);
    
    //Encryption
    byte[] plainbytes = plaintext.getBytes("UTF32");
    byte[] cipherbytes = ecipher.doFinal(plainbytes);
    String ciphertext=Base64.getEncoder().encodeToString(cipherbytes);
   
    System.out.println(" Cipher Text:" + ciphertext);
    
    }
    
}
