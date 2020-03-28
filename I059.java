package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class I059 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        HashMap<Integer,String> map=new HashMap<>();
        boolean[] flag=new boolean[10001];
        for(int i=1;i<=N;i++){
            int temp=Integer.parseInt(br.readLine());
            if(i==1)
                map.put(temp,"Mystery Award");
            else if(prime(i))
                map.put(temp,"Minion");
            else
                map.put(temp,"Chocolate");

        }
        int K=Integer.parseInt(br.readLine());
        for(int i=0;i<K;i++){
            int temp=Integer.parseInt(br.readLine());
            if(!flag[temp]){
                if(map.get(temp)==null)
                    System.out.printf("%04d: Are you kidding?\n",temp);
                else{
                    System.out.printf("%04d: %s\n",temp,map.get(temp));
                    flag[temp]=true;
                }
            }else
                System.out.printf("%04d: Checked\n",temp);
        }
        br.close();
    }
    //判断是否是素数的方法
    public static boolean prime(int num){
        if(num==2||num==3)
            return true;
        if(num%6!=5||num%6!=1)
            return false;
        for(int i=5;i<=Math.sqrt(num);i+=6){
            if(num%i==0||num%(i+2)==0)
                return false;
        }
        return true;
    }
}