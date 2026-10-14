/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.labs;

/**
 *
 * @author Laken
 */
public class Widget implements Comparable<Widget> {
    private String name;
    private double price;

    public Widget(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Widget other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Widget{name='" + name + "', price=" + price + "}";
    }
}
