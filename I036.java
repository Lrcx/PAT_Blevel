package levelB;

import java.util.Scanner;

public class I036 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        char c=s.next().charAt(0);
        int centre=(int)Math.round(N*1.0/2);
        for(int i=0;i<N;i++){
            System.out.print(c);
        }
        System.out.println();
        for(int i=0;i<centre-2;i++){
            System.out.print(c);
            for(int j=0;j<N-2;j++){
                System.out.print(" ");
            }
            System.out.println(c);
        }
        for(int i=0;i<N;i++){
            System.out.print(c);
        }
    }
}
