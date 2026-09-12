package week3;

/*
Learn to create Java methods that return String values and
enhance the functionality of your programs with powerful text
manipulation capabilities.
 */

public class Week3_29_MethodsWithStringReturnType {
    public static void main(String[] args) {
        String var = giveMyName();
        System.out.println(var);

        String lastName = giveMyLastName();
        System.out.println(lastName);

        String elonFullName = printElonMusk();
        System.out.println(elonFullName);
     }

    //String
    public static String giveMyName() {
        return "Askar";
    }
    // return statement is not system.out.println() --> so it doesn't print anything

    public static String giveMyLastName() {
        return "Musakunov";

    }

    public static String printElonMusk() {
        String firstName = "Elon";
        String lastName = "Musk";

        //write return when your method logic is ready to generate the result
        return firstName + " " + lastName;
    }
}
