package org.fasttrackit;

public class Rescuer {

    private String name;
    private double availableAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void feedAnimal(Animal animal, Food food) {
        System.out.println(this.name + " just gave some " + food.getName() + " food to " + animal.getName());
    }

    public void entertain(Animal animal, EntertainmentActivity activity) {
        System.out.println(this.name + " just did/played some " + activity.getName() + " with " + animal.getName());
    }

}
