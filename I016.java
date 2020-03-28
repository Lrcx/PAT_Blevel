package levelB;

import java.util.Scanner;

public class I016 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[] A=s.next().toCharArray();
        int DA=s.nextInt();
        char[] B=s.next().toCharArray();
        int DB=s.nextInt();
        String PA="",PB="";

        for(int i=0;i<A.length;i++){
            if(A[i]-48==DA){
                PA+=A[i];
            }
        }
        for(int i=0;i<B.length;i++){
            if(B[i]-48==DB){
                PB+=B[i];
            }
        }

        if(PA==""&&PB!=""){
            System.out.print(Integer.parseInt(PB));
        }else if(PA!=""&&PB==""){
            System.out.print(Integer.parseInt(PA));
        }else if(PA==""&&PB==""){
            System.out.print("0");
        }else{
            System.out.print(Integer.parseInt(PA)+Integer.parseInt(PB));
        }
    }
}
