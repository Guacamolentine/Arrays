package ua.ithilel.java;

import java.util.Arrays;

import static java.lang.System.*;

public class Fruits {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange","Lemon", "Banana", "Blueberry", "Clementine",
                "Avocado", "Apricots", "Cherries", "Dragon Fruit"};

        String[] food = Arrays.copyOf(fruits, fruits.length);
        Arrays.stream(food).forEach(out::println);
    }
}
