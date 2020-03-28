package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I058 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int N=Integer.parseInt(str[0]);//学生人数
        int M=Integer.parseInt(str[1]);//选择题个数
        int[] score=new int[M];
        String[] rightAnswer=new String[M];
        for(int i=0;i<M;i++){
            String c=br.readLine();
            score[i]=c.charAt(0)-48;
            rightAnswer[i]=c.substring(4);
        }

        String[] stuAnswer=new String[M];
        int x=0;
        int[] totalScore=new int[N];
        int[] wrongCount=new int[M];
        for(int i=0;i<N;i++){
            String c=br.readLine();
            int t=0;
            for(int j=0;j<c.length();j++){
                if(c.charAt(j)=='('){
                    int k=j+4;
                    while(c.charAt(k)!=')')
                        k++;
                    stuAnswer[t++]=c.substring(j+1,k);
                    j=k;
                }
            }

            int sum=0;
            for(int m=0;m<M;m++){
                if(stuAnswer[m].equals(rightAnswer[m]))
                    sum+=score[m];
                else
                    wrongCount[m]++;
            }
            totalScore[x++]=sum;
        }
        br.close();

        for(int i=0;i<N;i++)
            System.out.println(totalScore[i]);

        int max=0;
        for(int i=0;i<M;i++)
            if(max<wrongCount[i])
                max=wrongCount[i];
        if(max==0)
            System.out.println("Too simple");
        else{
            String temp=max+" ";
            for(int i=0;i<M;i++){
                if(max==wrongCount[i])
                    temp+=(i+1)+" ";
            }
            System.out.println(temp.trim());
        }
    }
}
