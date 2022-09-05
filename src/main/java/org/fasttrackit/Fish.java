package org.fasttrackit;

public class Fish extends Animal{

    private int wingsCount;

    @Override
    public void expressJoy() {
        System.out.println(this.getName() + " is swimming playfully.");
    }

    public int getWingsCount() {
        return wingsCount;
    }

    public void setWingsCount(int wingsCount) {
        this.wingsCount = wingsCount;
    }

}
