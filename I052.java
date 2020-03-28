package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class I052{
    public static void main(String[] args) throws Exception{
        I052 pat=new I052();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line1=br.readLine(),line2=br.readLine(),line3=br.readLine();
        int N=Integer.parseInt(br.readLine());
        String[] str=new String[N];
        for(int i=0;i<N;i++)
            str[i]=br.readLine();
        br.close();
        String[] hand=pat.mmp(line1);
        String[] eye=pat.mmp(line2);
        String[] mouth=pat.mmp(line3);
        for(int i=0;i<N;i++){
            String temp[]=str[i].trim().split("\\s+");
            int a=Integer.parseInt(temp[0]);
            int b=Integer.parseInt(temp[1]);
            int c=Integer.parseInt(temp[2]);
            int d=Integer.parseInt(temp[3]);
            int e=Integer.parseInt(temp[4]);
            if(a>=1&&a<=hand.length&&b>=1&&b<=eye.length&&c>=1&&c<=mouth.length&&d>=1&&d<=eye.length&&e>=1&&e<=hand.length)
                System.out.println(hand[a-1]+"("+eye[b-1]+mouth[c-1]+eye[d-1]+")"+hand[e-1]);
            else
                System.out.println("Are you kidding me? @\\/@");
        }
    }
    public String[] mmp(String str){
        char c[]=str.toCharArray();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]=='['){
                for(int j=i;j<c.length;j++){
                    if(c[j]==']'){
                        list.add(str.substring(i+1,j));
                        break;
                    }
                }
            }
        }
        String[] temp=new String[list.size()];
        for(int i=0;i<temp.length;i++)
            temp[i]=list.get(i);
        return temp;
    }
}