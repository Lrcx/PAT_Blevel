package levelB;

import java.util.HashSet;
import java.util.Scanner;

public class I087 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<=N;i++){
            int temp=i/2+i/3+i/5;
            set.add(temp);
        }
        System.out.println(set.size());
    }
}
