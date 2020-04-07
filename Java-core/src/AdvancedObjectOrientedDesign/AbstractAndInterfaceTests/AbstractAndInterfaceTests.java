package AdvancedObjectOrientedDesign.AbstractAndInterfaceTests;

abstract class Animal{
    abstract String makeSound();
}

interface Edible{
    String howToEat();
}

class Tiger extends Animal {
    @Override
    public String makeSound(){
        return "Tiger: roarrrr";
    }
}

class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck";
    }
    @Override
    public String howToEat(){
        return "Could be fried";
    }
}

abstract class Fruit{
    abstract String howToEat();
}

class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple could be slided";
    }
}

class Orange extends Fruit{
    @Override
    public String howToEat(){
        return "Orange could be juice";
    }
}

public class AbstractAndInterfaceTests{
    public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();

            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Apple();
            fruits[1] = new Orange();


            for (Animal animal : animals){
                System.out.println(animal.makeSound());
                if (animal instanceof Chicken){
                    Edible edible = (Chicken) animal;
                    System.out.println(edible.howToEat());
                }

            }

            for (Fruit fruit : fruits){
                System.out.println(fruit.howToEat());
            }
    }
}