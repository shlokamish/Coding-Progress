import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,x;
        System.out.print("Enter first integer: ");
        a = sc.nextInt();
        System.out.print("Enter second integer: ");
        b = sc.nextInt();
        System.out.println("a+b=" +(a + b));
        System.out.println("a-b=" +(a - b));
        System.out.println("a*b=" +(a * b));
        if (b!=0) {
            System.out.println("a/b=" +(a / b));
            System.out.println("a%b=" +(a % b));
        } else
            System.out.println("cannot be divided");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("(a > 0) && (b > 0) = " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b > 0) = " + ((a > 0) || (b > 0)));
        System.out.println("!(a > 0) = " + (!(a > 0)));
        x = a;
        System.out.println("x=a-> " + x);
        x += b;
        System.out.println("x+=b->" + x);
        System.out.println("a & b  = " + (a & b));
        System.out.println("a | b  = " + (a | b));
        System.out.println("a ^ b  = " + (a ^ b));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    }
}