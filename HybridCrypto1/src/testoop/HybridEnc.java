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
public class HybridEnc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String ALPHABET="abcdefghijklmnopqrstuvwxyz ";
        String MAP="nopqrstuvwxyzabcdefghijklm ";
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Plain Text");
        String plaintext=sc.nextLine();
        String ciphertext="",cipherfinal="";
        //Encryption
        for (int i = 0; i < plaintext.length(); i++)
        {
            char plainChar =plaintext.charAt(i);
            int plainIndex=ALPHABET.indexOf(plainChar);
            char mapChar = MAP.charAt(plainIndex);
            
            ciphertext = ciphertext+mapChar;
        }
        System.out.println("Enter the shiftkey");
        int shiftKey=sc.nextInt();
        for (int i = 0; i < ciphertext.length(); i++)
        {
            char ch=ciphertext.charAt(i);
            
            int charPosition = ALPHABET.indexOf(ch);
            
            int sno = (shiftKey + charPosition) % 26;
            
            char replaceVal = ALPHABET.charAt(sno);
            
            cipherfinal += replaceVal;
        }
        System.out.println("Cipher Text " + cipherfinal );
    }
    
}
