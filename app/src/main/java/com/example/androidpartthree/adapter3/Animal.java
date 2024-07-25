package com.example.androidpartthree.adapter3;

public class Animal {

    String animal_name;
    int animal_image;

    Animal(int animal_images,String animal_name){
        this.animal_image=animal_images;
        this.animal_name=animal_name;
    }

    public int getAnimal_image() {
        return animal_image;

    }

    public String getAnimal_name() {
        return animal_name;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal_name='" + animal_name + '\'' +
                ", animal_image=" + animal_image +
                '}';
    }
}
