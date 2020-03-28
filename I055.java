package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I055 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);
        int K=Integer.parseInt(str[1]);
        String[] name= new String[N];//存放名字
        People[] p=new People[N];//定义Peoplel类型的数组
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            p[i]=new People(str[0],Integer.parseInt(str[1]));
        }

        Arrays.sort(p);//对类进行排序

        //得到名字数组
        for(int i=0;i<N;i++){
            name[i]=p[i].name;
            //System.out.println(p[i].name+" "+p[i].height);
        }

        int t=0;int m;
        for(int i=0;i<K;i++){//三排
            if(i==0){//第一排
                m=N/K+N%K;
            }else{
                m=N/K;
            }
            String[] queen=new String[m];
            int center=m/2;//不加1的原因时数组下标从0开始，和加一抵消了
            queen[center]=name[t];
            int j=center-1,k=center+1;
            for(int x=t+1;x<t+m;x+=2){
                queen[j--]=name[x];
            }
            for(int x=t+2;x<t+m;x+=2){
                queen[k++]=name[x];
            }
            for(int x=0;x<queen.length;x++){
                if(x!=0)
                    System.out.print(" ");
                System.out.print(queen[x]);
            }
            System.out.println();
            t+=m;
        }
    }
}

class People implements Comparable<People>{
    String name;
    int height;
    public People(String name,int height){
        this.name=name;
        this.height=height;
    }

    @Override
    public int compareTo(People o) {
        if(this.height<o.height)
            return 1;
        else if(this.height>o.height)
            return -1;
        else
            return this.name.compareTo(o.name);
    }
}

