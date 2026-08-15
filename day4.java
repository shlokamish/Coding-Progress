//2D ARRAYS
int[][] arr = new int[3][3]; //creates 3 rows × 3 columns
System.out.println(arr[0][1]);

//TRAVERSING 
for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

/* arr.length       = rows
arr[i].length    = columns*/

//ARRAY LIST
int[] arr = new int[5];
The size is fixed at 5.
With ArrayList, the size can grow or shrink.x
ArrayList<Integer> arr = new ArrayList<>();

arr.add(20);
arr.add(30);//add element
System.out.println(arr.get(0)); // access element
arr.set(1, 50); //change element
arr.remove(1);//remove element
arr.size();// size

import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        System.out.println(arr.get(0));
        arr.set(1, 50);
        arr.remove(0);
        System.out.println(arr);
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}