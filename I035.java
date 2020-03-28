package levelB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I035 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        String compare=br.readLine();
        br.close();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=Integer.parseInt(s[i]);
        int arr1[]=Arrays.copyOfRange(arr,0,arr.length);
        I035 pat=new I035();
        pat.MergeSort(arr,compare);
        pat.InsertionSort(arr1,compare);

    }
    public void InsertionSort(int[] arr,String compare){
        int count=0;
        for(int i=0;i<arr.length;i++){
            String str="";
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else
                    break;
            }
            for(int k=0;k<arr.length;k++){
                str+=arr[k]+" ";
            }
            count++;
            if(compare.equals(str.trim()))
                count=-2;
            if(count==-1){
                System.out.println("Insertion Sort");
                System.out.print(str.trim());
                break;
            }
        }
    }
    public void MergeSort(int[] arr,String compare){
        int k=1,count=0;
        while(true){
            String str="";
            k*=2;
            for(int i=0;i< arr.length/k;i++){
                Arrays.sort(arr,i*k,(i+1)*k);
            }
            if(arr.length%k!=0)
                Arrays.sort(arr, arr.length/k*k,arr.length);
            count++;
            for(int m=0;m<arr.length;m++)
                str+=arr[m]+" ";
            if(compare.equals(str.trim()))
                count=-2;
            if(count==-1){
                System.out.println("Merge Sort");
                System.out.print(str.trim());
                break;
            }
            if(arr.length/k==0)
                break;
        }
    }
}
