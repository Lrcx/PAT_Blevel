package levelB;

import java.util.ArrayList;
import java.util.Scanner;

public class I027 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        char c=s.next().charAt(0);

        int count=0,sum=1;
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            list.add(2*count+1);
            count++;
            sum+=2*count+1;
            if(2*sum-1>N){
                break;
            }
        }
        count=0;
        for(int i=list.size()-1;i>=0;i--){
            for(int j=0;j<count;j++){
                System.out.print(" ");
            }
            for(int k=0;k<list.get(i);k++){
                System.out.print(c);
            }
            count++;
            System.out.println();
        }
        count--;
        for(int i=1;i<list.size();i++){
            count--;
            for(int j=0;j<count;j++){
                System.out.print(" ");
            }
            for(int k=0;k<list.get(i);k++){
                System.out.print(c);
            }
            System.out.println();
        }

        sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        sum=2*sum-1;
        System.out.print(N-sum);
    }
}
