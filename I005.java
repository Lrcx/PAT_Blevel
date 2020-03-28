package levelB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class I005 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int nums[]=new int[N];
        for(int i=0;i<N;i++){
            nums[i]=s.nextInt();
        }
        Boolean b[]=new Boolean[N];
        for(int i=0;i<N;i++){
            b[i]=true;
        }
        for(int i=0;i<N;i++){
            if(b[i]){
                int num=nums[i];
                while(num!=1){
                    if(num%2==0){
                        num=num/2;
                        for(int j=0;j<N;j++){
                            if(num==nums[j]){
                                b[j]=false;
                            }
                        }
                    }else{
                        num=(3*num+1)/2;
                        for(int j=0;j<N;j++){
                            if(num==nums[j]){
                                b[j]=false;
                            }
                        }
                    }
                }
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            if(b[i]){
                list.add(nums[i]);
            }
        }
        int temp[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            temp[i]=list.get(i);
        }
        Arrays.sort(temp);
        for(int i=temp.length-1;i>=0;i--){
            System.out.print(temp[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}
