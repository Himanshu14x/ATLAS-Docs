package PracticeSet.atlaslearnings.day16;

import java.util.Arrays;

public class Task09 {

    static void InsertionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,7,2,9,3};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
