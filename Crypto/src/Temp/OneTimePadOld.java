package Temp;

class Sequentialonepad {
//one pad text
    String pad="abcdefghijklmnopqrstuvwxyz";
    char onepad[]=pad.toCharArray();
//plaing text
    String planintxt="ijser";
    char plain[]=planintxt.toCharArray();
//secret text
    String enctxt="hello";
    char enc[]=enctxt.toCharArray();
    char cipher[]=new char[5]; //for ciphertext
    static int key1[]=new int[5];// for plaintext key
    static int key2[]=new int[5];//for secrettext key
    int k=0;
Sequentialonepad(){}
public void encript(){
    try{
        for(int j=0;j<plain.length;j++){
        //find location of plaintext and placed in key1 array
        for(int i=0;i<onepad.length;i++)
            if(plain[j]==onepad[i])
            key1[j]=i;
            //find location of secrettext and placed in key2 array
            for(int i=0;i<onepad.length;i++)
                if(enc[j]==onepad[i])
                key2[j]=i;
                //summation of plaintext and secrettext location
                k=key1[j]+key2[j];
                //if key (k) value existe more than 25 and then subtract by 25
                if(k>25)
                    k=k-25;
                    //assign ciphertext locaton by key (k) from onepad array
                    cipher[j]=onepad[k];
                    System.out.println("(key1) " + key1[j] + " + (key2) " + key2[j] +" = " + k +" (cipher) " + cipher[j]);
        }
    }catch(Exception e) { System.out.println("Error" + e);}
}
public void decryipt(){
    System.out.println("Decrypt...");
    try{
        for(int j=0;j<plain.length;j++){
        for(int i=0;i<onepad.length;i++)
            if(cipher[j]==onepad[i]){
               key1[j]=i;
               break;
            }
            k=key1[j]-key2[j];
            if(k<0)
                k=25+k;
                cipher[j]=onepad[k];
            System.out.println("(key1) " + key1[j] + " + (key2) " + key2[j] +" = " + k +" (cipher) " + cipher[j]);
    }
    }catch(Exception e) { System.out.println("Error" + e);}
}
public static void main(String str[]){
    try{
        Sequentialonepad sp=new Sequentialonepad();
        sp.encript();
    }catch(Exception e){ System.out.println("Error: " +e);}
    }
}