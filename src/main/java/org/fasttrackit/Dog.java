package org.fasttrackit;

public class Dog extends Animal{

    private double barkPower;

    @Override
    public void expressJoy() {
        System.out.println(this.getName() + "'s tail is wagging.");
    }

    public double getBarkPower() {
        return barkPower;
    }

    public void setBarkPower(double barkPower) {
        this.barkPower = barkPower;
    }

}
