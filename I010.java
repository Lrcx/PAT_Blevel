package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I010 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] str=s.nextLine().split("\\s+");
        int[] nums=new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i]=Integer.parseInt(str[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            if(i==0&&nums[i+1]==0){
                list.add(0);
                list.add(0);
            }
            if(nums[i+1]==0){
                continue;
            }
            list.add(nums[i]*nums[i+1]);
            list.add(nums[i+1]-1);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(" ");
            }
        }
    }
}
