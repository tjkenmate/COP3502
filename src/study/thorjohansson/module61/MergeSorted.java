package study.thorjohansson.module61;/**
 * Created by Thor Johansson on 5/24/2017.
 */

import java.util.Scanner;

public class MergeSorted {
    public static void main(String[] args) {
        int arraySize;
        int[] list1, list2;
        //Set up Scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Enter list1: ");
        arraySize = in.nextInt();
        list1 = new int[arraySize];
        for(int i = 0; i < arraySize; i++)
            list1[i] = in.nextInt();

        bubbleSort(list1);

        System.out.print("Enter list2: ");

        arraySize = in.nextInt();
        list2 = new int[arraySize];
        for(int i = 0; i < arraySize; i++)
            list2[i] = in.nextInt();

        System.out.print("The merged list is ");
        printArray(merge(list1, list2));
    }

    public static void bubbleSort(int[] arrayToSort) {
        int temp;
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 1; j < (arrayToSort.length - i); j++) {
                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    temp = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] answer = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j])
                answer[k++] = list1[i++];
            else
                answer[k++] = list2[j++];
        }

        while (i < list1.length)
            answer[k++] = list1[i++];

        while (j < list2.length)
            answer[k++] = list2[j++];

        return answer;
    }

    public static void printArray(int[] array){
        for(int i: array)
            System.out.print(i+ " ");
    }
}
