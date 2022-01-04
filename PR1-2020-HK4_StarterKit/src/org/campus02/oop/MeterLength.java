package org.campus02.oop;

public class MeterLength extends Length{

    public MeterLength(double value) {
        super(value);
    }

    @Override
    public double asMeter() {
        return value;
    }
}
