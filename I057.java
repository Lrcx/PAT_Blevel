package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I057 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] c=br.readLine().toUpperCase().toCharArray();
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>='A'&&c[i]<='Z')
                sum+=c[i]-64;
        }
        int count0=0,count1=0;
        while(sum!=0){
            int a=sum/2;
            int b=sum%2;
            if(b==0)
                count0++;
            else
                count1++;
            sum=a;
        }
        System.out.println(count0+" "+count1);
    }
}
