package org.example.creational;

public class TractorFactory implements CarFactory {

    @Override
    public Car build() {
        return new Tractor();
    }

}
