package week1;

/*
1.17.4 The Most Expensive House
easy
|
30 min
|
Share
The most expensive house in the world, according to 99acres, is Buckingham Palace, London - Spread across 830,000 sq ft, the palace has 775 rooms, 92 offices, 188 staff bedrooms, 78 bathrooms, and 19 staterooms. It has its own in-house dispensary and jewelry room as well. The current worth of Buckingham Palace is estimated to be $4.9 billion. Write a program that populates all measurable info about Buckingham Palace, London, in the most suitable data types. Then prints them all out in the same order.

plain
Copy code
_____ totalAreaInSqFt       = 830000;
_____ numberOfRooms         = 775;
_____ numberOfOffices       = 92;
_____ numberOfStaffBedrooms = 188;
_____ numberOfBathrooms     = 78;
_____ numberOfStateRooms    = 19;
_____ hasInHouseDispensary  = true;
_____ hasJewelryRoom        = true;
_____ totalCostOfPalace     = 4900000000l;
 */

public class Week1_17_4_TheMostExpensiveHouse {
    public static void main(String[] args) {
        int totalAreaInSqFt = 830_000;
        short numberOfRooms = 775;
        byte numberOfOffices = 92;
        short numberOfStaffBedrooms = 188;
        byte numberOfBathrooms = 78;
        byte numberOfStateRooms = 19;
        boolean hasInHouseDispensary = true;
        boolean hasJewelryRoom = true;
        long totalCostOfPalace = 4_900_000_000L;

        System.out.println(totalAreaInSqFt);
        System.out.println(numberOfRooms);
        System.out.println(numberOfOffices);
        System.out.println(numberOfStaffBedrooms);
        System.out.println(numberOfBathrooms);
        System.out.println(numberOfStateRooms);
        System.out.println(hasInHouseDispensary);
        System.out.println(hasJewelryRoom);
        System.out.println(totalCostOfPalace);
    }
}

