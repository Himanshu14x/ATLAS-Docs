package PracticeSet.atlaslearnings.day16;

import java.util.Arrays;

public class Task06 {

    static void BubbleSort(int[] arr){
        int n = arr.length;
        for (int i = n-1; i >=0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,9,5,2,8,3};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
