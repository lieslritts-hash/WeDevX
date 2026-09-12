package week3;

import java.util.Scanner;
/*
3.18.2 Linux Commands*
easy
|
30 min
|
Share
Write a Java program that asks the user to input a
command (cd, ls, mkdir, rm, etc.). The program should
then use a switch statement to determine the type of the
command. In this program, commands for navigating the file
system (cd, pwd) should be classified as "navigation commands",
commands for managing files and directories (ls, cp, mv, mkdir.)
should be classified as "file management commands", and commands
for managing the system (shutdown, restart.) should be classified
as "system management commands". After determining the type of the
command, the program should print a message to the console indicating
which type it is. If the user inputs a command that is not recognized
by the program, the program should print an error message and prompt
the user to input a valid command. Your program should use appropriate
variable names, and include comments to explain the logic behind the
switch statement. Test your program with various inputs to ensure it
works correctly. Positive scenario 1: cd

plain
Copy code
Enter a Linux Command:
cd is a navigation command
Positive scenario 2: mkdir

plain
Copy code
Enter a Linux Command:
mkdir is a file management command
Positive scenario 3: shutdown

plain
Copy code
Enter a Linux Command:
shutdown is a system management command
Negative scenario: spinup

plain
Copy code
Enter a Linux Command:
Invalid command. Please enter a valid command
 */

public class Week3_18_2_LinuxCommands {
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
                System.out.println("Invalid command. Please enter a valid command");
        }
    }
}

