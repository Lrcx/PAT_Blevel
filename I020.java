package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I020 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int N=Integer.parseInt(s[0]);//月饼种类数
        int D=Integer.parseInt(s[1]);//市场最大需求量

        String[] str1=br.readLine().split(" ");
        String[] str2=br.readLine().split(" ");
        float[] kucun=new float[N];
        float[] price=new float[N];
        float singlePrice[]=new float[N];
        for(int i=0;i<N;i++){
            kucun[i]=Float.parseFloat(str1[i]);
            price[i]=Float.parseFloat(str2[i]);
            singlePrice[i]=price[i]/kucun[i];
        }

        for(int i=0;i<N-1;i++){
            for(int j=i;j<N;j++){
                if(singlePrice[i]<singlePrice[j]){
                    float temp=singlePrice[i];
                    singlePrice[i]=singlePrice[j];
                    singlePrice[j]=temp;
                    temp=price[i];
                    price[i]=price[j];
                    price[j]=temp;
                    temp=kucun[i];
                    kucun[i]=kucun[j];
                    kucun[j]=temp;
                }
            }
        }
        int totle=0;
        float sumprice=0;
        for(int i=0;i<N;i++){
            if(D-totle>kucun[i]){
                totle+=kucun[i];
                sumprice+=price[i];
            }else if(D-totle==kucun[i]){
                sumprice+=price[i];
                break;
            }else{
                sumprice+=singlePrice[i]*(D-totle);
                break;
            }
        }
        System.out.printf("%.2f",sumprice);
    }
}