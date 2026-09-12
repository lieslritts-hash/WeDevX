package week3;

/*
3.41 Methods With Switch Statement
 */
//write your static method here. No need to add Main class or main method.

public class Week3_41_MethodsWithSwitchStatement {
    public static void main(String[] args) {
      boolean var1 = doesNeedAVisa("USA");
      System.out.println(var1);

        boolean var2 = doesNeedAVisa("France");
        System.out.println(var2);

    }

    //write a method  that takes a String for a country of citizenship
    //and return false if the country is USA or Canada
    //otherwise return true
    //true -> means user needs a visa
    //false -> user doesn't need a visa

    public static boolean doesNeedAVisa(String countryOfResidence) {

        switch (countryOfResidence) {
            case "USA":
            case "Canada":
                return false;
            default:
                return true;
        }
    }


}
