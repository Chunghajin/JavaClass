package org.dimigo.interfaces;

public class Cat implements iAnimal {

    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    @Override
    public void sleep() {
        System.out.println("쿨쿨");
    }

    @Override
    public void bark() {
        System.out.println("야옹");
    }
}
