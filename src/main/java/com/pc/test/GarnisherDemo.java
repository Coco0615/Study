package com.pc.test;

public class GarnisherDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("dog = " + dog.getName());
        Length dog2 = new Length(dog);
        System.out.println("dog2.getName() = " + dog2.getName());
        Color dog1 = new Color(dog2);
        System.out.println("dog1.getName() = " + dog1.getName());
    }
}
abstract class  Animal{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getName() ;
}
class Dog extends Animal{

    @Override
    public String getName() {
        setName("dog");
        return "dog";
    }
}
class Color extends Animal{
    
    private Animal animal;
    
    public Color(Animal animal) {
            this.animal=animal;
    }

    @Override
    public String getName() {
        return animal.getName()+"red";
    }
}
class Length extends Animal{
    private Animal animal;

    public Length(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String getName() {
        return animal.getName()+"11m";
    }
}
