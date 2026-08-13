/*METHODS

functions in c =methods in java
static int add(int a, int b) {
    return a + b;
}

A method is simply a block of code that performs a particular task.

syntax:
static returnType methodName(parameters) {
    code
}

Parameters vs arguments
static int add(int a, int b)
a and b here are parameters (when we define)
add(5, 3);
5 and 3 are arguments (when we call)*/

/*class main{
    public static void main(String[] args){
        int result = add(10,12);
        System.out.println(result);
    }
    static int add(int a, int b){
        return (a+b);
    }
}*/

/* STATIC:
static allows to call a method directly from main without creating an object.
when creating methods that we want to call directly from main, use static.

NO METHOD PROTOTYPE
In C we declare a function before defining.
int add(int a, int b);
In Java, we don't need a separate prototype. java knows all the methods inside the class while compiling.

ARRAYS:
To create
int[] arr = new int[5]; //creates space for 5 integrers.
int[] arr = {10, 20, 30, 40, 50};
System.out.println(arr[0]);
for(int i=0; i<5; i++) {
    System.out.println(arr[i]);
}
//IMPORTANT
for(int i=0; i<arr.length; i++) {
    System.out.println(arr[i]);
}//instead of manually writing 5 or length of array, use 'arrayname'length
*/

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr= new int [5];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}