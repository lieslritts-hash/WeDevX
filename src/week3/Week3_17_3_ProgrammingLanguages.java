package week3;

import java.util.Scanner;

/*
3.17.3 Programming languages*
easy
|
30 min
|
Share
Write a Java program that asks the user to input the name of a programming
language (e.g. Java, Python, C++, etc.). The program should then use a switch
statement to determine whether the language is a compiled language or an interpreted
language. If the language is a compiled language, the program should print a message
indicating that it is compiled. If the language is an interpreted language, the program
should print a message indicating that it is interpreted. The following programming languages
are interpreted: Python, Ruby, Perl, JavaScript. The following programming languages are compiled:
Java, C++, C#, Objective-C, Swift. If the user inputs a language that is not recognized by the program,
the program should print an error message and prompt the user to input a valid programming language.
Your program should use appropriate variable names, and include comments to explain the logic behind
the switch statement. Test your program with various inputs to ensure it works correctly. Sample Output 1: Java

plain
Copy code
Enter a programming language:
Java is a compiled language
Sample Output 2: Python

plain
Copy code
Enter a programming language:
Python is an interpreted language
Sample Output 3: Snake

plain
Copy code
Enter a programming language:
Error: Invalid programming language. Please enter a valid programming language

 */

public class Week3_17_3_ProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a programming language");
        String language = sc.nextLine();

        switch (language) {
            case "Python":
                System.out.println("Python is an interpreted language");
                break;

            case "Ruby":
                System.out.println("Ruby is an interpreted language");
                break;

            case "Perl":
                System.out.println("Perl is an interpreted language");
                break;

            case "JavaScript":
                System.out.println("JavaScript is an interpreted language");
                break;

            case "Java":
                System.out.println("Java is a compiled language");
                break;

                case "C++":
                System.out.println("C++ is a compiled language");
                break;

            case "C#":
                System.out.println("C# is a compiled language");
                break;

            case "Objective-C":
                System.out.println("Objective-C is a compiled language");
                break;

            case "Swift":
                System.out.println("Swift is a compiled language");
                break;

            default :
                System.out.println("Error: Invalid programming language. Please enter a valid programming language");
        }

    }

    public static class Class3_18 {
        public static void main(String[] args) {
            //allow users to attach
            //txt files such as: .txt, .docx, .doc
            //print out sending a text file
            //image files such as: .jpg, .png, .gif
            //attaching an image file
            //audio files such as: .mp3, .wma, .ogg
            //attaching an audio file

            String textFormat = ".txt";

            switch (textFormat) {
                case ".txt":
                case ".doc":
                case ".docx":
                    System.out.println("Sending a text file");
                    break;
                case ".jpg":
                case ".png":
                case ".gif":
                        System.out.println("Sending an image file");
                        break;
                case ".mp3":
                case ".wma":
                    case ".ogg":
                        System.out.println("Sending an audio file");
                        break;
                default:
                    System.out.println(textFormat + " is an unsupported file type");


            }

        }
    }

    public static class Class3_18_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter day of the week:");
            String dayOfWeek = sc.nextLine();

            // Logic: to check the day of the week and determine whether it is a weekday or weekend.
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.println(dayOfWeek + " is a weekday.");
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.println(dayOfWeek + " is a weekend day.");
                    break;
                default:
                    System.out.println("Invalid day of the week.");
            }
        }
    }

    public static class Class3_18_2 {
        public static void main(String[] args) {

            System.out.println("Enter a Linux Command:");
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();

            // determine if the type of command is a navigation, file management, or system management command
            switch (command) {
                case "cd":
                case "pwd":
                    System.out.println(command + " is a navigation command");
                    break;
                case "ls":
                case "cp":
                case "mv":
                case "mkdir":
                    System.out.println(command + " is a file management command");
                    break;
                case "shutdown":
                case "restart":
                    System.out.println(command + " is a system management command");
                    break;
                default:
                    System.out.println("Invalid command. Please enter a valid  command");
            }
        }
    }

    public static class Class3_20 {
        public static void main(String[] args) {
            //write a program that calculates tax
            //based on country and the state
            //USA -> California, Washington, Arizona => 20%
            //USA -> Illinois, New York => 15%
            //USA -> Florida, Texas => 10%

            //Canada -> Ontario, Quebec => 10%
            //Canada -> Alberta => 12%

            String country = "Canada";
            String state = "Quebec";


            switch (country) {
                case "USA":
                    switch (state) {
                        case "California":
                        case "Washington":
                        case "Arizona":
                            System.out.println("Tax is 20%");
                            break;
                        case "Illinois":
                        case "New York":
                            System.out.println("Tax is 15%");
                            break;
                        case "Florida":
                        case "Texas":
                            System.out.println("Tax is 10%");
                        default:
                            System.out.println("Unsupported State");
                    }
                    break;
                case "Canada":
                    switch (state) {
                        case "Ontario":
                        case "Quebec":
                            System.out.println("Tax is 10%");
                            break;
                        case "Alberta":
                            System.out.println("Tax is 12%");
                            break;
                        default:
                            System.out.println("Unsupported Province");
                    }
                    break;
                default:
                    System.out.println("Unsupported Country");

            }
        }
    }

    public static class Class3_20_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a day of the week");
            String dayOfWeek = sc.nextLine();

            System.out.println("Enter the time of day");
            String timeOfDay = sc.nextLine();

            // Check the day of the week
            switch (dayOfWeek) {

                // Weekdays
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    switch (timeOfDay) {
                        case "morning":
                        case "afternoon":
                        case "evening":
                            System.out.println("Good " + timeOfDay + "! It's " + dayOfWeek + "!");
                            break;
                        default:
                            System.out.println("Invalid time of day");
                    }
                    break;

                // Weekend
                case "Saturday":
                case "Sunday":
                    switch (timeOfDay) {
                        case "morning":
                        case "afternoon":
                        case "evening":
                            System.out.println("Good " + timeOfDay + "! It's the weekend!");
                            break;
                        default:
                            System.out.println("Invalid time of day");
                    }
                    break;

                // Invalid day
                default:
                    System.out.println("Invalid day of week");
            }
        }
    }

    public static class Class3_20_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a computer component (CPU, GPU, RAM, storage):");
            String component = sc.nextLine();

            System.out.println("Enter a computer type (desktop, laptop):");
            String computerType = sc.nextLine();

            // Outer switch checks the computer component
            switch (component) {

                case "CPU":
                    // Inner switch checks the computer type
                    switch (computerType) {
                        case "desktop":
                            System.out.println("The AMD Ryzen 9 5950X is a popular CPU choice for high-performance desktops");
                            break;
                        case "laptop":
                            System.out.println("The Intel Core i7 is a popular CPU choice for high-performance laptops");
                            break;
                        default:
                            System.out.println("Invalid computer type");
                    }
                    break;

                case "GPU":
                    switch (computerType) {
                        case "desktop":
                            System.out.println("The NVIDIA GeForce RTX 3090 is a popular GPU choice for high-performance desktops");
                            break;
                        case "laptop":
                            System.out.println("The NVIDIA GeForce RTX 3080 is a popular GPU choice for high-performance laptops");
                            break;
                        default:
                            System.out.println("Invalid computer type");
                    }
                    break;

                case "RAM":
                    switch (computerType) {
                        case "desktop":
                            System.out.println("The G.SKILL Trident Z RGB is a popular RAM choice for high-performance desktops");
                            break;
                        case "laptop":
                            System.out.println("The Corsair Vengeance SODIMM is a popular RAM choice for high-performance laptops");
                            break;
                        default:
                            System.out.println("Invalid computer type");
                    }
                    break;

                case "storage":
                    switch (computerType) {
                        case "desktop":
                            System.out.println("The Samsung 970 EVO Plus is a popular storage choice for high-performance desktops");
                            break;
                        case "laptop":
                            System.out.println("The Western Digital Black SN750 is a popular storage choice for high-performance laptops");
                            break;
                        default:
                            System.out.println("Invalid computer type");
                    }
                    break;

                default:
                    System.out.println("Invalid computer component");
            }
        }
    }

    public static class Class3_20_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Develop a program for a virtual chef that
            //helps users select ingredients for a recipe.
            //The program should take an input from user: Italian, Mexican, or Indian.
            //Afterward, the program should take another input
            //whether they prefer a Vegetarian or Non-vegetarian dish
            String cuisine = sc.nextLine();
            String diet = sc.nextLine();

            switch (cuisine) {
                case "Italian":
                    switch (diet) {
                        case "Vegetarian":
                            System.out.println("Tomatoes, Basil, Mozzarella, Olive Oil, Pasta");
                            break;
                        case "Non-vegetarian":
                            System.out.println("Beef, Tomatoes, Garlic, Parmesan, Pasta");
                    }
                    break;
                case "Mexican":
                    switch (diet) {
                        case "Vegetarian":
                            System.out.println("Beans, Tomatoes, Avocado, Corn, Tortillas");
                            break;
                        case "Non-vegetarian":
                            System.out.println("Chicken, Beef, Beans, Salsa, Tortillas");
                    }
                    break;
                case "Indian":
                    switch (diet) {
                        case "Vegetarian":
                            System.out.println("Lentils, Rice, Spinach, Spices, Naan");
                            break;
                        case "Non-vegetarian":
                            System.out.println("Chicken, Lamb, Rice, Curry, Naan");
                    }
                    break;
            }
        }
    }

    public static class Class3_20_4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Create a program that advises users on the most suitable fuel or engine type
            // for their vehicles based on their vehicle type and driving habits.
            // The program should use nested switch statements to provide recommendations.

            System.out.println("Welcome to the Vehicle Fuel Type Advisor!");
            System.out.println("Enter your vehicle type (Sedan, SUV, Truck, Motorcycle):");
            String vehicleType = sc.nextLine();

            System.out.println("Enter your typical driving habits (City, Highway, Mixed):");
            String drivingHabit = sc.nextLine();

            switch (vehicleType) {

                case "Sedan":
                    switch (drivingHabit) {
                        case "City":
                            System.out.println("Recommended Fuel Type: Electric");
                            break;
                        case "Highway":
                            System.out.println("Recommended Fuel Type: Diesel");
                            break;
                        case "Mixed":
                            System.out.println("Recommended Fuel Type: Petrol");
                            break;
                    }
                    break;

                case "SUV":
                    switch (drivingHabit) {
                        case "City":
                            System.out.println("Recommended Fuel Type: Petrol");
                            break;
                        case "Highway":
                            System.out.println("Recommended Fuel Type: Diesel");
                            break;
                        case "Mixed":
                            System.out.println("Recommended Fuel Type: Hybrid");
                            break;
                    }
                    break;

                case "Truck":
                    switch (drivingHabit) {
                        case "City":
                        case "Highway":
                        case "Mixed":
                            System.out.println("Recommended Fuel Type: Diesel");
                            break;
                    }
                    break;

                case "Motorcycle":
                    switch (drivingHabit) {
                        case "City":
                        case "Highway":
                        case "Mixed":
                            System.out.println("Recommended Fuel Type: Petrol");
                            break;
                    }
                    break;
            }
        }
    }

    public static class Class3_22 {
        public static void main(String[] args) {
            Class3_22 var = new Class3_22();
            var.say();
        }


        public void say() {
            System.out.println("Hello");

        }
    }

    public static class Class3_22_1 {
        public static void main(String[] args) {
            Class3_22_1 obj = new Class3_22_1();
            obj.startEngine();
        }

        private void startEngine() {
            System.out.println("Starting the Ferrari 458 Speciale engine!");
        }
    }
}
