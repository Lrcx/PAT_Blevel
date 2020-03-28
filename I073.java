package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I073 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] temp=br.readLine().split(" ");
        int N=Integer.parseInt(temp[0]);//学生人数
        int M=Integer.parseInt(temp[1]);//多选题的个数
        int[] scores=new int[M];
        int[][] correctAnswer=new int[M][5];
        for(int i=0;i<M;i++){
            char[] c1=br.readLine().toCharArray();
            scores[i]=c1[0]-48;
            for(int j=6;j<c1.length;j++){
                if(c1[j]!=' '){
                    correctAnswer[i][c1[j]-97]++;
                }
            }
        }
        int wrongCount[][]=new int[M][5];
        double tolScore[]=new double[N];

        for(int x=0;x<N;x++){
            int[][] stuAnswer=new int[M][5];
            char[] c2=br.readLine().toCharArray();
            int j=0;
            for(int i=0;i<c2.length;i++){
                if(c2[i]>='a'&&c2[i]<='e')
                    stuAnswer[j][c2[i]-97]++;
                else if(c2[i]==')')
                    j++;
            }
            for(int m=0;m<M;m++){
                boolean noScore=false,halfScore=false;
                for(int k=0;k<5;k++){
                    if(stuAnswer[m][k]==1&&correctAnswer[m][k]==0){
                        wrongCount[m][k]++;
                        noScore=true;
                    } else if(stuAnswer[m][k]==0&&correctAnswer[m][k]==1){
                        wrongCount[m][k]++;
                        halfScore=true;
                    }
                }
                if(!noScore){
                    if(halfScore)
                        tolScore[x]+=scores[m]*1.0/2;
                    else
                        tolScore[x]+=scores[m];
                }
            }
        }
        for(int i=0;i<tolScore.length;i++){
            System.out.printf("%.1f\n",tolScore[i]);
        }
        int max=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<5;j++){
                if(max<wrongCount[i][j])
                    max=wrongCount[i][j];
            }
        }
        if(max==0)
            System.out.println("Too simple");
        else{
            for(int i=0;i<M;i++){
                for(int j=0;j<5;j++){
                    if(max==wrongCount[i][j])
                        System.out.println(max+" "+(i+1)+"-"+(char)(j+97));
                }
            }
        }
    }
}
