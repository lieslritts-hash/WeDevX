package week5;

/*
5.6 Arrays with Loops
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about using loops with Arrays.

2. Loops with arrays
We need to print out all elements in an array. We can get an element by index number and printing out every time,
but it takes time and code will be hard coded. Using loops simplify task solution and makes code more efficient.
Let's see an example Example 1

88
88
88
Copy code
========================
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week5_6_ArraysWithLoops {
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 12, 44, 77, 99};

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);

        //the variable of an array offers
        //a property called length
        //length in array is a property, not a method
        //so it doesn't have ()
        System.out.println("=====================");
        System.out.println(nums.length);
        System.out.println("=====================");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }

        String[] cities = {"Dubai", "Singapore", "Chicago", "LA", "Miami"};

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}
