package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Rescuer rescuer = new Rescuer();
        rescuer.name = "Alex";
        rescuer.availableAmount = 1000;

        Animal animal = new Animal();
        animal.name = "Ginger";
        animal.age = 2;
        animal.healthLevel = 10;
        animal.hungerLevel = 10;
        animal.happinessLevel = 10;
        animal.favoriteFoodName = "meat";
        animal.favoriteActivityName = "digging";

        EntertainmentActivity entertainmentActivity = new EntertainmentActivity("Runing");
        entertainmentActivity.name = "Digging";

        Food food = new Food("Purina");
        food.name = "Purina";
        food.price = 750.47;
        food.quantity = 10.5;
        food.expirationDate = "05.2023";
        food.inStock = true;

        MedicalStaff medicalStaff = new MedicalStaff();
        medicalStaff.name = "Flavius";
        medicalStaff.specialization = "Veterinarian";

        Game game = new Game();
        game.rescuer = rescuer;
        game.animal = animal;
        game.medic = medicalStaff;

    }
}
