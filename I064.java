package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class I064 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<N;i++){
            int sum=0;
            char[] c=str[i].toCharArray();
            for(int j=0;j<c.length;j++)
                sum+=c[j]-48;
            set.add(sum);
        }
        System.out.println(set.size());
        Iterator<Integer> it=set.iterator();
        int count=0;
        while(it.hasNext()){
            if(count!=0)
                System.out.print(" ");
            System.out.print(it.next());
            count++;
        }
    }
}
