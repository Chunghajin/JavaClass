package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스"),
                new Car("그랜저"),
                new Car("아반떼")
        };


        for(Car car : cars) {
            System.out.println(car);
        }

        Car.setCompany("현대");
        //cars[0].setCompany("현대");

        System.out.println(Integer.parseInt("100"));
        System.out.println(Math.abs(-123));
        System.out.println(Math.sin(30));
        System.out.println(Math.sin(30));
    }
}
