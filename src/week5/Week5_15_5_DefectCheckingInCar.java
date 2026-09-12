package week5;

/*
5.15.5 Defect Checking in Car
easy
|
30 min
|
Share
Create a static method named isDefectPresent() that accepts a boolean array as a parameter. The boolean array represents the result of checking for defects in an automobile. Each boolean value within the array indicates whether a specific defect was found during the inspection (true for found, false for not found). The method should examine the boolean array and return false if any defects were detected during the inspection (if any true values are present in the array). If no defects were found (all values are false), the method should return true.

Return Type: boolean

Example #1:
Parameters:

plain
Copy code
boolean[] defects = [false, false, false, true, false]
Return:

plain
Copy code
false
Example #2:
Parameters:

plain
Copy code
boolean[] defects = [false, false, false, false, false]
Return:

plain
Copy code
true
Example #3:
Parameters:

plain
Copy code
boolean[] defects = [true, true, true, true, true]
Return:

plain
Copy code
false
 */
//write your static method here. No need to add Main class or main method or import anything


public class Week5_15_5_DefectCheckingInCar {
    public static void main(String[] args) {

        boolean[] defects = {false, false, false, true, false};
        boolean result = isDefectPresent(defects);
        System.out.println(result);

        boolean[] defects2 = {false, false, false, false, false};
        boolean result2 = isDefectPresent(defects2);
        System.out.println(result2);

        boolean[] defects3 = {true, true, true, true, true};
        boolean result3 = isDefectPresent(defects3);
        System.out.println(result3);

    }

    public static boolean isDefectPresent(boolean[] defects) {

      for (boolean defect : defects) {
          if (defect) {
              return false;
          }
        }

      return true;
    }
}
