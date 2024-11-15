package org.example.creational;

public abstract class Dog {

    public static Dog create(String dogType) {
        return switch (dogType.toLowerCase()) {
            case "corgi" -> new Corgi();
            case "shepherd" -> new GermanShepherd();
            case "pug" -> new Pug();
            default -> throw new IllegalArgumentException("illegal dog type provided: " + dogType);
        };
    }

    abstract boolean hasLongLegs();

    public static class Corgi extends Dog {

        @Override
        public boolean hasLongLegs() {
            return false;
        }

    }

    public static class GermanShepherd extends Dog {

        @Override
        public boolean hasLongLegs() {
            return true;
        }

    }

    public static class Pug extends Dog {

        @Override
        public boolean hasLongLegs() {
            return false;
        }

    }

}
