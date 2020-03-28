package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I062 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N1=Integer.parseInt(str[0].split("/")[0]);
        int M1=Integer.parseInt(str[0].split("/")[1]);
        int N2=Integer.parseInt(str[1].split("/")[0]);
        int M2=Integer.parseInt(str[1].split("/")[1]);
        int K=Integer.parseInt(str[2]);
        //System.out.println(N1+" "+M1+" "+N2+" "+M2+" "+K);
        double left=(N1*K)*1.0/M1;
        double right=(N2*K)*1.0/M2;
        if(left>right){
            double temp=left;
            left=right;
            right=temp;
        }
        //System.out.println(left+" "+right);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=(int)left+1;i<right;i++){
            if(ojilide(i,K)==1)
                list.add(i);
        }
        for(int i=0;i<list.size();i++){
            if(i!=0)
                System.out.print(" ");
            System.out.print(list.get(i)+"/"+K);
        }
    }
    public static int ojilide(int a,int b){
        int temp;
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        while(a%b!=0){
            temp=a%b;
            a=b;
            b=temp;
        }
        return b;
    }
}
