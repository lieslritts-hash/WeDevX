package week5;

/*
5.23 Wrapper Class Parse Method Exercise
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna practice Wrapper class parse() method.

2. Revenue calculation using parse() method
Let's say we are working in Tax government section. And we have a file where all values in a String, we need to convert numbers to corresponding primitive data types and make a calculation. Example 1

java
Copy code
public static void main(String[] args) {

    // we need to retrieve number values from String file

    String values = "Acme.inc..,123456.78, 7890.12, 3456.78\n"+
            "Clobex corporation, 98765.32, 5432.10, 2109.87\n"+
            "Initeck Industries, 8976.32, 9087.34, 3456.44";

    // calculate revenue of 3 companies
    // revenue is the value between first and second commas

    int indexOfFirstComma = values.indexOf(",");
    int indexOfSecondComma = values.indexOf(",", indexOfFirstComma+1);
    System.out.println(indexOfFirstComma);
    System.out.println(indexOfSecondComma);

    String revenue1 = values.substring(indexOfFirstComma+1, indexOfSecondComma);
    System.out.println(revenue1);

    double firstCompanueRevenue = Double.parseDouble(revenue1);
    System.out.println(firstCompanueRevenue);

    // second company revenue
    int indexOfNewLine = values.indexOf("\n");
    int secondCompFirstComma = values.indexOf(",",indexOfNewLine);
    int secondCompSecondComma = values.indexOf(",", secondCompFirstComma+1);

    String revenue2 = values.substring(secondCompFirstComma+1, secondCompSecondComma);
    double secondCompanyRevenue = Double.parseDouble(revenue2);
    System.out.println(secondCompanyRevenue);

   // third company revenue
    int indexOfNewLine2 = values.indexOf("\n", indexOfNewLine+1);
    int thirdCompFirstComma = values.indexOf(",",indexOfNewLine2);
    int thirdCompSecondComma = values.indexOf(",", thirdCompFirstComma+1);

    String revenue3 = values.substring(thirdCompFirstComma+1, thirdCompSecondComma);
    double thirdCompanyRevenue = Double.parseDouble(revenue3);
    System.out.println(thirdCompanyRevenue);

    //Total revenue of 3 companies
    double totalRevenue = firstCompanueRevenue +secondCompanyRevenue+thirdCompanyRevenue;
    System.out.println("Total revenue is "+totalRevenue);

}
plain
Copy code
Output is:
10
20
123456.78
123456.78
98765.32
8976.32
Total revenue is 231198.42
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week5_23_WrapperClassParseMethodExercise {
    public static void main(String[] args) {

    }
}
