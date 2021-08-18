/*
Stands for "Unicode Transformation Format." UTF refers to several types of Unicode character encodings, including UTF-7, UTF-8, UTF-16, and UTF-32.
UTF-7 - uses 7 bits for each character. It was designed to represent ASCII characters in email messages that required Unicode encoding.
UTF-8 - the most popular type of Unicode encoding. It uses one byte for standard English letters and symbols, two bytes for additional Latin and Middle Eastern characters, and three bytes for Asian characters. Additional characters can be represented using four bytes. UTF-8 is backwards compatible with ASCII, since the first 128 characters are mapped to the same values.
UTF-16 - an extension of the "UCS-2" Unicode encoding, which uses two bytes to represent 65,536 characters. However, UTF-16 also supports four bytes for additional characters up to one million.
UTF-32 - a multibyte encoding that represents each character with 4 bytes.
 */
package AES;

import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author bala
 */
public class AESDecrypt {
     public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cipher Text");
        String cipherText=sc.nextLine();
        System.out.println("Enter the key Text");
        String keyText=sc.nextLine();
        
        SecretKeySpec skeySpec = new SecretKeySpec(keyText.getBytes(), "AES");
        
	Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); // AES/ECB/PKCS5Padding
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);

        //base64 formate of cipher text
        byte[] enc = Base64.getDecoder().decode(cipherText);
        //decryption
        byte[] dec=cipher.doFinal(enc);        

        String dplainText= new String(dec, "UTF32"); //utf7 utf8 utf16 utf32

        System.out.println("Plain Text :"+ dplainText);
     }
}
