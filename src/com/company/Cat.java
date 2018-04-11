package com.company;

public class Cat extends Pet {
    public Cat(String tipo, String color, int age,String name){
        super("Cat", color, age , name);

    }

    @Override
    public void sound(){
        System.out.println(PetEnum.CAT.getAnimalSound());
    }
    @Override
    public String toString(){
        return super.toString()+
                "tipo" + super.getTipo() +"\n";
    }
}
