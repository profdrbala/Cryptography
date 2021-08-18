/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aesprg;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author bala
 */
public class AESPrg {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)throws Exception {
        // Generate Key
        SecretKey key = KeyGenerator.getInstance("AES").generateKey();
        // Read the Plain Text
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Plain Text ( Message )");
        String plaintext=sc.nextLine();
        // Create and Initialize Cipher Object for encryption
        Cipher ecipher;
        ecipher = Cipher.getInstance("AES");
        ecipher.init(Cipher.ENCRYPT_MODE, key);
        // Convert Plain Text into Binary
        byte[] binplain = plaintext.getBytes("UTF8");
        // Encrypt the Plain Text
        byte[] binencrypt = ecipher.doFinal(binplain);
        // Convert the binary ciphertext to string
        String ciphertext= new sun.misc.BASE64Encoder().encode(binencrypt);
        System.out.println("Plain Text:" + plaintext);
        System.out.println("Cipher Text:" + ciphertext);
        // Create and Initialize Cipher Object for decryption
        Cipher dcipher;
        dcipher = Cipher.getInstance("AES");
        dcipher.init(Cipher.DECRYPT_MODE, key);
        // Convert cipher text to binary
        byte[] bincipher = new sun.misc.BASE64Decoder().decodeBuffer(ciphertext);
        // Decryption
        byte[] bindecrypt = dcipher.doFinal(bincipher);
        // Convert the binary plaintext to string
        String decplain= new String(bindecrypt, "UTF8");
        System.out.println("Decrypted Plain Text:" + decplain);
    }
    
}
