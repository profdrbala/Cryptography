/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

/**
 *
 * @author bala
 */
public class PlayFairCipher {
    public static void main(String[] args) {
        String alpha="abcdefghijklmnopqrstuvwxyz";

        char matrixAlpha[][]= new char[5][5];
        
        for(int row=0, j=0;row<matrixAlpha.length;row++,j+=5){
            for(int col=0,k=j;col<matrixAlpha.length;col++,k++){
                if(alpha.charAt(k)=='j'){
                    j+=1; k+=1;}
                matrixAlpha[row][col]=alpha.charAt(k);
            }
        }
        
        for(int row=0, j=0;row<matrixAlpha.length;row++,j+=5){
            for(int col=0;col<matrixAlpha.length;col++){
                System.out.print(matrixAlpha[row][col]);
            }
            System.out.println();
        }
        
        String keyword="worldhealth";
        for(int row=0, j=0;row<matrixAlpha.length;row++,j+=5){
            for(int col=0,k=j;col<matrixAlpha.length;col++,k++){
                if(k<keyword.length())
                    matrixAlpha[row][col]=keyword.charAt(k);
            }
        }
        int r=keyword.length()/5;
        int c=keyword.length();
          for(int row=r, j=0;row<matrixAlpha.length;row++,j+=5){
            for(int col=c,k=j;col<matrixAlpha.length;col++,k++){
                if(!keyword.contains(alpha))
                    if(alpha.charAt(k)=='j'){
                        j+=1; k+=1;
                    matrixAlpha[row][col]=alpha.charAt(k);
                }
            }
          }
          
        System.out.println();
        
          for(int row=0, j=0;row<matrixAlpha.length;row++,j+=5){
            for(int col=0;col<matrixAlpha.length;col++){
                System.out.print(matrixAlpha[row][col]);
            }
            System.out.println();
        }
        
    }
}
