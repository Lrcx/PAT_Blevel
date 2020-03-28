package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I081 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            char[] c=br.readLine().toUpperCase().toCharArray();
            if(c.length<6){
                System.out.println("Your password is tai duan le.");
                continue;
            }
            int countLetter=0;
            int countNum=0;
            boolean flag=false;
            for(int j=0;j<c.length;j++){
                if(c[j]>='A'&&c[j]<='Z')
                    countLetter++;
                else if(c[j]>='0'&&c[j]<='9')
                    countNum++;
                else if(c[j]!='.'){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("Your password is tai luan le.");
                continue;
            }else{
                if(countNum==0&&countLetter!=0)
                    System.out.println("Your password needs shu zi.");
                else if(countNum!=0&&countLetter==0)
                    System.out.println("Your password needs zi mu.");
                else
                    System.out.println("Your password is wan mei.");
            }
        }
    }
}
