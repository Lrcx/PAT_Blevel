package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I079 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        sb.append(br.readLine());
        if(palindromic(sb)){
            System.out.println(sb+" is a palindromic number.");
            return;
        }
        int sum=0,count=0;
        while(count<10){
            int jinwei=0;
            for(int i=sb.length()-1;i>=0;i--){
                sum=sb.charAt(i)+sb.charAt(sb.length()-1-i)+jinwei-96;
                if(sum>=10){
                    temp.append(sum-10);
                    jinwei=1;
                }else{
                    temp.append(sum);
                    jinwei=0;
                }
            }
            count++;
            if(jinwei!=0)
                temp.append(jinwei);
            System.out.println(sb+" + "+sb.reverse()+" = "+temp.reverse());
            sb=temp;
            temp=new StringBuilder("");
            if(palindromic(sb)){
                System.out.println(sb+" is a palindromic number.");
                break;
            }
        }
        if(count==10)
            System.out.println("Not found in 10 iterations.");
    }
    public static boolean palindromic(StringBuilder sb){
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i))
                return false;
        }
        return true;
    }
}