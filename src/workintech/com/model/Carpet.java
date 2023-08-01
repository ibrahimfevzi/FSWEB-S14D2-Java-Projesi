package workintech.com.model;

import workintech.com.enums.PaintColor;

public class Carpet {

    private int width;
    private int height;
    private double weight;

    private PaintColor color;

    public Carpet(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.color = PaintColor.WHITE;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public PaintColor getColor() {
        return color;
    }

    public void lying() {
        System.out.println("Carpet is lying on the floor.");
    }
}
