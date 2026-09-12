package week1;

/*
1.19.3 Youtube*
easy
|
30 min
|
Share
Write a program for Youtube. 1) Create a title variable
with "From 0 to Hero in 6 months with WeDevX" as a value.
2) Create a mostLikedComment variable with a value of
"Best Instructors, Best Curriculum, Best Community".
3) Create an authorOfMostLikedComment variable with a
value of "Lukas". Print the value of all variables:
Expected Output:

plain
Copy code
From 0 to Hero in 6 months with WeDevX
Best Instructors, Best Curriculum, Best Community - Lukas

 */

public class Week1_19_3_Youtube {
    public static void main(String[] args) {
        String title = "From 0 to Hero in 6 months with WeDevX";
        String mostLikedComment = "Best Instructors, Best Curriculum, Best Community";
        String authorOfMostLikedComment = "Lukas";

        System.out.println(title);
        System.out.println(mostLikedComment + " - " + authorOfMostLikedComment);
    }
}

