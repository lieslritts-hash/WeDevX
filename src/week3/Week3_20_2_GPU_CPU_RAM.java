package week3;

import java.util.Scanner;

/*
3.20.2 GPU, CPU, RAM*
easy
|
30 min
|
Share
Write a Java program that takes a computer component
(CPU, GPU, RAM, storage) and a computer type (desktop, laptop)
as input from the user and then prints a corresponding message
based on the input. Example Output: If the input is "CPU" and
"laptop", the program should print "The Intel Core i7 is a popular
 CPU choice for high-performance laptops." Implementation: Use
 nested switch statements to implement this program. The outer
 switch statement should check the computer component, while the
 inner switch statement should check the computer type. The
 program should use multiple cases for each switch statement
 to handle different inputs. Valid Inputs:

Component: CPU, GPU, RAM, storage

Type: desktop, laptop

Available suggestions:

CPU (desktop): The AMD Ryzen 9 5950X is a popular CPU choice for high-performance desktops

CPU (laptop): The Intel Core i7 is a popular CPU choice for high-performance laptops

GPU (desktop): The NVIDIA GeForce RTX 3090 is a popular GPU choice for high-performance desktops

GPU (laptop): The NVIDIA GeForce RTX 3080 is a popular GPU choice for high-performance laptops

RAM (desktop): The G.SKILL Trident Z RGB is a popular RAM choice for high-performance desktops

RAM (laptop): The Corsair Vengeance SODIMM is a popular RAM choice for high-performance laptops

Storage (desktop): The Samsung 970 EVO Plus is a popular storage choice for high-performance desktops

Storage (laptop): The Western Digital Black SN750 is a popular storage choice for high-performance laptops

Positive 1: CPU desktop

plain
Copy code
Enter a computer component (CPU, GPU, RAM, storage):
Enter a computer type (desktop, laptop):
The AMD Ryzen 9 5950X is a popular CPU choice for high-performance desktops
Positive 2: GPU laptop

plain
Copy code
Enter a computer component (CPU, GPU, RAM, storage):
Enter a computer type (desktop, laptop):
The NVIDIA GeForce RTX 3080 is a popular GPU choice for high-performance laptops
Negative 1: memory laptop

plain
Copy code
Enter a computer component (CPU, GPU, RAM, storage):
Enter a computer type (desktop, laptop):
Invalid computer component
Negative 2: RAM tablet

plain
Copy code
Enter a computer component (CPU, GPU, RAM, storage):
Enter a computer type (desktop, laptop):
Invalid computer type
 */

public class Week3_20_2_GPU_CPU_RAM {
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
