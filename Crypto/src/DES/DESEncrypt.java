/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DES;

import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author bala
 */
public class DESEncrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Plain Text");
        String plainText=sc.nextLine();
        System.out.println("Enter the key Text");
        String keyText=sc.nextLine();

        
        DESKeySpec dks = new DESKeySpec(keyText.getBytes());
	SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
	SecretKey desKey = skf.generateSecret(dks);
	Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding"); 
        //DES/CBC/NoPadding (56)
        //DES/CBC/PKCS5Padding (56)
        //DES/ECB/NoPadding (56)
        //DES/ECB/PKCS5Padding (56)
        
        cipher.init(Cipher.ENCRYPT_MODE, desKey);
        
        byte[] utf = plainText.getBytes("UTF16"); //utf7 utf8 utf16 utf32
        // Encrypt
        byte[] enc = cipher.doFinal(utf);
        
        // Encode bytes to base64 to get a string
        String cipherText=Base64.getEncoder().encodeToString(enc);
        
        System.out.println("Cipher Text :"+cipherText);
        
    }
    
}
