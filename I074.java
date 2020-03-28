package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I074 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] table=br.readLine().toCharArray();
        String s1=br.readLine();
        String s2=br.readLine();
        String str="";
        for(int i=0;i<Math.abs(s1.length()-s2.length());i++)
            str+="0";
        if(s1.length()<s2.length())
            s1=str+s1;
        else
            s2=str+s2;

        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        int yu=0,shang=0;
        for(int i=s1.length()-1;i>=0;i--){
            sum=s1.charAt(i)+s2.charAt(i)-48-48+shang;
            if(table[i]!='0'){
                yu=sum%(table[i]-48);
                shang=sum/(table[i]-48);
            }else{
                yu=sum%10;
                shang=sum/10;
            }
            list.add(yu);
        }
        if(shang!=0)
            list.add(shang);

        int index=0;
        for(int i=list.size()-1;i>=0;i--)
            if(list.get(i)!=0){
                index=i;
                break;
            }
        for(int i=index;i>=0;i--)
            System.out.print(list.get(i));
    }
}
