package week4;

/*
4.28.2 Count backwards*
easy
|
30 min
|
Share
Create a method called printBackwards() that takes an int parameter and counts backwards from that number in the following pattern using two while loops:

Return Type: void

Example #1:
Parameter:

plain
Copy code
int number = 5
Output:

plain
Copy code
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
The program should validate the user input and display an error message if the input is invalid.

Example #2:
Parameter:

plain
Copy code
int number = -1
Output:

plain
Copy code
Error! Number n can't be less than 1
: Make sure to use two for loops to accomplish this task.
 */
//write your static method here. No need to add Main class or main method.

public class Week4_28_2_CountBackwards {
    public static void main(String[] args) {

        printBackwards(5);
        printBackwards(-1);

    }

    public static void printBackwards(int number) {

        if (number < 1) {
            System.out.println("Error! Number n can't be less than 1");
            return;
        }

          int i = number;

          while (i >= 1) {

              int j = i;

              while (j >= 1) {
                  System.out.print(j + " ");
                  j--;
            }

              System.out.println();
              i--;
        }
    }
}
