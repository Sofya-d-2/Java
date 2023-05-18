package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] Matrix1= {
                {1,2,3},
                {4,5,6},
                {1,2,2}
        };

        Task_2 task_2 = new Task_2(Matrix1);

        System.out.println(Arrays.deepToString(task_2.res()));

        int[] arr= {0,1,2,0,0,3,0,4,5,0};

        Task_3 task_3 = new Task_3(arr);

        System.out.println(Arrays.toString(task_3.res()));
    }
}