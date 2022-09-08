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

        double hungerLevel = animal.getHungerLevel();

        hungerLevel--;
        animal.setHungerLevel(hungerLevel);

        System.out.println(animal.getName() + "'s hunger level is now: " + animal.getHungerLevel());

        if (food.getName().equals(animal.getFavoriteFoodName())) {
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
            System.out.println(animal.getName() + "'s happiness level is now " + animal.getHappinessLevel());
        }

    }

    public void entertain(Animal animal, EntertainmentActivity activity) {
        System.out.println(this.name + " just did/played some " + activity.getName() + " with " + animal.getName());

        int increment;

        if (activity.getName().equals(animal.getFavoriteActivityName())){
            increment = 2;
        } else {
            increment = 1;
        }

        animal.setHappinessLevel(animal.getHappinessLevel() + increment);

        System.out.println(animal.getName() + "'s happiness level is now: " + animal.getHappinessLevel());
    }

}
