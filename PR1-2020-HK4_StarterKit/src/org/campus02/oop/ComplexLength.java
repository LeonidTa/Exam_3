package org.campus02.oop;

import java.util.ArrayList;

public class ComplexLength extends Length{
    private ArrayList<Length> lengthList;

    public ComplexLength() {
        this.lengthList = new ArrayList<>();
    }

    @Override
    public double asMeter() {
        double sumMeters = 0;
        for (Length length : lengthList) {
            sumMeters += length.asMeter();
        }
        return sumMeters;
    }

    public void add(Length l){
        this.lengthList.add(l);
    }

    @Override
    public double getValue() {
        int counter = 0;
        for (Length length : lengthList) {
            counter++;
        }
        return counter;
    }
}
