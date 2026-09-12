package week4;

/*
4.8 While Loop Sum All Nums
 */

public class Week4_8_WhileLoopSumAllNums {
    public static void main(String[] args) {

        //write a program that sums up all numbers from 1-5
        //1+2+3+4+5 = 15

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            sum += counter;
            System.out.println(sum);
            counter++;

        }
    }
}
