/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Substitution;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dr. Bala
 */

public class OneTimePad
{
    
    public static void main(String[] args)
    {
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        
        String plainText="important", cipherText="", key="something";
        
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the plaintext");
//        plainText=s.nextLine();
//        plainText = plainText.toLowerCase();
//         
//        Random r = new Random();
//          for(int x=0;x<plainText.length();x++)
//             key = key + (char) (r.nextInt(26) + 'a');
//          System.out.println(key);
        
        for (int i = 0; i < plainText.length(); i++) {
            
            char pch=plainText.charAt(i);
            char kch=key.charAt(i);
            
            int pcharPos = alphabet.indexOf(pch);
            int kcharPos = alphabet.indexOf(kch);
            
            int sno = (pcharPos + kcharPos ) % 26;
            char replaceVal=alphabet.charAt(sno);
            cipherText += replaceVal;
        }
        
        System.out.println("Encripted Text " +  cipherText);
        plainText="";
        for (int i = 0; i < cipherText.length(); i++)
        {
            char cch=cipherText.charAt(i);
            char kch=key.charAt(i);
            
            int ccharPos = alphabet.indexOf(cch);
            int kcharPos = alphabet.indexOf(kch);
            
            int sno = (ccharPos-kcharPos) % 26;
            if (sno < 0)
                sno = alphabet.length() + sno;
            char replaceVal = alphabet.charAt(sno);

            plainText += replaceVal;
        }
        
        System.out.println("Plain Text " + plainText);
    }
}
