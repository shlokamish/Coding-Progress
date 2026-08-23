import java.util.Scanner;
class main{
    public static void main(String[] args){
        int u;
        double bill=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("units:");
        u=sc.nextInt();
        if(u<0){
            System.out.println("Invalid");
        }
        else{
            if(u<=100)
                bill=u*2;
            else if(u<=200)
                bill=100*2+(u-100)*3;
            else if(u<=400)
                bill=100*2+100*3+(u-200)*5;
            else
                bill=100*2+100*3+200*5+(u-400)*7;

            bill= bill+50;
            System.out.println("bill="+bill);
        }
    }
}