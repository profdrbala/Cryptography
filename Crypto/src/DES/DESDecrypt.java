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
public class DESDecrypt {
     public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cipher Text");
        String cipherText=sc.nextLine();
        System.out.println("Enter the key Text");
        String keyText=sc.nextLine();

        DESKeySpec dks = new DESKeySpec(keyText.getBytes());
	SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
	SecretKey desKey = skf.generateSecret(dks);
	Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding"); // DES/ECB/PKCS5Padding for SunJCE

        cipher.init(Cipher.DECRYPT_MODE, desKey);
        //base64 formate of cipher text
        byte[] enc = Base64.getDecoder().decode(cipherText);
        //decryption
        byte[] dec=cipher.doFinal(enc);
        
        String plainText= new String(dec, "UTF16"); //utf7 utf8 utf16 utf32
        System.out.println("Plain Text :"+ plainText);
     }
}
