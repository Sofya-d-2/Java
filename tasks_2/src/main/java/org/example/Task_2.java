package org.example;

import java.util.Arrays;

public class Task_2 {
    int[][] matrixA;
    boolean[][] matrixB;

    public Task_2(int[][] matrixA){
        this.matrixA = matrixA;
    }

    public boolean[][] res(){
        matrixB = new boolean[matrixA.length][];

        for (int i=0; i<matrixA.length;i++){
            boolean fillValue = false;
            for (int j=0;j<matrixA.length;j++){
                // первое число будет по адрему matrixA[i][j]
                // ишем второе число
                if (fillValue)
                    break;
                for (int k=j+1;k<matrixA.length;k++) {
                    // сравниваем, если нашли выходим из этого цикла
                    if (matrixA[i][j] == matrixA[i][k]) {
                        fillValue = true;
                        break;
                    }
                }
            }

            matrixB[i] = new boolean[matrixA[i].length];
            Arrays.fill(matrixB[i],fillValue);
        }
        return matrixB;
    }
}
