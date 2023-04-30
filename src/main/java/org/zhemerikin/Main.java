package org.zhemerikin;



public class Main {
    public static void main(String[] args) {

        int numbersArray[] = {1, 2, 3, 4, 5};

        int sumArr = 0;

        int AVG;

        for (int i = 0; i < numbersArray.length; i++){

            sumArr += numbersArray[i];

        }

        System.out.println("Sum = " + sumArr);

        AVG = sumArr / numbersArray.length;

        System.out.println("Average numbers : " + AVG);

    }
}