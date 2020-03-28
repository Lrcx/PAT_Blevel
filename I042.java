package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I042 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char[] c=str.toLowerCase().toCharArray();
        int count[]=new int[26];

        for(int i=0;i<c.length;i++){
            if(c[i]>='a'&&c[i]<='z')
                count[c[i]-97]++;
        }

        int max=0,index=0;
        for(int i=0;i<26;i++){
            if(count[i]>max){
                max=count[i];
                index=i;
            }
        }

        System.out.print((char)(index+97)+" "+max);
    }
}
