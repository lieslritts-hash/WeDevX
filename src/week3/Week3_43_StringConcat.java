package week3;

/*
3.43 String concat()
The String concat() method in Java is used to
concatenate two strings and return the resulting
concatenated string.
 */
//write your static method here. No need to add Main class or main method.

//String concat (String str); concatenates specified string to the end of this string.
//String s1 = "DevX';
//String s2 = "School";
//String output = s1.concat(s2);//returns "DevXSchool"


public class Week3_43_StringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Superstars";

        //concat retruns a String
        String finalString = str1.concat(" ").concat(str2);
        System.out.println(finalString);

        String finalStr2 = str2.concat(str1);
        System.out.println(finalStr2);

        //String is an immutable class/object
        //it means that the original value of a String can not be modified
        //via methods


        //reassigning a value of a String variable
        String str4 = "Mars";
        str4 = str4.concat(" is future");
        System.out.println(str4);

        //In Strings we are allowed to chain the methids
        //call another String method at the end of another String method
        String str5 = "Space X";
        String finalStr5 = str5.concat(":: ").concat(" is going to take us to Mars");
        System.out.println(finalStr5);

    }


}
