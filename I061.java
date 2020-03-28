package levelB;

import java.util.Scanner;

public class I061 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int score[]=new int[M];
        for(int i=0;i<M;i++)
            score[i]=s.nextInt();
        int rightAnswer[]=new int[M];
        for(int i=0;i<M;i++)
            rightAnswer[i]=s.nextInt();
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=0;j<M;j++){
                if(s.nextInt()==rightAnswer[j])
                    sum+=score[j];
            }
            System.out.println(sum);
        }
    }
}
