package Transposition;

import java.util.Scanner;
public class RailFenchEnc {
    public static void main(String[] args) {
       String plainText="",cipherText="";
        
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Plaintext");
       plainText=s.nextLine();
        
       System.out.println("Enter the depth");
       int depth=s.nextInt();
       
    int row=depth,len=plainText.length();
    int col=len/depth;
    System.out.println("Row " + row);
    System.out.println("Col " + col);
    char grid[][]=new char[row][col];
    int k=0;
    for(int i=0;i< row;i++){
     for(int j=0;j< col;j++){
         grid[i][j]='0';
         System.out.print(grid[i][j]);
     }System.out.println("");
    }
    
    for(int i=0;i< col;i++)  {
     for(int j=0;j< row;j++)   {
       grid[j][i]=plainText.charAt(k++);
       //System.out.print("\t r" + j + ",c"+ i +"= " + grid[j][i]);
       System.out.print("[" + j + "," + i +" " + grid[j][i] +"]");
     } System.out.println("");
    }
    System.out.println("");
    for(int i=0;i< row;i++){
     for(int j=0;j< col;j++){
         System.out.print("\t r" + i + ",c" + j +"= " + grid[i][j]);
      cipherText +=grid[i][j];
     }System.out.println("");
    }
    System.out.println(cipherText);
    }
}  