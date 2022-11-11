package com.example.fikacoffee.modelo;

import androidx.lifecycle.ViewModel;

import com.example.fikacoffee.R;

import java.util.ArrayList;
import java.util.List;

public class CoffeeViewModel extends ViewModel {

    private List<Coffee> coffeeList;

    public List<Coffee> getCoffeeList() {
        if(coffeeList == null){
            loadCoffee();
        }
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    private void loadCoffee() {
        coffeeList= new ArrayList<>();
        coffeeList.add(new Coffee("Caramel Macchiato", 3.5, R.drawable.caramel_macchiato, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee1));
        coffeeList.add(new Coffee("Caramel Cold Drink", 3.5, R.drawable.caramel_cold_drink, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee2));
        coffeeList.add(new Coffee("Iced Coffee Mocha", 3.5, R.drawable.iced_coffe_mocha, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee3));
        coffeeList.add(new Coffee("Caramelized Pecan Latte", 3.5, R.drawable.caramelized_pecan_latte, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee1));
        coffeeList.add(new Coffee("Toffee Nut Latte", 3.5, R.drawable.toffee_nut_late, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee2));
        coffeeList.add(new Coffee("Capuchino", 3.5, R.drawable.capuchino, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee3));
        coffeeList.add(new Coffee("Toffee Nut Iced Latte", 3.5, R.drawable.toffee_nut_late_iced, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee1));
        coffeeList.add(new Coffee("Americano", 3.5, R.drawable.americano, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee2));
        coffeeList.add(new Coffee("Vietnamese-Style Iced Coffee", 3.5, R.drawable.vietnamese_iced_coffe, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee3));
        coffeeList.add(new Coffee("Black Tea Latte", 3.5, R.drawable.black_tea_latte, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee1));
        coffeeList.add(new Coffee("Classic Irish Coffee", 3.5, R.drawable.classic_irish_coffe, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee2));
        coffeeList.add(new Coffee("Toffee Nut Crunch Latte", 3.5, R.drawable.toffee_nut_crunch_latte, "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee3));

    }

    public Coffee findCoffee(String name) {
        for (Coffee coffee : coffeeList) {
            if(coffee.getName().equals(name)){
                return coffee;
            }
        }
        return null;
    }
}
