package week3;

/*
3.47 String equals() and equalsIgnoreCase()
 */
//write your static method here. No need to add Main class or main method.

//boolean.equals(Object other obj): Compares this string to the specified object.
//Boolean out = "Geeks".equals("Geeks");
//returns true
//Boolean out = "Geeks".equals("geeks");
//returns false

//boolean equalsIgnoreCase (String anotherString): Compares string to another string.
//ignoring case considerations.
//Boolean out = "Geeks".equalsIgnore("Geeks");
//returns true
//Boolean out = "Geeks".equalsIgnoreCase('geeks");
//returns true

public class Week3_47_StringEqualsAndEqualsIgnoreCase {
    public static void main(String[] args) {

        String str = "hello";
        boolean isEquals = str.equals("hi"); //is hello equal to hi? //false
        System.out.println(isEquals);

        String str2 = "devx";
        boolean isEquals2 = str2.equals("devx");
        System.out.println(isEquals2);

        boolean isEquals3 = str2.equals("Devx"); //false -> eqauls() method is a case sensitive method
        System.out.println(isEquals3);

        String str4 = "Mars";
        boolean isEquals4 = str4.equalsIgnoreCase("mars"); //true
        System.out.println(isEquals4);

        boolean isEquals5 = str4.equalsIgnoreCase("MarS");
        System.out.println(isEquals5);

        boolean isEquals6 = str4.equalsIgnoreCase("Jupiter");
        System.out.println(isEquals6);

    }

}
