package Apnaclg;

import java.util.Scanner;

public class oddevenarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter array values ");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int even=0;
        int odd=0;
        for(int i=0;i<n;i++) {
            if(arr[i]%2==0){
                even++;
            }
            else
                odd++;
        }
        System.out.println ("even" +"  " + even + "  " + "odd" + "  " +odd);

    }
}
