package levelB;

import java.util.Scanner;

public class I003 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=Integer.parseInt(s.nextLine());//读入第一行的数字
        String str[]=new String[N];
        for(int i=0;i<N;i++){
            str[i]=s.nextLine();//读入每行要判断的字符串，放到str数组中
        }

        for(int i=0;i<str.length;i++){
            boolean flag=true;
            //分别记录P和T字母的位置
            int pos_P=0,pos_T=0;
            //分别记录P和T字母的个数，之所以要记录个数就是为了不用判断P之前，PT之间，T之后全是A
            //因为如果P和T都只有一个，再加上条件一的约束，剩下的自然全是A，简化代码
            int count_P=0,count_T=0;
            char c[]=str[i].toCharArray();
            for(int j=0;j<c.length;j++){
                //每一个字母是P、A、T中的一个
                if(c[j]=='P'||c[j]=='A'||c[j]=='T'){
                    if(c[j]=='P'){
                        pos_P=j; //记录P的下标
                        count_P++;//记录P的个数
                    }
                    if(c[j]=='T'){
                        pos_T=j;    //记录T的下标
                        count_T++; //记录T的个数
                    }
                }else{
                    flag=false;//判断如果有一个字母既不是P也不是A也不是T就记flag为false，然后跳出循环
                    break;
                }
            }
            if(flag){ //flag为true，就说明字符串中的字母全为P、A、T，如果为false就说明还有别的字母，直接输出NO
                if(count_P==1&&count_T==1&&pos_T-pos_P>1){//保证P的个数，T的个数都为一，
                    //还要pos_T-pos_P>1,一来保证T字母一定在P字母的后边，另一方面防止PT这种情况
                    if(pos_P*(pos_T-pos_P-1)==(c.length-1-pos_T)){//此题最重要的部分
                        //pos_P就是P之前A的个数，pos_T-pos_P-1就是P与T之间A的个数，c.length-1-pos_T就是T之后A的个数
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
