package com.company;

public class Dog extends Pet{
    public Dog(String tipo, String color, int age ,String name){
        super("Dog", color, age, name);

    }

    @Override
    public void sound(){
        System.out.println(PetEnum.DOG.getAnimalSound());
    }

    @Override
    public String toString(){
        return super.toString()+
                "tipo" + super.getTipo() +"\n";
    }
}
