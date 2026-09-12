package week4;

/*
4.35.1 Logging Data*
easy
|
30 min
|
Share
There's no need for any editing; run a Java program utilizing the logData() method, simulating data logging without displaying it. After running the program, check the Output, where the time taken for String concatenation and string building using StringBuilder is compared. The time spent might seem minuscule, but imagine thousands of operations occurring per second within your company. Try to run the program multiple times; each time, the result is likely to vary.

Default code
java
Copy code
public class Main {
    public static void main(String[] args) {
        // Logs various strings using the logData method with different scenarios
        String[] data1 = {"Entry 1", "Entry 2", "Entry 3"};
        String[] data2 = {"This is a very long string with many characters to test the performance", "Repeat", "Repeat", "Repeat", "Repeat"};
        String[] data3 = {"Random String 1", "Another random string", "Randomness at its peak", "Something completely random"};
        String[] data4 = {"$pecial!", "Character$ & Symbols", "Unicod€: Ƭɧɩֆ ɩֆ αʍαȶթ"};
        String[] data5 = new String[1000];
        logData(data1);
        logData(data2);
        logData(data3);
        logData(data4);
        logData(data5);
    }

    public static void logData(String[] logEntries) {
        System.err.println("==================");
        // Logging using String concatenation
        long startTimeString = System.nanoTime();
        String logString = "";
        for (String entry : logEntries) {
            logString += entry + " ";
        }
        long endTimeString = System.nanoTime();

        // Logging using StringBuilder
        long startTimeStringBuilder = System.nanoTime();
        StringBuilder logBuilder = new StringBuilder();
        for (String entry : logEntries) {
            logBuilder.append(entry).append(" ");
        }
        long endTimeStringBuilder = System.nanoTime();
        System.out.println("==================");
        System.out.printf("Logging data: %s\n", logBuilder.toString());

        float elapsedTimeString = endTimeString - startTimeString;
        float elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        // Displaying the time taken for String concatenation and StringBuilder operations
        System.err.printf("String Concatenation Time: %.0f nanoseconds\n", elapsedTimeString);
        System.err.printf("StringBuilder Time: %.0f nanoseconds\n", elapsedTimeStringBuilder);
        System.err.printf("StringBuilder is %.3f times faster than String concatenation in this operation\n", elapsedTimeString / elapsedTimeStringBuilder);
    }
}
 */

public class Week4_35_1_LoggingData {
    // no need to edit code
        public static void main(String[] args) {
            // Logs various strings using the logData method with different scenarios
            String[] data1 = {"Entry 1", "Entry 2", "Entry 3"};
            String[] data2 = {"This is a very long string with many characters to test the performance", "Repeat", "Repeat", "Repeat", "Repeat"};
            String[] data3 = {"Random String 1", "Another random string", "Randomness at its peak", "Something completely random"};
            String[] data4 = {"$pecial!", "Character$ & Symbols", "Unicod€: Ƭɧɩֆ ɩֆ αʍαȶթ"};
            String[] data5 = new String[1000];
            logData(data1);
            logData(data2);
            logData(data3);
            logData(data4);
            logData(data5);
        }

        public static void logData(String[] logEntries) {
            System.err.println("==================");
            // Logging using String concatenation
            long startTimeString = System.nanoTime();
            String logString = "";
            for (String entry : logEntries) {
                logString += entry + " ";
            }
            long endTimeString = System.nanoTime();

            // Logging using StringBuilder
            long startTimeStringBuilder = System.nanoTime();
            StringBuilder logBuilder = new StringBuilder();
            for (String entry : logEntries) {
                logBuilder.append(entry).append(" ");
            }
            long endTimeStringBuilder = System.nanoTime();
            System.out.println("==================");
            System.out.printf("Logging data: %s\n", logBuilder.toString());

            float elapsedTimeString = endTimeString - startTimeString;
            float elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

            // Displaying the time taken for String concatenation and StringBuilder operations
            System.err.printf("String Concatenation Time: %.0f nanoseconds\n", elapsedTimeString);
            System.err.printf("StringBuilder Time: %.0f nanoseconds\n", elapsedTimeStringBuilder);
            System.err.printf("StringBuilder is %.3f times faster than String concatenation in this operation\n", elapsedTimeString / elapsedTimeStringBuilder);
        }
}
