package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I043 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] c=br.readLine().toCharArray();
        int count_P=0,count_A=0,count_T=0,count_e=0,count_s=0,count_t=0;
        for(int i=0;i<c.length;i++){
            switch (c[i]){
                case 'P':count_P++;break;
                case 'A':count_A++;break;
                case 'T':count_T++;break;
                case 'e':count_e++;break;
                case 's':count_s++;break;
                case 't':count_t++;break;
                default:break;
            }
        }
        int count=0;
        for(int i=0;i<300;i++){
            if(count<count_P)
                System.out.print("P");
            if(count<count_A)
                System.out.print("A");
            if(count<count_T)
                System.out.print("T");
            if(count<count_e)
                System.out.print("e");
            if(count<count_s)
                System.out.print("s");
            if(count<count_t)
                System.out.print("t");
            count++;
        }
    }
}
