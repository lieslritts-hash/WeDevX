package week2;

import java.util.Scanner;

/*
2.14.1 Room Upgrade*
easy
|
30 min
|
Share
Write a program that takes in two booleans, hasBalconyView and
hasKingBed, and determines if a room is eligible for a premium
upgrade. The criteria are: The room must have a balcony view OR
a king-sized bed Expected Output:

plain
Copy code
Does your room have a balcony view?
Does your room have a king sized bed?
You are eligible for a premium upgrade: X
Where X is a boolean value. It returns true if the room has a
balcony view OR a king-sized bed


 */
public class Week2_14_1_RoomUpgrade {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        boolean hasBalconyView = input.nextBoolean();
        System.out.println("Does your room have a balcony view? ");

        boolean hasKingBed = input.nextBoolean();
        System.out.println("Does your room have a king sized bed? ");

        System.out.println("You are eligible for a premium upgrade: " + (hasBalconyView || hasKingBed));
    }
}
