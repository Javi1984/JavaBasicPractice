package algorithmsSimplePractice;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){

        /*
        what is a binary search
        check if a value is present inside a sorted array
        like an arr of integers
            all any algo does take some number and it tells you if that value exits in the array

         */
        System.out.println("quick maths: 6/2: " + 6/2);
        System.out.println("quick maths: 9/2: " + 9/2);

        //int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] numbers = {1,2,4,5,7,9,11};

        System.out.println("My binary search " + binarySearch(numbers, 9));

        System.out.println("Jav lib for bin search: " + Arrays.binarySearch(numbers, 9));
    }

    private static int binarySearch(int[] numbers, int numberToFind){
        int startPoint = 0;
        int endPoint = numbers.length -1;

        while( startPoint <= endPoint){
            int middlePos = (startPoint + endPoint) / 2;
            int middleNUmber = numbers[middlePos];

            if(numberToFind == middleNUmber){
                return middlePos;
            }

            if(numberToFind<middleNUmber){
                endPoint = middlePos -1;
            } else {
                startPoint = middlePos +1;
            }
        }
        return -1;
    }
}