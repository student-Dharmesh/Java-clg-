package Apnaclg;

public class palindrome {
    public static void main(String[] args) {
        int a=129;
        int orignal=a;
        int rev=0;
        while(a>0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;

        }
        if( orignal==rev){
            System.out.println(" p ");
        }
        else {
            System.out.println(" N0");
        }

    }



}
