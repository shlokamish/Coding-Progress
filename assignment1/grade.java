import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total=0;
        for(int i=1;i<=5;i++){
            System.out.print("enter marks");
            int m=sc.nextInt();
            if(m<0||m>100){
                System.out.println("Invaild marks");
                break;
            total+=m;
            if(m<40){
            System.out.println("failed");
            break;}
        }
        double avg=total/5;
        double per=total/500*100;
        char grade;
            if(per>=90) 
                grade='A';
            else if(per>=80) 
                grade='B';
            else if(per>=70) 
                grade='C';
            else if(per>=60) 
                grade='D';
            else if(per>=50) 
                grade='E';
            else 
                grade='F';
            System.out.println("Total: "+total);
            System.out.println("Avg: "+avg);
            System.out.println("Per: "+per+"%");
            System.out.println("Grade: "+grade);
        }
    }
}