package week3;

/*
3.49 String startsWith() and endsWith()
 */
//write your static method here. No need to add Main class or main method.


public class Week3_49_StringStartsWithAnEndsWith {
    public static void main(String[] args) {

        //boolean stratWith(String str) -> if the String start with the given String(param) then
        //it returns true
        //otherwise returns false

        String str = "Hello WeDevX";
        boolean doesStrStartWithHello = str.startsWith("Hello");//true
        System.out.println(doesStrStartWithHello);

        String str4 = "sent to Elon Musk: Hi Elon, I am a big fan of yours!";
        boolean b = str4.startsWith("sent to Elon Musk");
        System.out.println(b);

        //boolean endsWith(String str) => returns true if the String ends with the given String
        //otherwise it returns false

        String str5 = "Apple is the Biggest Company";
        boolean b5 = str5.endsWith("Company");//true
        System.out.println(b5);

        boolean b6 =  str5.endsWith("Apple");//false
        System.out.println(b6);

    }

}
