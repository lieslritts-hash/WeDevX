package week3;

import java.util.Scanner;

/*
3.11.2 Group Determination Based on Gender and Age in Java*
easy
|
30 min
|
Share
Write a java program that will ask the user for their gender and
age and will determine if the user is a boy or a man, or a girl
or a woman. Conditions: if the user is younger than 20 and a male
then print out Boy if the user is younger than 20 and a female then
print out Girl if the user is older than 19 and a male then print out
Man if the user is older than 19 and a female then print out Woman
Expected Result

plain
Copy code
Enter your gender:
Enter your age:
X
Where X is one of Boy, Girl, Man, Woman Note: It's possible to solve this
problem without using nested if statements by using && conditional operator.
But for practice purposes use nested if statements.
 */

public class Week3_11_2_GroupDeterminationBasedOnGenderAndAgeInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your gender:");
        String gender = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (gender.equalsIgnoreCase("male") && age < 20) {
            System.out.println("Boy");
        } else if (gender.equalsIgnoreCase("male") && age >= 20) {
            System.out.println("Man");
        } else if (gender.equalsIgnoreCase("female") && age < 20) {
            System.out.println("Girl");
        } else if (gender.equalsIgnoreCase("female") && age >= 20) {
            System.out.println("Woman");
        }
    }
}