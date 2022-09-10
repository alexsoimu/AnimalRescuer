package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private MedicalStaff medic;
    private List<Food> availableFood = new ArrayList<>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[5];

    private void initFood() {
        availableFood.add(new Food("Purina"));
        availableFood.add(new Food("Tetra"));
    }

    private void initActivities() {
        availableActivities[0] = new EntertainmentActivity("Running");
        availableActivities[1] = new EntertainmentActivity("Swimming");
    }

    public void start() {
        initFood();
        initActivities();

        displayAvailableFood();
        displayAvailableActivities();
    }

    public void displayAvailableFood() {
        System.out.println("Available food: ");
        for (Food food : availableFood) {
            if (food != null) {
                System.out.println(food.getName());
            }
        }
    }

    public void displayAvailableActivities() {
        System.out.println("Available activities: ");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicalStaff getMedic() {
        return medic;
    }

    public void setMedic(MedicalStaff medic) {
        this.medic = medic;
    }
}
