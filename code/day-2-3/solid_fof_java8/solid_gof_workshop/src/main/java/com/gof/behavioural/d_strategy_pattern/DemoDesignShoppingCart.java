package com.gof.behavioural.d_strategy_pattern;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

interface Discount {
    public void discount(Product product);

}

class BuyXGetYItem implements Discount {
    private int x;
    private int y;

    public BuyXGetYItem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void discount(Product product) {
        if(product.getQuantity()>=x){
            product.setQuantity(product.getQuantity()+product.getQuantity());
        }
    }
}

class BuyXGetYPercentageDiscount implements Discount{
    private int x;
    private int y;

    public BuyXGetYPercentageDiscount(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void discount(Product product) {
        if(product.getQuantity()>=x){
            double reducedPrice=(product.getPrice()-product.getPrice()*y/100);
            product.setPrice(reducedPrice);
        }
    }
}
class Cart {
    private List<Product> productList = new ArrayList<>();
    private Discount discount;

    private double totalCartValue;

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public int getProductCount() {
        return productList.size();
    }

    public double getTotalCartValue() {
        if (productList.size() > 0) {
            for (Product p : productList) {
                totalCartValue = totalCartValue + p.getPrice() * p.getQuantity(); //logic to acutally apply discount polices
            }
        }

        return totalCartValue;
    }
}

public class DemoDesignShoppingCart {
    public static void main(String[] args) {

        Cart cart=new Cart();
        cart.setDiscount(new BuyXGetYPercentageDiscount(2, 10));
        cart.addProduct(new Product(1,"iphone", 10000, 1));
        cart.addProduct(new Product(2,"samsung", 8000, 1));
        double cartValue=cart.getTotalCartValue();
        System.out.println(cartValue);
    }
}
