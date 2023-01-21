package com.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        Car car = new Car();
        car.startCar();
        car.stopCar();
        car.setYear(1863);
        car.setType("Легковой");
        car.setColor("Черный");
        car.getColor();
        car.getType();
        car.getYear();

        // Задание 2
        System.out.println("-------------------");
        System.out.println("Задание 2");
        Cat cat = new Cat("Кошка");
        cat.drinkMilk();


    }
}
