/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desprg;

import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
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
	Cipher cipher = Cipher.getInstance("DES"); // DES/ECB/PKCS5Padding for SunJCE

        cipher.init(Cipher.ENCRYPT_MODE, desKey);
        
        byte[] utf8 = plainText.getBytes("UTF8");
        // Encrypt
        byte[] enc = cipher.doFinal(utf8);
        
        // Encode bytes to base64 to get a string
        String cipherText= new sun.misc.BASE64Encoder().encode(enc);
        
        System.out.println("Plain Text :"+ plainText);
        System.out.println("Key :"+ String.valueOf(desKey));
        System.out.println("Cipher Text :"+cipherText);
        
    }
    
}
