package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I094 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        String c=br.readLine();
        int L=Integer.parseInt(str[0]);
        int K=Integer.parseInt(str[1]);
        for(int i=0;i<=L-K;i++){
            int num=Integer.parseInt(c.substring(i,i+K));
            if(isPrime(num)){
                System.out.print(c.substring(i,i+K));
                return;
            }
        }
        System.out.print("404");
    }
    public static boolean isPrime(int num){
        if(num==1)
            return false;
        if(num==2||num==3)
            return true;
        if(num%6!=1&&num%6!=5)
            return false;
        for(int i=5;i<=Math.sqrt(num);i+=6)
            if(num%i==0||num%(i+2)==0)
                return false;
        return true;
    }
}
