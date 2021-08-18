/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagedigestprg;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dr. Bala
 */
public class MessageDigestPRG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
      //Reading data from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the message");
      String message = sc.nextLine();
	  
      //Creating the MessageDigest object  
      MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            //Passing data to the created MessageDigest Object
            md.update(message.getBytes());
            
            //Compute the message digest
            byte[] digest = md.digest();      

            
            System.out.println(digest);  
            System.out.println(md.toString());
//            //Converting the byte array in to HexString format
//            StringBuffer hexString = new StringBuffer();
//            for (int i = 0;i<digest.length;i++) {
//               hexString.append(Integer.toHexString(0xFF & digest[i]));
//            }
//            System.out.println("Hex format : " + hexString.toString());  

        } catch (Exception ex) {
            System.out.println("Error " +ex);
        }

      
      
    }
    
}
