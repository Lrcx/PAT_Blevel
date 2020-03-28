package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class I045 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int nums[]=new int[N];
        int left[]=new int[N];int right[]=new int[N];
        for(int i=0;i<N;i++){
            nums[i]=Integer.parseInt(str[i]);
        }
        int count=0,temp=0;
        left[0]=nums[0];temp=nums[0];
        for(int i=1;i<N;i++){
            if(nums[i]>temp){
                left[i]=nums[i];
                temp=nums[i];
            }
        }

        right[N-1]=nums[N-1];temp=nums[N-1];
        for(int i=N-1;i>=0;i--){
            if(nums[i]<temp){
                right[i]=nums[i];
                temp=nums[i];
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            if(left[i]!=0&&right[i]!=0){
                count++;
                list.add(left[i]);
            }
        }

        if(count==0){
            System.out.println(count);
            System.out.println();
            return;
        }else
            System.out.println(count);
        for(int i=0;i<list.size();i++){
            if(i!=0)
                System.out.print(" ");
            System.out.print(list.get(i));
        }
    }
}
