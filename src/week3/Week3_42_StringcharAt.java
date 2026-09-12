package week3;

/*
3.42 String charAt()
The charAt() method in Java returns the character
at a specified index in a string.
 */
//write your static method here. No need to add Main class or main method.

//index is a position of a character
//first position starts from 0
//i in the parameter means index
//"DevXSchool".charAt(3);//returns 'X'
public class Week3_42_StringcharAt {
    public static void main(String[] args) {
        String str = "wedevx.co";
        //charAt() returns a character
        char firstIndex = str.charAt(0);
        System.out.println(firstIndex);

        char secondIndex = str.charAt(1);
        System.out.println(secondIndex);

        char thirdIndex = str.charAt(2);
        System.out.println(thirdIndex);

        char fourthIndex = str.charAt(3);
        System.out.println(fourthIndex);

        char fifthIndex = str.charAt(4);
        System.out.println(fifthIndex);

        char sixthIndex = str.charAt(5);
        System.out.println(sixthIndex);

        char seventhIndex = str.charAt(6);
        System.out.println(seventhIndex);

        char eighthIndex = str.charAt(7);
        System.out.println(eighthIndex);

        char ninthIndex = str.charAt(8);
        System.out.println(ninthIndex);

        //StringIndexOutOfBoundsExfeption --
        //you get this error when inputting a wrong index
        //str.charAt(-1000);

    }
}
