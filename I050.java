package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I050 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int nums[]=new int[N];
        for(int i=0;i<N;i++)
            nums[i]=Integer.parseInt(str[i]);
        //得到m和n
        int n=(int)Math.sqrt(N);
        while(N%n!=0)
            n--;
        int m=N/n;
        //插入排序
        for(int i=0;i<N;i++){
            for(int j=i;j>0;j--){
                if(nums[j]>nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }else
                    break;
            }
        }

        //定义二维矩阵matrix
        int[][] matrix=new int[m][n];
        matrix[0][0]=nums[0];
        int x=0,y=0;//x行y列
        for(int i=1;i<N;i++){
            boolean right=false,down=false,left=false,up=false;
            if(y+1<n&&matrix[x][y+1]==0)
                right=true;
            if(x+1<m&&matrix[x+1][y]==0)
                down=true;
            if(y-1>=0&&matrix[x][y-1]==0)
                left=true;
            if(x-1>=0&&matrix[x-1][y]==0)
                up=true;
            if(right&&up){
                matrix[--x][y]=nums[i];
                continue;
            }else{
                if(right){
                    matrix[x][++y]=nums[i];
                    continue;
                }else if(down){
                    matrix[++x][y]=nums[i];
                    continue;
                }else if(left){
                    matrix[x][--y]=nums[i];
                    continue;
                }else if(up){
                    matrix[--x][y]=nums[i];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
                if(j!=n-1)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}
