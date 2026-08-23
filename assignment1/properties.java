import java.util.Scanner;
class main{
    public static void main(String[] args){
        int n,temp,prod,sum,rev;
        Scanner sc=new Scanner(System.in);
        System.out.print("num:");
        n=sc.nextInt();
        temp=n;
        digits=sum=rev=0;
        prod=1;
        if(n==0){
            digits=1;
            prod=0;
        }
        while(n>0){
            int d=temp%10;
            digits++;
            sum+=d;
            prod*=d;
            rev=rev*10+d;
            temp/=10;
        }
        System.out.println("digits="+digits);
        System.out.println("sum="+sum);
        System.out.println("prod="+prod);
        System.out.println("rev="+rev);
        if(n==rev)
            System.out.println("palindrome");
        else
            System.out.println("not pallindrome");
    }
}