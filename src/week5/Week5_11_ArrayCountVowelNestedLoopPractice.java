package week5;

/*
5.11 Array Count Vowel Nested Loop Practice
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna practice arrays with nested loops. It is going to be mind-blowing topic and will solve one of the hardest tasks for this topic.

2.Array with nested loop to count vowels in a String arrays
We need to write a program that counts vowels in each String in the array. In this example, we will use nested loop and if statement. Example 1

java
Copy code
public static void main(String[] args) {

    // we need to create String array
    String[] aiArray = {"nearal networks", "deep learning", "reinforcement learning", "artificial general intelligence"};

    //print out number of vowels in each concept in the array

    for(int x=0; x<aiArray.length; x++){

        String str = aiArray[x];
        int counter = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='u' ||
            str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='y'){
                counter++;
            }
        }
        System.out.println(str + "has "+counter+" vowels");
    }
}
plain
Copy code
Output is:
nearal networkshas 5 vowels
deep learninghas 5 vowels
reinforcement learninghas 8 vowels
artificial general intelligencehas 13 vowels
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_11_ArrayCountVowelNestedLoopPractice {
    public static void main(String[] args) {
        //create a string of AI concepts
        // (e.g., "neural networks", "deep learning", "reinforcement learning", "artificial general intelligence")
        //print out the number of vowels in each concept in the array.

        String[] aiArr = {"neural networks", "deep learning", "reinforcement learning", "artificial general intelligence"};

        for (int x = 0; x < aiArr.length; x++) {
            int counter = 0;
            String str = aiArr[x];

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    counter++;
                }
            }

            System.out.println(str + " has " + counter + " vowels");
        }

    }

}
