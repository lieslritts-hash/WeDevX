package week5;

/*
5.44 Set containsAll Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about Set methods. Today we will cover set.containsAll() method.

2. Set containsAll() method
The containsAll() method of Java Set is used to check whether two sets contain the same elements or not. It takes one set as a parameter and returns True if all of the elements of this set is present in the other set. Syntax:

plain
Copy code
public boolean containsAll(Collection C)
Parameters: The parameter C is a Collection Return Value: The method returns
True if this set contains all the elements of other set otherwise it returns
False. Example 1

java
Copy code
public static void main(String[] args) {

    Set<Integer> num1 = new HashSet<>(Arrays.asList(7,8,9,12,13,4));
    Set<Integer> num2 = new HashSet<>(Arrays.asList(7,0,1,12,4));

    boolean result = num1.containsAll(num2);
    System.out.println(result);

        Set<Integer> num3 = new HashSet<>(Arrays.asList(7,8,9,2,4));
        Set<Integer> num4 = new HashSet<>(Arrays.asList(7,4));

        boolean result1 = num3.containsAll(num4);
        System.out.println(result1);

       // 3 invited speakers for the conference
        Set<String> invitedSpeakers = new HashSet<>();
        invitedSpeakers.add("Elon");
        invitedSpeakers.add("Jeff");
        invitedSpeakers.add("Mike");

        Set<String> registeredSpeakers = new HashSet<>();
        registeredSpeakers.add("Elon");
        registeredSpeakers.add("Mike");
        registeredSpeakers.add("Maria");

        if(invitedSpeakers.containsAll(registeredSpeakers)){
            System.out.println("Ready to send all registered
            speakers onboarding docs");

        }else{
            System.out.println("Someone is trying to sneak in....
            double check all registered speakers and remove the one who is not invited");
        }

    }
plain
Copy code
Output is:
false
true
Someone is trying to sneak in.... double check all registered speakers and remove the one who is not invited
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_44_SetContainsAllMethod {
    public static void main(String[] args) {

    }
}
