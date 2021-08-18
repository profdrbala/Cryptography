package Temp;
public class VigenereSqure {
    public static void main(String[] args) {
        char [][]table=new char[26][26];
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i=0,j=1; char ch=' ';
        for(int r=0; r < 26; r++){
            for(int c=r; c < 26; c++){
//                if(r>0){
//                    i= (c+j)% 26;
//                    ch=alphabet.charAt(c+j);
//                    j+=1;
//                    
//                }
                
                
                   table[r][c]= alphabet.charAt(c);
                   System.out.print(table[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("te" + table[1][25]);
//        //alphabet="ZYXWVUTSRQPONMLKJIHGFEDCBA";
//        for(int r=25;r > 0;r--){
//            for(int c=r;c >=0 ;c--){
//               table[r][c]= alphabet.charAt(c);
//           //    System.out.print(table[r][c] + " ");
//            }
//            //System.out.println();
//        }
        
//        for(int r=0;r < 26;r++){
//            for(int c=0;c < 26;c++)
//                       System.out.print(table[r][c] + " ");
//            System.out.println();
//        }
    }
}
