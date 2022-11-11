package com.example.fikacoffee.modelo;

import com.example.fikacoffee.R;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    private String name;
    private double price;
    private int image;
    private String description;
    private int color;

    public Coffee(String name, double price, int image, String description, int color) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.color = color;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }



    public static List<Coffee> coffeeList(){
        List<Coffee> list= new ArrayList<>();
        list.add(new Coffee("Caramel Macchiato",3.5, R.drawable.caramel_macchiato,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee1));
        list.add(new Coffee("Caramel Cold Drink",3.5, R.drawable.caramel_cold_drink,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee2));
        list.add(new Coffee("Iced Coffee Mocha",3.5, R.drawable.iced_coffe_mocha,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee3));
        list.add(new Coffee("Caramelized Pecan Latte",3.5, R.drawable.caramelized_pecan_latte,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee1));
        list.add(new Coffee("Toffee Nut Latte",3.5, R.drawable.toffee_nut_late,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee2));
        list.add(new Coffee("Capuchino",3.5, R.drawable.capuchino,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee3));
        list.add(new Coffee("Toffee Nut Iced Latte",3.5, R.drawable.toffee_nut_late_iced,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee1));
        list.add(new Coffee("Americano",3.5, R.drawable.americano,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee2));
        list.add(new Coffee("Vietnamese-Style Iced Coffee",3.5, R.drawable.vietnamese_iced_coffe,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee3));
        list.add(new Coffee("Black Tea Latte",3.5, R.drawable.black_tea_latte,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee1));
        list.add(new Coffee(" Classic Irish Coffee",3.5, R.drawable.classic_irish_coffe,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee2));
        list.add(new Coffee("Toffee Nut Crunch Latte",3.5, R.drawable.toffee_nut_crunch_latte,
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.",
                R.color.coffee3));

        return list;
    }

    public static Coffee findTea(String name){
        for (Coffee coffee:coffeeList()){
            if (coffee.getName().equals(name)){
                return coffee;
            }
        };

        return null;
    }
}
