package levelB;

import java.util.Scanner;

public class I004 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //读入多少个学生
        int N=Integer.parseInt(s.nextLine());
        //读入每一行的数据
        String str[]=new String[N];
        for(int i=0;i<N;i++){
            str[i]=s.nextLine();
        }
        //三个数组分别用来盛放名字，学号，成绩
        String name[]=new String[N];
        String id[]=new String[N];
        int score[]=new int[N];
        for(int i=0;i<N;i++){
            /*按照空格将每一个学生的成绩拆分成姓名，学号，成绩
            然后各自存放在自己的数组中*/
            String temp[]=str[i].split(" ");
            name[i]=temp[0];
            id[i]=temp[1];
            score[i]=Integer.parseInt(temp[2]);
        }
        //由于只需要找出最大值和最小值，所以没必要对score数组进行排序

        //找最大值
        int index=0,max=0;
        for(int i=0;i<N;i++){
            if(max<score[i]){
                max=score[i];
                index=i;
            }
        }
        System.out.println(name[index]+" "+id[index]);


        //找最小值
        index=0;
        int min=score[0];
        for(int i=0;i<N;i++){
            if(min>score[i]){
                min=score[i];
                index=i;
            }
        }
        System.out.print(name[index]+" "+id[index]);
    }
}
