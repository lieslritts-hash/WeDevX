package week5;

/*
5.9 Array Find The Largest Value
1. Overview
Hello superstars! Welcome back to another session!
In this session, we keep practicing Arrays.

2. Finding the largest number in an array
We need to write a program to find out the largest number in an Array. Example 1

java
Copy code
public static void main(String[] args) {

    // find the largest number and print out
    int[] numbers = {12,45,34,77,34};

    int right = numbers[1];
    int left = numbers[0];
    for(int i=2; i<numbers.length; i++){
        if(left>right){
            right = numbers[i];
        }
        else{
            left = right;
            right = numbers[i];
        }
    }

    System.out.println(left);

}
plain
Copy code
Output is:
77
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_9_ArrayFindTheLargestValue {
    public static void main(String[] args) {
        //find the largest number in an array
        //and print it out
        int[] nums = {33, 55, 10, 5, 77, 22, 10};

        int right = nums[1];
        int left = nums[0];
        for (int i = 2; i < nums.length; i++) {

            if (left <= right) {
                left = right;
            }
                right = nums[i];

        }
        System.out.println(left);
    }
}

                 //if (nums[i] > nums[i + 1]) {
                //i:0 if(33 > 55)
                //i:1 if(55 > 10)
                //i:2 if(10 > 5)
                //i:3 if(5 > 77)
                //i:4 if(77 > 22)
                //i:5 if(77 > 10)

