package week3;

/*
Master the use of int return types in Java methods to
perform calculations, return integer values, and enable
decision-making based on integer conditions.
 */

public class Week3_26_MethodsWithIntReturnType {
    public static void main(String[] args) {
        int var = sum();
        System.out.println(var);

        int var2 = sum1();
        System.out.println(var2);

        int var3 = divide();
        int var4 = divide();
        System.out.println(var3);
        System.out.println(var4);

    }

    public static int sum() {
        return 10 + 5;
    }
    public static int sum1() {
        int num1 = 20;
        int num2 = 50;

        return num1 * num2;
    }

    public static int divide(){
        System.out.println("I am a devide method and I am about to divide two numbers");
        int num1 = 100;
        int num2 = 20;

        return num1 / num2;
    }
}
