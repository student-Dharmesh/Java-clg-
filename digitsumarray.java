package Apnaclg;

import java.util.Scanner;

public class digitsumarray {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of the array");
    int n=sc.nextInt();
    System.out.println("enter array values ");
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    for (int j=0;j<arr.length;j++){
        System.out.print(arr[j]+ " ");
    }
    int s=0;
    for (int j=0;j<arr.length;j++) {
        s+=arr[j];
    }
    System.out.print(s);
}
}