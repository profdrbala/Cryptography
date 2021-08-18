package Transposition;

import java.util.Scanner;
public class RailFenchDec {
    public static void main(String[] args) {
       String plainText="",cipherText="";
        
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the ciphertext");
       cipherText=s.nextLine();
        
       System.out.println("Enter the depth");
       int depth=s.nextInt();
       
    int row=depth,len=cipherText.length();
    int col=len/depth;
//        System.out.println("len " +len);
//        System.out.println("col " + col);
    char grid[][]=new char[row][col];
    int k=0;
     plainText="";
    for(int i=0;i< row;i++)  {
     for(int j=0;j< col;j++) {
      grid[i][j]=cipherText.charAt(k++);
      //System.out.print("\tr" + j + ",c" + i +"= " + grid[i][j]);
      System.out.print("[" + j + "," + i +" " + grid[i][j] +"]");
     }System.out.println("\n");
    }
    for(int i=0;i< col;i++)  {
     for(int j=0;j< row;j++) {
      plainText+=grid[j][i];
     }
    }
  System.out.println(plainText);
    }   
}  