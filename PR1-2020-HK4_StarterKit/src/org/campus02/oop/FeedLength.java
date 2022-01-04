package org.campus02.oop;

public class FeedLength extends Length{

    public FeedLength(double value) {
        super(value);
    }

    @Override
    public double asMeter() {
        return this.value * 0.3048;
    }
}
