package org.example;

public class Task_3 {
    int[] arr;
    public Task_3(int[] arr){
        this.arr = arr;
    }

    public int[] res(){
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] == 0 && arr[j + 1] != 0) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                        sorted = false;
                    }
                }
            }
        return arr;
    }
}
