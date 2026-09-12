package week5;

/*
5.4 How To Access An Element In Array
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn how to access an element in an array and read them or use them for different type of calculations.

2. Acces an element in an Array
Each element in an array has its index number, it starts from 0. We can access an element in an Array trough index number. Let's see an example Example 1

java
Copy code
public static void main(String[] args) {

    int[] arr = {10,4,56,78,4};
    int el = arr[0];
    System.out.println(el);
    System.out.println(arr[0]);
    System.out.println(arr[3]);

    //use values of elements to do some calculation
    int sum = arr[0] + arr[1];
    System.out.println(sum);

    //we can access and change the element's value
    arr[2] = 5;
    System.out.println(arr[2]);
}
plain
Copy code
Output is:
10
10
78
14
5
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */

//write your static method here. No need to add Main class or main method.

public class Week5_4_HowToAccessAnElementInArray {
    public static void main(String[] args) {

        int[] arr = {10,13,24,20,10};

        int num = arr[0]; //10
        System.out.println(num);

        System.out.println(arr[0]);
        System.out.println(arr[2]);

        //use the values of elements to do some calculations
        int sum = arr[1] + arr[3]; //13+20
        System.out.println(sum);

        //I can access the element and change it's value
        arr[4] = 55;
        System.out.println(arr[4]);


    }
}
