/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transposition;

import java.util.Scanner;

/**
 *
 * @author bala
 */
public class ColumnarEnc {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Plaintext");
       String plainText=s.nextLine();
       
       System.out.println("Enter the number of column");
       int colm=s.nextInt(); 
       
       System.out.println("Enter the column key");
       String key=s.next();
       
        System.out.println("Plaintext: " + plainText);
        System.out.println("Key      : " + key);
       
       int rows=plainText.length()/colm; 
//        System.out.println("row " + rows);
       char matrixAlpha[][]= new char[rows][colm];
         
       int k=0;
       //load in array
       //System.out.print(" 0 1 2 3 4 5 6\n");
        for(int row=0;row<rows;row++){
           // System.out.print("Row:"+row + " ");
            for(int col=0;col<colm;col++){
               matrixAlpha[row][col]=plainText.charAt(k++);
               System.out.print("|"+matrixAlpha[row][col]);
            }System.out.println("|");
        }
        
        String cipher="";
        //encryption
            for(int col=0;col<key.length();col++){
              for(int row=0;row<rows;row++){
                  String loc=String.valueOf(key.charAt(col));
                  
                  int keyloc=Integer.parseInt(loc);
               cipher+=matrixAlpha[row][keyloc];
            }
        }
        System.out.println("ciphertext:" + cipher);
     
        
        k=0;
        //decryption
        plainText="";
//        System.out.print(" 0 1 2 3 4 5 6\n");
           // System.out.print("Row:"+row + " ");
            for(int col=0;col<colm;col++){
                for(int row=0;row<rows;row++){
                String loc=String.valueOf(key.charAt(col));
                int keyloc=Integer.parseInt(loc);
                matrixAlpha[row][keyloc]=cipher.charAt(k++);              
            }
        }
        
              for(int row=0;row<rows;row++){
                  for(int col=0;col<colm;col++){
               plainText+=matrixAlpha[row][col];
               System.out.print("|"+matrixAlpha[row][col]);
            }System.out.println("|");
        }
        System.out.println("plaintext: " + plainText);
    }
}
