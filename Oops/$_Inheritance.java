package Oops;

public class $_Inheritance {
    public static void main(String args[]){
        Dog myDog  = new Dog();
        myDog.eat();
        myDog.bark();
    }
}

class Animal{
    void eat(){
        System.out.println("This Animal Eat Food.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("The Dog Barks.");
    }
}
