package levelB;

import java.util.Scanner;

public class I088 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int X=s.nextInt();
        int Y=s.nextInt();
        int A=0,B=0;
        for(int i=99;i>=10;i--){
            B=i%10*10+i/10;
            if(Math.abs(i-B)*Y==B*X){
                A=i;
                break;
            }
        }
        if(A==0)
            System.out.println("No Solution");
        else{
            double C=B*1.0/Y;
            double compare[]={A,B,C};
            System.out.print(A+" ");
            for(int i=0;i<3;i++){
                if(M==compare[i])
                    System.out.print("Ping");
                else if(M>compare[i])
                    System.out.print("Gai");
                else
                    System.out.print("Cong");
                if(i!=2)
                    System.out.print(" ");
            }
        }
    }
}
