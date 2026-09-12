package week1;

/*
1.20.3 Job Offer From Apple
easy
|
30 min
|
Share
Help Apple write a program that creates job offer letters. Declare a variable for candidateName = "WeDevX Graduate", salary=180000.0, stockOptions=2340, annualBonus=15000.

plain
Copy code
____ candidateName = "WeDevX Graduate";
____ salary=180000.0;
_____ stockOptions=2340;
_____ annualBonus=15000;

____ offerLetter = _____;
Declare a data type for offerLetter and the value should be

plain
Copy code
Dear WeDevX Graduate,
Apple is delighted to offer you the position of Software
Quality Engineer.
You will receive an annual salary of $180000.0
2340 stock options and annual bonus of 15000
The entire offer letter text should be concatenated and
assigned to offerLetter variable. Print out the value of
offerLetter.


 */

public class Week1_20_3_Job_Offer_From_Apple {
    public static void main(String[] args) {
        String candidateName = "WeDevX Graduate";
        String salary = "180000.0";
        String stockOptions = "2340";
        String annualBonus = "15000";

        String offerLetter = "Dear " + candidateName + ",\nApple is delighted to offer you the position of Software Quality Engineer.\nYou will receive an annual salary of $" + salary + "\n" + stockOptions + " stock options and annual bonus of " + annualBonus;
        System.out.println(offerLetter);
    }
}
