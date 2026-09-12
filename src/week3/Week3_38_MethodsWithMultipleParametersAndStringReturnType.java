package week3;

/*
3.38 Methods With Multiple Parameters and String Return Type
Learn to create flexible and powerful functions that take multiple
parameters and return string values with this comprehensive course on
Methods With Multiple Parameters and String Return Type
 */
//write your static method here. No need to add Main class or main method.

public class Week3_38_MethodsWithMultipleParametersAndStringReturnType {
    public static void main(String[] args) {
        String str = login("alex@gmail.com", "Hello123");
        System.out.println(str);

        String str2 = login("hello@wedevx.co", "ABC123$$");
        System.out.println(str2);

    }

    //write a method that takes a username and password
    //and returns welcome username if the username and the password match with
    //hello@wedevx.co
    //ABC123$$
    //If the username or the password doesn't match then we return "invalid username or password"

    public static String login(String username, String password) {
        if (username.equals("hello@wedevx.co") && password.equals("ABC123$$")) {
            return "welcome " + username;
        } else {
            return "invalid username or password.";
        }
    }

}

