package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I084 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        String d=str[0];
        int N=Integer.parseInt(str[1]);
        if(N==1){
            System.out.println(d);
            return;
        }
        StringBuilder sb=new StringBuilder(d+"1");
        if(N==2){
            System.out.println(sb);
            return;
        }
        StringBuilder temp=new StringBuilder();
        while(N>2){
            int count=1;
            for(int i=0;i<sb.length()-1;i++){
                if(sb.charAt(i)==sb.charAt(i+1)){
                    count++;
                    continue;
                }
                temp.append(sb.charAt(i)+String.valueOf(count));
                count=1;
            }
            if(count!=1)
                temp.append(sb.charAt(sb.length()-1)+String.valueOf(count));
            else
                temp.append(sb.charAt(sb.length()-1)+"1");
            sb=temp;
            temp=new StringBuilder("");
            N--;
        }
        System.out.println(sb);
    }
}
