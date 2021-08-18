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

public class CaesarCipher
{
    
    public static void main(String[] args)
    {
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        String plainText="";
        String cipherText="";
        int shiftKey=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the plaintext");
        plainText=s.nextLine();
        
        System.out.println("Enter the shiftkey");
        shiftKey=s.nextInt();
        
        plainText = plainText.toLowerCase();
  
        System.out.println("Alphabet " +  alphabet);
        System.out.println("Plain Text " +  plainText);
        System.out.println("Shift " +  shiftKey);
        
        for (int i = 0; i < plainText.length(); i++)
        {
            char ch=plainText.charAt(i);
            
            int charPosition = alphabet.indexOf(ch);
            
            int sno = (shiftKey + charPosition) % 26;
            
            char replaceVal = alphabet.charAt(sno);
            
            cipherText += replaceVal;
        }
        
        System.out.println("Encripted Text " +  cipherText);
        plainText="";
        for (int i = 0; i < cipherText.length(); i++)
        {
            char ch=cipherText.charAt(i);
            
            int charPosition = alphabet.indexOf(ch);
            
            int sno = (charPosition - shiftKey) % 26;
            
            if (sno < 0)
            {
                sno = alphabet.length() + sno;
            }
            char replaceVal = alphabet.charAt(sno);
            
            plainText += replaceVal;
        }
        
        System.out.println("Plain Text " + plainText);
    }
}
