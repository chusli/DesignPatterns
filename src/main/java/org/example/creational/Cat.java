package org.example.creational;

public class Cat {

    private final String name;

    private final String fur;

    private final String attitude;

    private Cat(Builder catBuilder) {
        name = catBuilder.name;
        fur = catBuilder.fur;
        attitude = catBuilder.attitude;
    }

    public static FurBuilder withName(String name) {
        return new Builder(name);
    }

    public String getName() {
        return name;
    }

    public String getFur() {
        return fur;
    }

    public String getAttitude() {
        return attitude;
    }

    public sealed interface FurBuilder permits Builder {

        CatCreator withFur(String fur);

    }

    public sealed interface CatCreator permits Builder {

        CatCreator withAttitude(String attitude);

        Cat build();

    }

    private static final class Builder implements FurBuilder, CatCreator {

        private final String name;

        private String fur;

        private String attitude;

        public Builder(String name) {
            this.name = name;
        }

        @Override
        public CatCreator withFur(String fur) {
            this.fur = fur;
            return this;
        }

        @Override
        public CatCreator withAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }

        @Override
        public Cat build() {
            return new Cat(this);
        }

    }

}
