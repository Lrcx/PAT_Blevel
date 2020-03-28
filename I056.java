package levelB;

import java.util.Scanner;

public class I056 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int nums[]=new int[N];
        for(int i=0;i<N;i++)
            nums[i]=s.nextInt();
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j!=i)
                    sum+=nums[i]*10+nums[j];
            }
        }
        System.out.println(sum);
    }
}
