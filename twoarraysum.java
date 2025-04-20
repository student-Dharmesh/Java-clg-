package Apnaclg;

public class twoarraysum {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        int[] sum=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }
        for(int j=0;j<4;j++){
            System.out.println(sum[j]+"  ");
        }

    }
}
