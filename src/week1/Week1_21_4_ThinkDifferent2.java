package week1;

/*
Write a program that declares a String that stores
the following message with 2 tab characters between
the company name and the year it was founded. Then
prints out the value of the String.

plain
Copy code
____ apple = ____;
Expected Output:

plain
Copy code
Apple Inc. Founded in 1976
don't forget that Inc. has a period in the end.
 */

public class Week1_21_4_ThinkDifferent2 {
    public static void main(String[] args) {
        String apple = "Apple Inc.\t\tFounded in 1976";
        System.out.println(apple);
    }
}

