package Apnaclg;

import java.util.Scanner;

public class revarsearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter array values ");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int j=n-1;j>=0;j--){
            System.out.print(arr[j]+ " ");
        }

    }
}



