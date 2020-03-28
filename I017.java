package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I017 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split("\\s+");
        String A=str[0];
        int B=Integer.parseInt(str[1]);

        StringBuilder result=new StringBuilder();
        int shang=0,yu=0;
        boolean flag=true;
        for(int i=0;i<A.length();i++){
            shang=(A.charAt(i)-'0'+yu*10)/B;
            yu=(A.charAt(i)-'0'+yu*10)%B;
            if(flag){
                if(shang==0){
                    continue;
                }else{
                    flag=false;
                }
            }
            result.append(shang);
        }
        if(result.length()==0)
            result.append(0);
        System.out.print(result+" "+yu);
    }
}
