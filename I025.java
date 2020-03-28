package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I025 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int first_code=Integer.parseInt(str[0]);//第一个节点地址
        int N=Integer.parseInt(str[1]);//节点总个数
        int K=Integer.parseInt(str[2]);//要反转的个数
        int temp;//临时变量，存放临时数据
        int data[]=new int[100000];//存放节点数据
        int[] next=new int[100000];//存放下一个节点地址
        int[] list=new int[N];//存放有用节点地址

        //录入数据
        for(int i=0;i<N;i++){
            str=br.readLine().split(" ");
            temp=Integer.parseInt(str[0]);
            data[temp]=Integer.parseInt(str[1]);
            next[temp]=Integer.parseInt(str[2]);
        }
        int sum=0;//可能会有无用的节点，sum来记录有用节点的个数
        //筛选有用节点地址，放到list数组中
        while (first_code!=-1){
            list[sum++]=first_code;
            first_code=next[first_code];
        }
        //执行到这一行 sum的值刚好是有用节点的个数

        //进行反转
        I025 pat=new I025();
        for(int i=0;i<sum-sum%K;i+=K){
            pat.reverse(list,i,i+K);
        }

        //输出
        for(int i=0;i<sum-1;i++){
            System.out.printf("%05d %d %05d\n",list[i],data[list[i]],list[i+1]);
        }
        //最后一个节点单独输出，因为要单独输出-1
        System.out.printf("%05d %d -1",list[sum-1],data[list[sum-1]]);
    }
    //反转的方法
    public void reverse(int[] list,int a,int b){
        int start=a,end=b-1,temp;
        while(start<end){
            /*下面这一行代码等于号后边执行到括号时，把list[start]的值赋给list[end]
             * 那么这一行代码就变成了list[start]=list[start]+list[end]-list[start]
             * 等式右边约掉相同项得到list[start]=list[end]，这样就完成了对应位置的
             * 值交换的操作，当然定义中间变量进行交换也可以，下面三行注释掉的代码
             * 就是这种方式，都可以*/
            list[start] = list[start] + list[end] - (list[end] = list[start]);
            /*temp=list[start];
            list[start]=list[end];
            list[end]=temp;*/
            start++;
            end--;
        }
    }
}
