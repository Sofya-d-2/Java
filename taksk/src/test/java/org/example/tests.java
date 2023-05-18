package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class tests {

    @Test
    void testMethod1() {
        Task_1 task_1 = new Task_1(10);
        double y = task_1.getY();
        assertEquals(y, 1.5457937218955355);
    }

    @Test
    void testMethod2() {
        Task_1 task_1 = new Task_1(0);
        double y = task_1.getY();
        assertEquals(y, 0);
    }

    @Test
    void testMethod3() {
        Task_1 task_1 = new Task_1(-0.1);
        double y = task_1.getY();
        assertEquals(y, -0.10135504558931271);
    }

    @Test
    void testMethod4() {
        Task_1 task_1 = new Task_1(5);
        double y = task_1.getY();
        assertEquals(y, 1.5207754699891267);
    }

    @Test
    void testMethod5() {
        Task_1 task_1 = new Task_1(9);
        double y = task_1.getY();
        assertEquals(y, 1.5430149755311013);
    }

}