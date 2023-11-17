package org.yu.farm;

public class Animal implements LifeForm {

    protected Animal(AnimalType species, String name) {
        this.species = species;
        this.name = name;
    }

    // Instance variables
    private AnimalType species;
    private String name;

    public AnimalType getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Default: make noise in Animal class");
    }


    // Methods
    // abstract public void makeNoise();

//    public void eatUnderYonderTree() {
//        System.out.println("Munch Crunch Sluuuurp");
//    }

}
