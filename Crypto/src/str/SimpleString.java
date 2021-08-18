/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str;

import java.util.Scanner;

/**
 *
 * @author bala
 */
public class SimpleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        
        String message=new String();
        message= "Bala"; //sc.nextLine();
        
        System.out.println("Entered Text "  + message);
        System.out.println("Text Length "   + message.length());
        
        System.out.println("Char at location " + message.charAt(0));
        
        System.out.println("index of of char "      + message.indexOf("l"));
        System.out.println("index of of char at "      + message.indexOf(message.charAt(1)));
        
        System.out.println("Text lowercase " + message.toLowerCase());
        System.out.println("Text lowercase " + message.toUpperCase());
        
        
        //finding character in sepecifed possition
        for(int i=0;i<message.length();i++){
            System.out.println(i + " " + message.charAt(i));
        }
        
        //Coverting text to character array
        char textarr[]=message.toCharArray();
        
        for(int i=0;i<textarr.length;i++){
            System.out.println(i + " " +textarr[i]);
        }
        
        
    }
}
