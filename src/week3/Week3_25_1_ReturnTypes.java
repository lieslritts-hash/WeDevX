package week3;

/*
3.25.1 Return types*
easy
|
30 min
|
Share
Five important facts about Java method return types:

A method's return type determines the type of value that the method returns to the calling code.

The void return type indicates that the method does not return any value.

The return type of a method can be any primitive data type, an object, or an array.

If a method has a return type other than void, it must include a return statement that returns a
value of the same type as the return type.

Methods with return types can be used to efficiently pass data between methods and to return results
to the calling code, which can be particularly useful in larger, more complex programs.

Hit that submit button to move on to the next lecture.


 */

public class Week3_25_1_ReturnTypes {
    public static void main(String[] args) {
        Week3_25_1_ReturnTypes obj = new Week3_25_1_ReturnTypes();
        int num =  obj.sum();
        System.out.println(num);
    }

    public int sum() {
        return 1+2;
    }
}
