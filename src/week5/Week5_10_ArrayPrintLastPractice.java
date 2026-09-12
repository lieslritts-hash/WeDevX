package week5;

/*
5.10 Array Print Last Practice
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna practice an array with Strings.

2.Array with Strings data type example
We need to write a program that print out only last names in String array.

We need to find index of space between first name and last name

Then we will use String substring() method

Example 1

java
Copy code
public static void main(String[] args) {

    // we need to print out only last names
    String[] aiResearchersArrays = {"Jeofrey Hinton", "Yann LeCun", "Fei-Fei Li", "Andrew Ng"};

    //First find a solution for one string
    String geoffrey = "Jeofrey Hinton";
    int indexOfSpace = geoffrey.indexOf(" ");
    System.out.println(geoffrey.substring(indexOfSpace+1));

    System.out.println("===========================================================");
    // we will use loop to go through an Array
    for(int i=0; i<aiResearchersArrays.length; i++){
        int index = aiResearchersArrays[i].indexOf(" ");
        System.out.println(aiResearchersArrays[i].substring(index+1));
    }
}
plain
Copy code
Output is:
Hinton
===========================================================
Hinton
LeCun
Li
Ng
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week5_10_ArrayPrintLastPractice {
    public static void main(String[] args) {
        //Create a string array of AI researchers
        //(e.g., "Geoffrey Hinton", "Yann LeCun", "Andre Ng", "Fei-Fei Li").
        String[] aiResearchersArr = {"Geoffrey Hinton", "Yann Lecun", "Andre Ng", "Fei-Fei Li"};

        //First find a solution for one String
        String geoffrey = "Geoffrey Hinton";
        int indexOfSpace = geoffrey.indexOf(' ');
        System.out.println(indexOfSpace);
        geoffrey.substring(indexOfSpace);
        System.out.println(geoffrey.substring(indexOfSpace+1));

        for (int i = 0; i < aiResearchersArr.length; i++) {
            String lastname = aiResearchersArr[i];
            int index = lastname.indexOf(' ');
            System.out.println(lastname.substring(index+1));




        }


    }
}
