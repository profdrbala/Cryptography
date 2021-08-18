/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Substitution;

import java.util.Scanner;

/**
 *
 * @author Dr. Bala
 */
public class MonoalphabeticCipher
{
    
    public static void main(String args[])
    {
        String ALPHABET="abcdefghijklmnopqrstuvwxyz ";
        String MAP="nopqrstuvwxyzabcdefghijklm ";
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Plain Text");
        String plaintext=sc.nextLine();
        String ciphertext="";
        //Encryption
        for (int i = 0; i < plaintext.length(); i++)
        {
            char plainChar =plaintext.charAt(i);
            int plainIndex=ALPHABET.indexOf(plainChar);
            char mapChar = MAP.charAt(plainIndex);
            
            ciphertext = ciphertext+mapChar;
        }
        
        System.out.println("Cipher Text "+ciphertext);
        plaintext="";
        //Decryption
        for (int i = 0; i < ciphertext.length(); i++)
        {
            char c =ciphertext.charAt(i);
            int v=MAP.indexOf(c);
            char d = ALPHABET.charAt(v);
            plaintext = plaintext+d;
        }
        
        System.out.println("Plain Text "+plaintext);

    }
}
