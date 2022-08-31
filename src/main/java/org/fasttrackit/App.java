package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal animal = new Animal();
        Adoption adoption = new Adoption();
        FoodForAnimals foodForAnimals = new FoodForAnimals();
        RecreationalActivity recreationalActivity = new RecreationalActivity();
        Veterinarian veterinarian = new Veterinarian();
        Game game = new Game();

        animal.name = "Ginger";
        animal.age = 2;
        animal.levelHealth = 10;
        animal.levelHunger = 10;
        animal.moodLevel = 10;
        animal.favouriteFood = "meat";
        animal.favouriteActivity = "digging";

        adoption.name = "Alex";
        adoption.availableAmount = 1000;

        foodForAnimals.name = "Royal canin";
        foodForAnimals.price = 750.87;
        foodForAnimals.quantity = 10.5;
        foodForAnimals.expirationDate = "05.2023";
        foodForAnimals.availabilityStock = true;

        recreationalActivity.name = "Digging";

        veterinarian.name = "Flavius";
        veterinarian.specialization = "Veterinarian";

        game.adoption = adoption;
        game.dog = animal;
        game.veterinarian = veterinarian;



    }
}
