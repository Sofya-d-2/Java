package org.example;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        x = in.nextDouble();
        Task_1 task = new Task_1(x);
        System.out.println(task.getY());
    }
}