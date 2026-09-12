package week3;

/*
 3.39 Methods With Multiple Parameters and Char Return Type
 Exploring advanced programming concepts: utilizing methods with
 multiple parameters and character return type.
 */
//write your static method here. No need to add Main class or main method.

public class Week3_39_MethodsWithMultipleParametersAndCharReturnType {
    public static void main(String[] args) {
        char grade = calculateExamResult(90, 85, 100);
        System.out.println(grade);

        char grade2 = calculateExamResult(60, 88, 70);
        System.out.println(grade2);

        char grade3 = calculateExamResult(1000, 2000, 4000);
        System.out.println(grade2);

    }

    //the user is going to provide the test score for 3 exams as an integer
    //B if it's more than 80
    //C if it's more than 70
    //D if it's more than 60
    //F if it's less than 60

    public static char calculateExamResult(int score1, int score2, int score3) {
        int average = (score1 + score2 + score3) / 3;

        if (average <= 100 && average >= 90) {
            return 'A';
        } else if (average < 90 && average >= 80) {
            return 'B';
        } else if (average < 80 && average >= 70) {
            return 'C';
        } else if (average < 70 && average >= 60) {
            return 'D';
        } else if (average < 60) {
            return 'F';
        } else
            System.out.println("Given scores were wrong");
            return '0';
    }

}
