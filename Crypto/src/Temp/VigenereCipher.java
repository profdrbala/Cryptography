/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

/**
 *
 * @author Dr. Bala
 */
public class VigenereCipher
{
    
 
    public static String decrypt(String text, final String key)
    {
        String res = "";
        text = text.toUpperCase();
        
        return res;
    }
 
    public static void main(String[] args)
    {
        String key = "BC";
        String message = "University";
         String cipher = "";
        //Encryptoin
         message = message.toUpperCase();
        for (int i = 0, j = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);
            if (c < 'A' || c > 'Z')  continue;
            //(char) (((msg[i] + key[i]) % 26) + 'A');
            cipher += (char) ((c + key.charAt(j))  % 26 + 65);
            
            j = ++j % key.length();
        }
             
        System.out.println("Encrypted message: " + cipher);
        String plain="";
        //Decryption
        for (int i = 0, j = 0; i < cipher.length(); i++)
        {
            char c = cipher.charAt(i);
            if (c < 'A' || c > 'Z')
                continue;
            plain += (char) (((c - key.charAt(j))+26) % 26 + 65);
            j = ++j % key.length();
        }
        System.out.println(plain);
    }
}
