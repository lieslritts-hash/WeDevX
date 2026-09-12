package week3;
/*
3.49.1 Check If Phone Number is a Chicago Number*
easy
|
30 min
|
Share
Your task is to write a static method called isChicagoPhoneNum() that takes in a String parameter representing a phone number, and checks if the phone number is a Chicago number. A Chicago number starts with the area code "312" or "773".

Return Type: boolean

Example #1:
Parameter:

plain
Copy code
String phoneNumber = "312-555-1234"
Return:

plain
Copy code
true
Example #2:
Parameter:

plain
Copy code
String phoneNumber = "773-555-5678"
Return:

plain
Copy code
true
Example #3:
Parameter:

plain
Copy code
String phoneNumber = "630-555-9090"
Return:

plain
Copy code
false
 */
//write your static method here. No need to add Main class or main method.

public class Week3_49_1_CheckIfPhoneNumberIsAChicagoNumber {
    public static void main(String[] args) {

        System.out.println(isChicagoPhoneNum("312-555-1234"));
        System.out.println(isChicagoPhoneNum("773-555-5678"));
        System.out.println(isChicagoPhoneNum("630-555-9090"));

    }

    public static boolean isChicagoPhoneNum(String phoneNumber) {

        if (phoneNumber.startsWith("312") || phoneNumber.startsWith("773")) {
            return true;
        } else {
            return false;
        }
    }

}
