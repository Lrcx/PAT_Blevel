package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class I068 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int M=Integer.parseInt(str[0]);//M列
        int N=Integer.parseInt(str[1]);//N行
        int TOL=Integer.parseInt(str[2]);

        HashMap<Integer,Integer> map=new HashMap<>();
        int px[][]=new int[N][M];
        for(int i=0;i<N;i++){
            String[] temp=br.readLine().split("\\s+");
            for(int j=0;j<M;j++){
                px[i][j]=Integer.parseInt(temp[j]);
                if(map.containsKey(px[i][j]))
                    map.put(px[i][j],map.get(px[i][j])+1);
                else
                    map.put(px[i][j],1);
            }
        }

        int count=0,x=0,y=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map.get(px[i][j])==1&&judge(px,i,j,TOL,M,N)){
                    count++;
                    x=i;
                    y=j;
                }
            }
        }

        if(count==0)
            System.out.print("Not Exist");
        else if(count==1)//(5, 3): 16711680
            System.out.print("("+(y+1)+", "+(x+1)+"): "+px[x][y]);
        else
            System.out.print("Not Unique");
    }
    public static boolean judge(int[][] px,int x,int y,int TOL,int M,int N){
        int[][] coordinate={{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
        for(int i=0;i<8;i++){
            int coordinate_x=x+coordinate[i][0];
            int coordinate_y=y+coordinate[i][1];
            if(coordinate_x>=0&&coordinate_x<N&&coordinate_y>=0&&coordinate_y<M&&Math.abs(px[x][y]-px[coordinate_x][coordinate_y])<=TOL)
                return false;
        }
        return true;
    }
}
