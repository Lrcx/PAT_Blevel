package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I015 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);//多少学生
        int L=Integer.parseInt(str[1]);//最低分数线
        int H=Integer.parseInt(str[2]);//优先录取线
        int[] id=new int[N];//存放学号
        int[] de=new int[N];//德分
        int[] cai=new int[N];//才分
        int[] sum=new int[N];//分数和
        int flag[]=new int[N];//标记数组
        /*这个标记数组，0代表淘汰，1代表才德全尽，2代表德胜才，
        3代表尚有德胜才，4代表除了0123的剩下的*/

        int temp1,temp2;//temp1代表录入的德分，temp2代表才分
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            id[i]=Integer.parseInt(str[0]);
            temp1=Integer.parseInt(str[1]);
            temp2=Integer.parseInt(str[2]);
            if(temp1>=L&&temp2>=L){
                if(temp1>=H&&temp2>=H){//德才分均大于H
                    de[i]=temp1;
                    cai[i]=temp2;
                    flag[i]=1;    //置为1
                    sum[i]=temp1+temp2;
                }else if(temp1>=H&&temp2<H){ //德过线才不过
                    de[i]=temp1;
                    cai[i]=temp2;
                    flag[i]=2;//置为2
                    sum[i]=temp1+temp2;
                }else if(temp1<H&&temp2<H&&temp1>=temp2){ //尚有德胜才
                    de[i]=temp1;
                    cai[i]=temp2;
                    flag[i]=3;
                    sum[i]=temp1+temp2;
                }else {             //其他
                    de[i]=temp1;
                    cai[i]=temp2;
                    flag[i]=4;
                    sum[i]=temp1+temp2;
                }
            }else{  //淘汰
                de[i]=temp1;
                cai[i]=temp2;
                flag[i]=0;
            }
        }

        int temp;//中间数，交换数组对应位置数的时候用到
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(flag[i]==1&&flag[j]==1){//德才全尽排序
                    if(sum[i]<sum[j]){//按和降序排序
                        temp=sum[i];sum[i]=sum[j];sum[j]=temp;
                        temp=id[i];id[i]=id[j];id[j]=temp;
                        temp=de[i];de[i]=de[j];de[j]=temp;
                        temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                    }else if(sum[i]==sum[j]){//和相同
                        if(de[i]<de[j]){//按德分降序排序
                            temp=id[i];id[i]=id[j];id[j]=temp;
                            temp=de[i];de[i]=de[j];de[j]=temp;
                            temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                        }else if(de[i]==de[j]){//德相同按序号升序排序
                            if(id[i]>id[j]){
                                temp=id[i];id[i]=id[j];id[j]=temp;
                                temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                            }
                        }
                    }
                }
            }
        }
        /*看懂了上边那个，下面三个也就懂了，分别是对剩下三类进行排序*/
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(flag[i]==2&&flag[j]==2){
                    if(sum[i]<sum[j]){
                        temp=sum[i];sum[i]=sum[j];sum[j]=temp;
                        temp=id[i];id[i]=id[j];id[j]=temp;
                        temp=de[i];de[i]=de[j];de[j]=temp;
                        temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                    }else if(sum[i]==sum[j]){
                        if(de[i]<de[j]){
                            temp=id[i];id[i]=id[j];id[j]=temp;
                            temp=de[i];de[i]=de[j];de[j]=temp;
                            temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                        }else if(de[i]==de[j]){
                            if(id[i]>id[j]){
                                temp=id[i];id[i]=id[j];id[j]=temp;
                                temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                            }
                        }
                    }
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(flag[i]==3&&flag[j]==3){
                    if(sum[i]<sum[j]){
                        temp=sum[i];sum[i]=sum[j];sum[j]=temp;
                        temp=id[i];id[i]=id[j];id[j]=temp;
                        temp=de[i];de[i]=de[j];de[j]=temp;
                        temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                    }else if(sum[i]==sum[j]){
                        if(de[i]<de[j]){
                            temp=id[i];id[i]=id[j];id[j]=temp;
                            temp=de[i];de[i]=de[j];de[j]=temp;
                            temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                        }else if(de[i]==de[j]){
                            if(id[i]>id[j]){
                                temp=id[i];id[i]=id[j];id[j]=temp;
                                temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                            }
                        }
                    }
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(flag[i]==4&&flag[j]==4){
                    if(sum[i]<sum[j]){
                        temp=sum[i];sum[i]=sum[j];sum[j]=temp;
                        temp=id[i];id[i]=id[j];id[j]=temp;
                        temp=de[i];de[i]=de[j];de[j]=temp;
                        temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                    }else if(sum[i]==sum[j]){
                        if(de[i]<de[j]){
                            temp=id[i];id[i]=id[j];id[j]=temp;
                            temp=de[i];de[i]=de[j];de[j]=temp;
                            temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                        }else if(de[i]==de[j]){
                            if(id[i]>id[j]){
                                temp=id[i];id[i]=id[j];id[j]=temp;
                                temp=cai[i];cai[i]=cai[j];cai[j]=temp;
                            }
                        }
                    }
                }
            }
        }

        //记录总共要输出的个数
        int count=0;
        for(int i=0;i<N;i++){
            if(flag[i]!=0){
                count++;
            }
        }
        System.out.println(count);

        //输出最后结果
        for(int i=0;i<N;i++){
            if(flag[i]==1){
                System.out.println(id[i]+" "+de[i]+" "+cai[i]);
            }
        }
        for(int i=0;i<N;i++){
            if(flag[i]==2){
                System.out.println(id[i]+" "+de[i]+" "+cai[i]);
            }
        }
        for(int i=0;i<N;i++){
            if(flag[i]==3){
                System.out.println(id[i]+" "+de[i]+" "+cai[i]);
            }
        }
        for(int i=0;i<N;i++){
            if(flag[i]==4){
                System.out.println(id[i]+" "+de[i]+" "+cai[i]);
            }
        }
    }
}
