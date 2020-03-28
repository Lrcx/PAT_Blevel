package levelB;

import java.util.Scanner;

public class I086 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        StringBuilder sb=new StringBuilder();
        sb.append(A*B);
        int index=0;
        for(int i=sb.length()-1;i>=0;i--)
            if(sb.charAt(i)!='0'){
                index=i;
                break;
            }
        for(int i=index;i>=0;i--)
            System.out.print(sb.charAt(i));
    }
}
