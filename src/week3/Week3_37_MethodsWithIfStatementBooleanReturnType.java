package week3;

/*
3.37 Methods With If Statement Boolean Return Type
Methods with if statements and boolean return type in
Java enable the creation of functions that evaluate
conditions and return a true/false value
 */
//write your static method here. No need to add Main class or main method.

public class Week3_37_MethodsWithIfStatementBooleanReturnType {
    static void main(String[] args) {

       boolean scenario1  = isEligibleForDiscount(20, true);
        System.out.println(scenario1);
    }

    //Create a method that takes spent amount and whether the client is a rewards member
    //return true if the client is a reward member or if the client spent more than $100, otherwise false
    public static boolean isEligibleForDiscount(double amountSpent, boolean isMembershipMember) {

        if (amountSpent > 100 || isMembershipMember) {
            return true;
        } else {
            return false;
        }
    }

}
