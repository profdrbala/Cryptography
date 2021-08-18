/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testoop;

import java.util.Scanner;

/**
 *
 * @author bala
 */
public class HybridDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String ALPHABET="abcdefghijklmnopqrstuvwxyz ";
        String MAP="nopqrstuvwxyzabcdefghijklm ";
        String plaintext="",plainfinal="";
        int shiftKey=0;
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cipher Text");
        String ciphertext=sc.nextLine();
        System.out.println("Enter the shiftkey");
        shiftKey=sc.nextInt();
        
        //Decription Caesar
        for (int i = 0; i < ciphertext.length(); i++)
        {
            char ch=ciphertext.charAt(i);
            int charPosition = ALPHABET.indexOf(ch);
            int sno = (charPosition - shiftKey) % 26;
            
            if (sno < 0)
            {
                sno = ALPHABET.length() + sno;
            }
            char replaceVal = ALPHABET.charAt(sno);
            plaintext += replaceVal;
        }
        System.out.println("plain 1 " + plaintext);
        //Decription mono
         for (int i = 0; i < plaintext.length(); i++)
        {
            char c =plaintext.charAt(i);
            int v=MAP.indexOf(c);
            char d = ALPHABET.charAt(v);
            plainfinal = plainfinal+d;
        }
        
        System.out.println("Plain Text "+plainfinal);
        
    }
    
}
