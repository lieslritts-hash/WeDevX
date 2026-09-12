package week3;

/*
3.42.1 Create Initials*
easy
|
30 min
|
Share
Description: Your task is to write a static method called createInitials() that takes in two input String parameters, the first name, and last name, and returns a String that contains the initials of the given name. The initials should be the first letter of each name. Params: Two Strings: The first name and the last name. Return: A String: The initials of the given name. Task: Your task is to write a static method called createInitials() that will take in two input String parameters, the first name, and last name, and then return a String that contains the initials of the given name. The initials should be the first letter of each name. Expected Output:

plain
Copy code
createInitials("Elon", "Musk"); // Expected output: "EM"
createInitials("Marilyn", "Monroe"); // Expected output: "MM"
createInitials("Lewis ", "Hamilton"); // Expected output: "LH"
To convert two chars into a String you can use String concat. "" + 'A' +'B' => AB
 */
//write your static method here. No need to add Main class or main method.

public class Week3_42_1_CreateInitials {
    public static void main(String[] args) {

        String result1 = createInitials("Elon", "Musk");
        System.out.println(result1);

        String result2 = createInitials("Marilyn", "Monroe");
        System.out.println(result2);

        String result3 = createInitials("Lewis", "Hamilton");
        System.out.println(result3);

    }

        public static String createInitials(String firstName, String lastName) {
                char firstInitial = firstName.charAt(0);
                char lastInitial = lastName.charAt(0);

                return "" +  firstInitial + lastInitial;
        }

}
