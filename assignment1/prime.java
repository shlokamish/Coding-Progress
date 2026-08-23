import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l,r,count,sum;
        System.out.print("L=");
        l=sc.nextInt();
        System.out.print("R=");
        r=sc.nextInt();
        count=0;
        sum=0;
        System.out.println("Prime:");
        for(int n=l;n<=r;n++){
            int flag=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(n+" ");
                count++;
                sum+=n;
            }
        }
        System.out.println("count: "+count);
        System.out.println("sum: "+sum);
    }
}