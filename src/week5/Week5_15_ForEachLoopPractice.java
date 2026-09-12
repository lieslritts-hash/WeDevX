package week5;

/*
5.15 For Each Loop Practice
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna practice for each loop with Arrays.

2. For each loop examples
In below example, we will loop int and String types arrays using for each loop and solve some task using if statement.

java
Copy code
public static void main(String[] args) {

    int[] nums = {3,7,9,2,1};
    for(int i: nums){
        System.out.println(i);
    }

    // need to find the smallest number
    int smallest = nums[0];
    for(int num: nums){
    if(smallest>num){
        smallest = num;
    }
}
    System.out.println("Smallest number is "+smallest);

    System.out.println("===========================");
    String[] animals = {"dog", "cat", "horse"};
    for(String animal: animals) {
        System.out.println(animal);
    }
}
plain
Copy code
Output is:
3
7
9
2
1
Smallest number is 1
===========================
dog
cat
horse
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_15_ForEachLoopPractice {
    public static void main(String[] args) {

        int[] nums = {12, 455, 33, 23};

        // limitation of for each loop
        //you can only start from the beginning and go till the end
        //of collection
        //if you need to use the indexes to solve the problem
        //then you need to use regular for loop
        for (int num : nums) {
            System.out.println(num);
        }

        int smallest = nums[0];
        for (int num : nums) {

            if (smallest > num) {
                smallest = num;
            }

            System.out.println(smallest);

            String[] arr = {"cat", "dog", "horse"};

            for (String str : arr) {
                if (!str.equals("horse")) {
                    System.out.println(str);
                }
            }
        }
    }

}
