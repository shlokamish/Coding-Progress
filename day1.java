/*class main {
    public static void main(String[] args) {
        //System.out.println("Hello World");
            //Variables:
        int age = 20;
        float marks = 89.5f;
        char grade = 'A';
        boolean x = true; //(C doesnt have boolean: use <stdbool.h>)
        System.out.println(age);
        System.out.println(grade);
        System.out.println(marks);
        System.out.println(x);
        System.out.println("Age "+age); //(+ joins strings and values)

    }
}*/

// TAKING INPUT

import java.util.Scanner; //use scanner class
class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //creating scanner obj 's'; takes input from system
        int x = s.nextInt(); //same as scanf("%d", &x);
        //double x= s.nextDouble();
        //String x=s.next(); [one word]
        //String x=s.nextLine();
        //System.out.println(x);
        // if else
        if (x > 10)
            System.out.println("Big");
        else
            System.out.println("Small");

        //LOOPS
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        while(x > 0) {
            System.out.println(x);
        x--;
}

    }
}
