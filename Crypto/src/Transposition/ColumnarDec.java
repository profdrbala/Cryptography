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
public class ColumnarDec {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the ciphertext");
       String cipher=s.nextLine();
       String plainText="";
       System.out.println("Enter the number of column");
       int colm=s.nextInt(); 
       System.out.println("Enter the column key");
       String key=s.next();
       
       
       
       int rows=cipher.length()/colm; 
       char matrixAlpha[][]= new char[rows][colm];
       
       
        int k=0;
        //decryption
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
            }System.out.println();
        }
        System.out.println("plaintext: " + plainText);

    }
}
