package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static final int MAX_LEVEL = 10;
    private static final int MIN_LEVEL = 7;
    private static final int MAX_ITERATIONS = 5;

    private Rescuer rescuer;
    private Animal animal;
    private MedicalStaff medic;
    private List<Food> availableFood = new ArrayList<>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[5];

    private void initFood() {
        Food dogFood = new Food("Purina");
        Food fishFood = new Food("Tetra");
        availableFood.add(dogFood);
        availableFood.add(fishFood);
    }

    private void initActivities() {
        EntertainmentActivity activity1 = new EntertainmentActivity("Running");
        EntertainmentActivity activity2 = new EntertainmentActivity("Swimming");
        availableActivities[0] = activity1;
        availableActivities[1] = activity2;
    }

    public void start() throws Exception {
        initAnimal();
        initActivities();
        initFood();
        initRescuer();

        nameAnimal();

        for (int i = 1; i < MAX_ITERATIONS; i++) {
            requireActivity();
            requireFeeding();

            if (i % 3 == 0) {
                animal.setHungerLevel(animal.getHungerLevel() + 1);
                animal.setHappinessLevel(animal.getHappinessLevel() - 1);
                System.out.println("*************");
                System.out.println(animal.getName() + " is getting hungry and bored.");
                System.out.println("Hungry level: " + animal.getHungerLevel());
                System.out.println("Happinee level: " + animal.getHappinessLevel());
                System.out.println("*************");
            }

            if (i == MAX_ITERATIONS) {
                if (MIN_LEVEL < animal.getHungerLevel()) {
                    throw new RuntimeException("Game over. " + animal.getName() + " is too poorly fed.");
                }

                if (MIN_LEVEL < animal.getHappinessLevel()) {
                    throw new RuntimeException("Game over. " + animal.getName() + " is too poorly entertained.");
                }

                System.out.println("Congratulations! " + animal.getName() + " has been fed and entertained well enough.");
            }
        }
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

    private void initAnimal() {
        animal = new Dog();
        animal.setAge(0.2);
        animal.setFavoriteActivityName("Running");
        animal.setFavoriteFoodName("Purina");
        animal.setHungerLevel(MAX_LEVEL - 1);
        animal.setHappinessLevel(1);
    }

    private void initRescuer() throws Exception {
        rescuer = new Rescuer();
        rescuer.setName(readRescuerName());
    }

    private String readRescuerName() {
        System.out.print("Please type your name and press Enter: ");

        Scanner scanner = new Scanner(System.in);
        String rescuerName = scanner.nextLine();

        System.out.println("Welcome, " + rescuerName);
        System.out.println("*************");
        return rescuerName;
    }

    private String readActivityName() {
        System.out.print("Please select activity: ");

        Scanner scanner = new Scanner(System.in);
        String activityName = scanner.nextLine();

        System.out.println("Selected: " + activityName);

        List<String> availableActivityNames = new ArrayList<>();

        for (EntertainmentActivity activity : availableActivities) {
            if (activity != null) {
                availableActivityNames.add(activity.getName());
            }
        }

        if (!availableActivityNames.contains(activityName)) {
            System.out.println(activityName + " is not available as an activity type in this game.");
            return readActivityName();
        }

        System.out.println("*************");

        return activityName;
    }

    private void requireActivity() throws Exception{
        System.out.println(animal.getName() + "'s happines level is: " + animal.getHappinessLevel() + ". Please select entertainment activity...");

        displayAvailableActivities();

        String activityName = readActivityName();

        EntertainmentActivity activity = new EntertainmentActivity(activityName);

        rescuer.entertain(animal, activity);

        System.out.println("*************");
    }

    private String readFoodName() {
        System.out.print("Please select food: ");

        Scanner scanner = new Scanner(System.in);
        String foodName = scanner.nextLine();

        System.out.println("Selected: " + foodName);

        List<String> availableFoodNames = new ArrayList<>();

        for (Food food : availableFood) {
            availableFoodNames.add(food.getName());
        }

        if (!availableFoodNames.contains(foodName)) {
            System.out.println(foodName + " is not available as a food type in this game.");
            return foodName;
        }

        System.out.println("*************");

        return foodName;
    }

    private void requireFeeding() throws Exception{
        System.out.println(animal.getName() + "'s hunger level is: " + animal.getHungerLevel() + ". Please select food...");

        displayAvailableFood();

        String foodName = readFoodName();
        Food food = new Food(foodName);

        rescuer.feedAnimal(animal, food);

        System.out.println("*************");
    }

    private void nameAnimal() {
        System.out.print("Please give a name for your rescued pet: ");

        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        animal.setName(animalName);
        System.out.println(animalName + " says thanks.");
        System.out.println("*************");
    }

}
