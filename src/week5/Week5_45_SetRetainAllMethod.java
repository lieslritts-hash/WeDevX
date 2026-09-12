package week5;

/*
5.45 Set retainAll Method
1. Overview
Hello superstars! Welcome back to another session! In this session,
we gonna learn about Set methods. Today we will cover set.retainAll() method.

2. Set retainAll() method
The retainAll() method is used to retain from this set all of its elements that are
contained in the specified collection. Syntax:

plain
Copy code
public boolean retainAll(Collection c)
Parameters: This method takes collection c as a parameter containing elements to be retained
from this set. Return Value: This method returns true if this set changed as a result of the call.
Example 1

java
Copy code
public static void main(String[] args) {

    Set<String> invitedSpeakers = new HashSet<>();
    invitedSpeakers.add("Elon");
    invitedSpeakers.add("Jeff");
    invitedSpeakers.add("Mike");

    Set<String> registeredSpeakers = new HashSet<>();
    registeredSpeakers.add("Elon");
    registeredSpeakers.add("Mike");
    registeredSpeakers.add("Maria");

    if(invitedSpeakers.containsAll(registeredSpeakers)){
        System.out.println("Ready to send all registered speakers onboarding docs");

    }else{
        registeredSpeakers.retainAll(invitedSpeakers);
    }

    System.out.println(registeredSpeakers);

}
plain
Copy code
Output is:
[Mike, Elon]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_45_SetRetainAllMethod {
    public static void main(String[] args) {

    }
}
