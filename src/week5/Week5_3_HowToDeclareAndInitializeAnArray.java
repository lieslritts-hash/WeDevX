package week5;

/*
5.3 How To Declare And Initialize an Array
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn how to declare and initialise arrays.

2. How to declare and initialize arrays in Java?
This below image illustrates array declaration and initialization. 1*GEmaa3Teeoi9m_fzVZOljw.pngExample 1

java
Copy code
public static void main(String[] args) {

    // declare an int array
    int[] variable;
    int variable2[];
    int variable3 [];

    //declare and initialize an array
    int[] arrVar = new int[5];
    //Array has fixed(static) size

    // we can use literal values
    int[] arrVar1 = {1,4,6,7,8};

    int[] arrVar2 = new int[] {3,6,7,8,4};

}
3. Conclusion
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */

public class Week5_3_HowToDeclareAndInitializeAnArray {
    public static void main(String[] args) {

        //declare an int array
        int[] variable; //industry standard
        int variable2[];

        int[]variable3;

        //declare and initialize and array;
        //whatever you put inside the square brackets
        //after the new keyword that you're
        //defining the size of the array
        //size of an array -> how many rooms will this
        //array have

        //Array has a fixed (static) size

        int[] arrVar = new int[5];

        //use literal values
        //I created an array with size 4

        int[] arrVar2 = {4,3,2,7};

        //what is the size of this array?
        //the values inside an array are called elements
        //because I have 5 elements in the array initialization
        //the size of an array is 5
        //size -> length
        int[] arrVar3 = new int[] {2, 5, 8, 3, 3};


    }
}
