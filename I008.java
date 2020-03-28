package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I008 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int pos=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int nums[]=new int[N];
        for(int i=0;i<N;i++){
            list.add(s.nextInt());
        }
        int j=0;
        for(int i=N-pos%N;i<list.size();i++){
            nums[j]=list.get(i);
            j++;
        }
        for(int i=0;i<N-pos%N;i++){
            nums[j]=list.get(i);
            j++;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i!=nums.length-1){
                System.out.print(" ");
            }
        }

    }
}
