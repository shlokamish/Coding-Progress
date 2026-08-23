import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Num: ");
        int n=sc.nextInt();
        int i,d=0,rev=0,temp,sum=0,digit,power,perfect=0;
        if(n<2)
            d=1;
        else{
            for(i=2;i<n;i++){
                if(n%i==0){
                    d=1;
                    break;
                }
            }
        }
        temp=n;
        while(temp>0){
            digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        temp=n;
        int digits=0;
        while(temp>0){
            digits++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0){
            digit=temp%10;
            power=1;
            for(i=1;i<=digits;i++)
                power=power*digit;
            sum=sum+power;
            temp=temp/10;
        }
        for(i=1;i<n;i++){
            if(n%i==0)
                perfect=perfect+i;
        }
        if(d==0)
            System.out.println("prime");
        else
            System.out.println("not prime");
        if(rev==n)
            System.out.println("palindrome");
        else
            System.out.println("not pallinfrome");
        if(sum==n)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
        if(perfect==n)
            System.out.println("perfect");
        else
            System.out.println("not perfect");
    }
}