package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I091 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int M=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        br.close();
        for(int i=0;i<M;i++){
            int K=Integer.parseInt(str[i]);
            boolean flag=true;
            for(int N=1;N<10;N++){
                String temp=String.valueOf(N*K*K);
                int value=Integer.parseInt(temp.substring(temp.length()-String.valueOf(K).length(),temp.length()));
                if(value==K){
                    System.out.println(N+" "+temp);
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("No");
        }
    }
}
