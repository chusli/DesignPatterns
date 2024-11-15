package org.example.creational;

public class Sheep {

    private final String color;

    private String texture;

    public Sheep(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public Sheep(Sheep sheep) {
        color = sheep.color;
        texture = sheep.texture;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public Sheep clone() {
        return new Sheep(this);
    }

}
