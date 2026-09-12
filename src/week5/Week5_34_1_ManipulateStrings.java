package week5;

/*
5.34.1 Manipulate strings*
easy
|
30 min
|
Share
Write a method called manipulateStrings() that takes an ArrayList of Strings (ArrayList) as parameter. The method should iterate through each string in the list and perform a specific operation based on the length of the string. The operations are as follows:

For strings with length less than 5, convert them to uppercase.

For strings with length between 5 and 10 (inclusive), reverse the string.

For strings with length greater than 10, remove the vowels from the string. You can use String's replaceAll() method, for example: str.replaceAll("[aeiouAEIOU]", "") or any other convenient way. The method should print the each manipulated string.

Return Type: void

Example #1:
Parameter:

plain
Copy code
ArrayList<String> words = {"air", "world", "programming", "java", "openai"}
Output:

plain
Copy code
AIR
dlrow
prgrmmng
JAVA
ianepo
:

You can assume that the input ArrayList will not be null.

The operations are applied in the order described above. Use if-else
statements to complete them.

Ex1
Input:
plain
Copy code
cat programming open apple dog java elephant car banana computer
Output:
plain
Copy code
CAT
prgrmmng
OPEN
elppa
DOG
JAVA
tnahpele
CAR
ananab
retupmoc
Ex2
Input:
plain
Copy code
house elephant apple programming car dog java computer banana open cat
Output:
plain
Copy code
esuoh
tnahpele
elppa
prgrmmng
CAR
DOG
JAVA
retupmoc
ananab
OPEN
CAT
Ex3
Input:
plain
Copy code
OpenAI 1234 programming! Dog 5678 cat@ Elephant Apple car banana Java house
Output:
plain
Copy code
IAnepO
1234
prgrmmng!
DOG
5678
CAT@
tnahpelE
elppA
CAR
ananab
JAVA
esuoh
 */
//write your static method here. No need to add Main class or main method.

public class Week5_34_1_ManipulateStrings {
    public static void main(String[] args) {

    }
}
