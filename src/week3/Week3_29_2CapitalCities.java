package week3;

/*
3.29.2 Capital Cities*
easy
|
30 min
|
Share
Write a Java class called Main that contains a static method named getCapitalCities() that takes no parameters and returns a String with the comma-separated list of the capital cities of different countries.

To implement this method, store the capital cities in separate String variables and concatenate the capital city names into a single string with commas between them. Use these three cities for this exercise: Canberra (Australia) Kathmandu (Nepal) Dakar (Senegal)

In the main() method of your program, call the getCapitalCities() method to retrieve the list of capital cities. Then, print the result to the console.

Expected Result:

plain
Copy code
Canberra, Kathmandu, Dakar
The example of solution
java
Copy code
public class Main {
  public static void main(String args[]) {
    System.out.println(getCapitalCities());
  }

  //create your static method here
  static String getCapitalCities() {
    String australia = "Canberra";
    String nepal = "Kathmandu";
    String senegal = "Dakar";
    return australia + ", " + nepal + ", " + senegal;
  }
}
 */

public class Week3_29_2CapitalCities {
    public static void main(String[] args) {
        System.out.println(getCapitalCities());
    }
    public static String getCapitalCities() {
        String australia = "Canberra";
        String nepal = "Kathmandu";
        String senegal = "Dakar";
        return australia + ", " + nepal + ", " + senegal;
    }

}
