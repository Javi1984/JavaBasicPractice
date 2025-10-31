package algorithmsSimplePractice;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args){
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i=0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before --");
        System.out.println(Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length -1);

        System.out.println("After ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int lowIdx, int highIdx) {
        if(lowIdx >= highIdx){
            return;
        }
        int pivot  = numbers[highIdx];
        int leftPointer = lowIdx;
        int rightPointer = highIdx;

        while( leftPointer < rightPointer ){
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(numbers, leftPointer, rightPointer);
        }
        swap(numbers, leftPointer, highIdx);

        quickSort(numbers, lowIdx, leftPointer-1);
        quickSort(numbers, leftPointer+1, highIdx);
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] =  array[index2];
        array[index2] = temp;
    }
}
