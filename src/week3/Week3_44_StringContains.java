package week3;

/*
3.44 String contains()
Java String Contains method checks whether a
String contains a specific substring or not and
returns a boolean value.
 */
//write your static method here. No need to add Main class or main method.

public class Week3_44_StringContains {
    public static void main(String[] args) {

        String str = "Hello wedevxer!";

        //boolean contains(String str) -> it returns true if the
        //original string contains the given substring
        //Hello -> lo -> true

        //"Go to Mars" -> Mars -> true
        //"I want to go into politics" -> "politics" -> returns true -> we ban this post

        boolean doesContainDevX = str.contains("devx"); //true
        System.out.println("does contain DevX? " + doesContainDevX);

         boolean doesContainHello = str.contains("Hello");
         System.out.println(doesContainHello);

         boolean doesContainAmazon = str.contains("Amazon");
         System.out.println(doesContainAmazon);

         boolean doesContainQuestionMark = str.contains("devxer?");
         System.out.println(doesContainQuestionMark);



    }

}
