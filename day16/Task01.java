package PracticeSet.atlaslearnings.day16;

import java.util.Arrays;

public class Task01 {
    static void SelectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n-1; i++) {
            int min = i;
            for (int j = i+1; j <n; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,2,9,3};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
