package org.campus02.oop;

public class DemoApp {
    public static void main(String[] args) {
        MeterLength meter = new MeterLength(300);
        System.out.println("Meter: ");
        System.out.println(meter.getValue());
        System.out.println(meter.asMeter());
        System.out.println("------------------------");

        FeedLength feet = new FeedLength(250);
        System.out.println("Feet value: ");
        System.out.println(feet.getValue());
        System.out.println("Feet in meter: ");
        System.out.println(feet.asMeter());
        System.out.println("------------------------");


        ComplexLength complex = new ComplexLength();
        complex.add(meter);
        complex.add(feet);
        System.out.println("Complex number of values:");
        System.out.println(complex.getValue());
        System.out.println("Complex total meter length of all objects: ");
        System.out.println(complex.asMeter());

    }
}
