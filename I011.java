package levelB;

import java.util.Scanner;

public class I011 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=0;i<N;i++){
            Long A=s.nextLong();
            Long B=s.nextLong();
            Long C=s.nextLong();
            if(A+B>C){
                System.out.println("Case #"+(i+1)+": true");
            }else{
                System.out.println("Case #"+(i+1)+": false");
            }
        }
    }
}
