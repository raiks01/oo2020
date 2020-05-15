package app;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FirstHW {
    
    // Sorteerib array, kasutades Bubble sorti
    public static void BubbleSort(int[] arr) {
        System.out.println("Sorteerimata array: " + Arrays.toString(arr));
        int loops = 0;
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    loops ++;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorteeritud array: " + Arrays.toString(arr) + " Luupide arv: " + loops + ", Array Suurus: " + arr.length);
    }

    public static int[] ArrayGenerator(int a){
        int[] arr;
        arr = new int[a];
        for(int i=0; i < a; i++){
            int randomInt = ThreadLocalRandom.current().nextInt(10, 10001);
            arr[i] = randomInt;
        }
        return(arr);
    }


    public static void main(String[] args) {
        int arr[] =ArrayGenerator(5);
        BubbleSort(arr);
        int arr2[] = ArrayGenerator(7);
        BubbleSort(arr2);
        int arr3[] = ArrayGenerator(9);
        BubbleSort(arr3);
    }
}