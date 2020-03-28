package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I078 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char sign=br.readLine().charAt(0);
        char[] c=br.readLine().toCharArray();
        int count=0;
        if(sign=='C'){
            for(int i=0;i<c.length-1;i++){
                if(c[i]==c[i+1]){
                    count++;
                    continue;
                }
                if(count==0)
                    System.out.print(c[i]);
                else{
                    System.out.print(count+1+""+c[i]);
                    count=0;
                }
            }
            if(count!=0)
                System.out.print(count+1+""+c[c.length-1]);
            if(c[c.length-2]!=c[c.length-1])
                System.out.print(c[c.length-1]);
        }else{
            String str="";
            int i=0;
            for(i=0;i<c.length-1;i++){
                if(c[i]>'0'&&c[i]<='9'){
                    while(c[i]>='0'&&c[i]<='9'){
                        str+=c[i];
                        i++;
                    }
                    for(int j=0;j<Integer.parseInt(str);j++)
                        System.out.print(c[i]);
                    str="";
                    continue;
                }
                System.out.print(c[i]);
            }
            if(i==c.length-1)
                System.out.print(c[i]);
        }
    }
}
