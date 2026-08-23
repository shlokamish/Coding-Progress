import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anumb: ");
        int num = sc.nextInt();
        /*if (num > 0) {
            System.out.println("Positive");
        } 
        else if (num < 0) {
            System.out.println("Negative");
        } 
        else {
            System.out.println("Zero");
        }*/
        /*if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } 
        else {
            System.out.println("The number is Odd.");
        }*/
        /*if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5.");
        } 
        else {
            System.out.println("The number is not divisible by both 3 and 5.");
        }
        if (Math.abs(num) > 100) //Math.abs() gives the absolute value,it removes the negative sign. 
        {
            System.out.println("The absolute value is greater than 100.");
        } 
        else {
            System.out.println("The absolute value is not greater than 100.");
        }*/
        String r= (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(r);
        if (num != 0) {
            if (num > 0) {
                System.out.println("Positive");
            } 
            else {
                System.out.println("Negative");
            }
        }
    }
}