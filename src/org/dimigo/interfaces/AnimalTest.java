package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        //iAnimal.FARM_NAME = "디문 동물농장";
        iAnimal.welcome();

        iAnimal[] animals = {
                new Dog(), new Cat()
        };
        for(iAnimal a : animals) {
            a.eat();
            a.sleep();
            a.bark();
        }
        iAnimal dog = new Dog();
        ((Dog) dog).wag();
    }
}
