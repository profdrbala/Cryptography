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

public class VignereCipherOwn
{
    
    public static void main(String[] args)
    {
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        String plainText="";
        String cipherText="";
        String key="";
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the plaintext");
        plainText=s.nextLine();
  
        System.out.println("Enter the key");
        key=s.nextLine();
        
        plainText = plainText.toLowerCase();
  
//        System.out.println("Alphabet "   +  alphabet);
        System.out.println("Plain Text: " +  plainText);
        System.out.println("Key       : "  +  key);
        System.out.println("Plain\t Key\t Calc\t Cipher");
        for (int i = 0,j = 0; i < plainText.length(); i++)
        {
            char pch=plainText.charAt(i);
            char kch=key.charAt(j);
            
            int pcharPos = alphabet.indexOf(pch);
            int kcharPos = alphabet.indexOf(kch);
            
            int sno = (pcharPos + kcharPos ) % 26;
            
            j = ++j % key.length();
             
            char replaceVal = alphabet.charAt(sno);
            
            cipherText += replaceVal;
            
            System.out.println(" " +pcharPos + "\t " + kcharPos + "\t " + sno + "\t " + replaceVal);
        }
        
//        System.out.println("Enter the ciphertext");
//        cipherText=s.nextLine();
  
        System.out.println("CipherText: " +  cipherText);
        plainText="";
        //cipherText="";
        for (int i = 0,j=0; i < cipherText.length(); i++)
        {
            char cch=cipherText.charAt(i);
            char kch=key.charAt(j);
            
            int pcharPos = alphabet.indexOf(cch);
            int kcharPos = alphabet.indexOf(kch);
            
            int sno = (cch-kch) % 26;
            j = ++j % key.length();
            
            if (sno < 0)
            {
                sno = alphabet.length() + sno;
            }
            char replaceVal = alphabet.charAt(sno);
            System.out.println(" " +pcharPos + "\t " + kcharPos + "\t " + sno + "\t " + replaceVal);
            plainText += replaceVal;
        }
        
        System.out.println("PlainText: " + plainText);
    }
}
