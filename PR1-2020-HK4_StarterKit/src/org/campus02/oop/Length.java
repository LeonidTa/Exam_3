package org.campus02.oop;

public abstract class Length {
    protected double value;

    public Length() {
        this.value = 0;
    }

    public Length(double value) {
        this.value = value;
    }

    public abstract double asMeter();

    public double getValue(){
        return this.value;
    }
}
