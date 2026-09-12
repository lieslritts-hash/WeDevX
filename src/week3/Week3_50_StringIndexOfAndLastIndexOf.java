package week3;

/*
3.50 String indexOf() and lastIndexOf()
 */
//write your static method here. No need to add Main class or main method.

//int indexOf(String s): Returns the index within the string of the first occurrence of the specified string.
//String s = "Learn Share Learn";
//int output = s.indexOf("Share");//returns 6

//indexOf(String str) -> returns an int
//it does two things -> first it checks whether the String contains the given Strings
//if it does, it returns the index of the first characters of a given String
//if the string doesn't contain the given indexOf method returns -1

//int indexOf(String s, int i): Returns the index within the string of the first occurrence
//of the specified string, starting at the specified index.
//String s = "Learn Share Learn";
//int output = s.indexOf("ea, 3);
//returns 13
//int indexOf(String str, int index)
//it checks if the original String contains the given String
//if it does it starts looking for that string starting form the given index
//and returns the index of first occurrence of that String after the given index

//int lastIndexOf(String s): Returns the index within the string of the last occurrence of the specified string
//String s = "Learn Share Learn";
//int output = s.lastIndexOf("a"); //returns 14
//int lastIndexOf(String str)
//1. checks of the original String contains the given String
//2. if it does then find the last occurrence of the given String and returns the
//indexof the first char


public class Week3_50_StringIndexOfAndLastIndexOf {
    public static void main(String[] args) {

        String str = "Hello Superstar of wedevx";
        int indexOfS = str.indexOf("Superstar"); //6
        System.out.println(indexOfS);

        int indexOfOf = str.indexOf("of");
        System.out.println(indexOfOf);

        int indexOfMars = str.indexOf("mars"); //-1
        System.out.println(indexOfMars);

        String str5 = "Mars, SpaceX, DevX, Developer, Mars";
        int i5 = str5.indexOf("Mars", 6);
        System.out.println(i5); //31

        int i6 = str5.indexOf("Dev", 16);
        System.out.println(i6);//20

        String str6 = "Play, Work, Read, Sleep, Eat, Party, Study, Repeat";
        int i7 = str6.lastIndexOf("y");
        System.out.println(i7);

        int i8 = str6.lastIndexOf("at");
         System.out.println(i8);
    }
}
