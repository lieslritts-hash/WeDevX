package week4;

/*
4.35 Avoid Using Strings Like This
4.35 Avoid Using Strings Like This
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna practice String Builder class.

2. String Builder example
Let's look at an example to understand a difference between String and String Builder classes.

An
23
t787878y7
Kan
75
736736736
Kai
67
6748787
Copy code
Enter your age
In this example, we have created 7 String objects using String class.
String class is using a lot of memory. Using String concatenation method
is not good practice inside a loop. Because of this, IntellijId is suggesting
to use String Builder class here. Let's see String Builder usage in next class.
java
Copy code
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // we need to get user's info: name, age, phone number

    StringBuilder db= new StringBuilder();
    for(int i=0; i<3; i++){
    System.out.println("Enter your name");
    String name=sc.nextLine();

        System.out.println("Enter your age");
        String age=sc.nextLine();

        System.out.println("Enter your phone number");
        String phone=sc.nextLine();

        db.append(name).append(", ").append(age).append(", ").append(phone).
        append("\n");
    }
    System.out.println(db);
}
3. Conclusion
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */

//7 string objects created...10 users would be 70 objects...billion users would be 7 billion objects
//uses too much memory
//better code with StringBuilder

import java.util.Scanner;

public class Week4_35_AvoidUsingStringsLikeThis {
            public static void main(String[] args) {

                //task: create a database of user info
                //name, age, phone number

                Scanner sc = new Scanner(System.in);

                String db = "";

                for (int i = 0; i < 3; i++) {

                System.out.println("Enter your name: ");
                String userName = sc.nextLine();

                System.out.println("Enter your age: ");
                String age = sc.nextLine();

                System.out.println("Enter your number: ");
                String phoneNumber = sc.nextLine();

                db += userName + ", " + age + ", " + phoneNumber + "\n";
                }

                System.out.println(db);

            }
}