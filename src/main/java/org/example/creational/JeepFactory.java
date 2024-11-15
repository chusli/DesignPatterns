package org.example.creational;

public class JeepFactory implements CarFactory {

    @Override
    public Car build() {
        return new Jeep();
    }

}
