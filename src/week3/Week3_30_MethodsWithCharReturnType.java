package week3;

/*
3.30 Methods With Char Return Type
This course covers methods in Java programming language that return a char data type.
 */

public class Week3_30_MethodsWithCharReturnType {
    public static void main(String[] args) {
        Week3_30_MethodsWithCharReturnType obj = new    Week3_30_MethodsWithCharReturnType();
        char var = obj.work();
        System.out.println(var);

        char gender = obj.getGender();
        System.out.println(gender);
    }

    public char work() {
        return 'A';
    }

    public char getGender(){
        return 'F';
    }
}
