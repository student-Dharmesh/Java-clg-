package Apnaclg;

public class sum {
    public static void main(String[] args) {
        int a=121;
        int sum=0;
while(a>0){
sum=sum+a%1;
sum+=a%10;
a=a/10;
}
        System.out.println(sum);
}}
