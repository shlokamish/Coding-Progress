import java.util.Scanner;
class main{
    public static void main(String[] args) {
        int i,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numb of students: ");
        n = scanner.nextInt();
        for(i=0;i<n;i++){
            System.out.print("Enter name");
            String name = scanner.next();
            System.out.print("Enter roll number");
            int roll = scanner.nextInt();
            System.out.print("Enter age");
            int age = scanner.nextInt();
            System.out.print("Enter max marks");
            double max = scanner.nextDouble();
            System.out.print("Enter marks in subject 1");
            double mark1 = scanner.nextDouble();
            System.out.print("Enter marks in subject 2");
            double mark2 = scanner.nextDouble();
            System.out.print("Enter marks in subject 3");
            double mark3 = scanner.nextDouble();
            double total = mark1+mark2+mark3;
            double totalmax = 3*max;
            double average = total / 3;
            double percentage = (total/totalmax)*100;
            System.out.println("Student Details");
            System.out.println("Name" + name);
            System.out.println("Roll Number" + roll);
            System.out.println("Age" + age);
            System.out.println("Total Mark" + total);
            System.out.println("Average" + average);
            System.out.println("Percentage" + percentage + "%");
        }
    }
}