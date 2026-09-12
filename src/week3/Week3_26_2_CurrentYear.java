package week3;

/*
3.26.3 Current Year*
easy
|
30 min
|
Share
Write a Main class with a static method called getCurrentYear() that returns the current year 2023 as an int. Call the getCurrentYear() the method in the main method. And print out the value of getCurrentYear() Expected Output:

plain
Copy code
2023
 */

public class Week3_26_2_CurrentYear {
    public static void main(String[] args) {
        int year = getCurrentYear();
        System.out.println(year);
    }

    public static int getCurrentYear() {
        return 2023;
    }
}
