package week5;

/*
5.33.3 Guest Check-Out
easy
|
30 min
|
Share
Create a program that manages the guest list in a hotel
represented using an ArrayList. Implement a static method named
checkOutGuests() that takes two parameters: the guest list (ArrayList)
and a parameter guest name to check out (String). This method should remove
the specified guest from the guest list and return the updated guest list.
If the provided guest name is not found in the list, return the ArrayList
without changes (need to try remove the element from the list).

Return Type: ArrayList

Example #1:
Parameters:

plain
Copy code
LinkedHashSet<String> guests = {"Alice", "Bob", "Charlie"}
String checkedOutGuest = "Bob"
Calling command:

plain
Copy code
checkOutGuests(guests, checkedOutGuest);
Return:

plain
Copy code
{"Alice", "Charlie"}
Example #2:
Parameters:

plain
Copy code
LinkedHashSet<String> guests = {"Alice", "Bob", "Charlie"}
String checkedOutGuest = "David"
Calling command:

plain
Copy code
checkOutGuests(guests, checkedOutGuest);
Return:

plain
Copy code
{"Alice", "Bob", "Charlie"}
 */
//write your static method here. No need to add Main class or main method.

public class Week5_33_3_GuestCheckOut {
    public static void main(String[] args) {

    }
}
