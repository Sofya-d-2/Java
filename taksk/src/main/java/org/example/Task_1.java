package org.example;

public class Task_1 {
    private double x;

    public Task_1(double x) {
        this.x = x;
    }

    public double getY(){
        if (this.x <= -0.5) {
            return -Math.pow(x, 5) + Math.log10(Math.pow(3,x) - Math.pow(Math.abs(x),-x));
        }
        if (this.x < 0.5 && this.x > -0.5) {
            return Math.tan(x/(1-Math.pow(x,2)));
        }
        if (this.x >=0.5) {
            return Math.acos(1/(4*x));
        }
        return 0;
    }
}
