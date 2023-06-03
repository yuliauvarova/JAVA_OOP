package ru.geekbrains.lesson1;

public class Chocolate extends Product {

    private String type;

    private int calories;

    public Chocolate(String brand, String name, double price, String type, int calories) {
        super(brand, name, price);
        this.type = type;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %s - %.2f [калорийность: %d]", type, brand, name, price, calories);
    }

}
