package org.example.creational;

public class SedanFactory implements CarFactory {

    @Override
    public Car build() {
        return new Sedan();
    }

}
