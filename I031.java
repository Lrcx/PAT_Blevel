package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I031 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] str=new String[N];
        for(int i=0;i<N;i++){
            str[i]=br.readLine();
        }

        int[] quan={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        int count=0;

        for(int i=0;i<N;i++){
            boolean flag=true;
            int sum=0;
            char[] c=str[i].toCharArray();
            for(int j=0;j<17;j++){
                if(c[j]>='0'&&c[j]<='9'){
                    sum+=(c[j]-'0')*quan[j];
                }else{
                    count++;
                    System.out.println(str[i]);
                    flag=false;
                    break;
                }
            }
            if(flag){
                int Z=sum%11;
                switch (Z){
                    case 0: if(c[17]!='1'){ count++;System.out.println(str[i]); } break;
                    case 1: if(c[17]!='0'){ count++;System.out.println(str[i]); } break;
                    case 2: if(c[17]!='X'){ count++;System.out.println(str[i]); } break;
                    case 3: if(c[17]!='9'){ count++;System.out.println(str[i]); } break;
                    case 4: if(c[17]!='8'){ count++;System.out.println(str[i]); } break;
                    case 5: if(c[17]!='7'){ count++;System.out.println(str[i]); } break;
                    case 6: if(c[17]!='6'){ count++;System.out.println(str[i]); } break;
                    case 7: if(c[17]!='5'){ count++;System.out.println(str[i]); } break;
                    case 8: if(c[17]!='4'){ count++;System.out.println(str[i]); } break;
                    case 9: if(c[17]!='3'){ count++;System.out.println(str[i]); } break;
                    case 10: if(c[17]!='2'){ count++;System.out.println(str[i]); } break;
                }
            }
        }
        if(count==0)
            System.out.print("All passed");
    }
}