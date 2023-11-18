package org.yu.farm;

public class Panda extends Animal {
    public Panda(String name) {
        this(AnimalType.PANDA, name);
    }
    protected Panda(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Panda making some noise");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("PANDA is eating under yonder tree");
    }
}
