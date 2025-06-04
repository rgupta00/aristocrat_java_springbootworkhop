package com.gof.behavioural.b_observer_pattern.new_style;
import java.util.ArrayList;
import java.util.List;

// --- Subject Interface ---
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(float price);
}

// --- Observer Interface ---
interface Observer {
    void update(float price);
}

// --- Concrete Subject ---
class Product implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers(price);
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(float price) {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

// --- Concrete Observer ---
class PriceObserver implements Observer {
    private float price;

    @Override
    public void update(float price) {
        this.price = price;
        System.out.println("PriceObserver: price changed to " + price);
    }
}

// --- Demo ---
public class DemoObserverModern {
    public static void main(String[] args) {
        Product product = new Product("Rice", 55);
        var observer = new PriceObserver();

        product.addObserver(observer);

        product.setPrice(88);
        product.setPrice(99);
    }
}