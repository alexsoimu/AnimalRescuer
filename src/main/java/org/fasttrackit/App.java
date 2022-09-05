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
        rescuer.setName("John");
        rescuer.setAvailableAmount(300);

        Animal animal = new Animal();
        animal.setName("Chaika");
        animal.setAge(4.5);
        animal.setHealthLevel(10);
        animal.setHappinessLevel(10);
        animal.setFavoriteActivityName("Running");
        animal.setFavoriteFoodName("Pizza");

        EntertainmentActivity activity = new EntertainmentActivity("Runing");

        Food food = new Food("Purina");
        food.setQuantity(10);
        food.setPrice(79.99);
        food.setInStock(true);
        food.setExpirationDate("05.2023");

        MedicalStaff medicalStaff = new MedicalStaff();
        medicalStaff.setName("Dr. Who");
        medicalStaff.setSpecialization("General Medicine");

        Game game = new Game();
        game.setRescuer(rescuer);
        game.setAnimal(animal);
        game.setMedic(medicalStaff);

        rescuer.feedAnimal(animal, food);
        rescuer.entertain(animal, activity);

        animal.expressJoy();

        Dog dog = new Dog();
        dog.setName("Panda Maci");
        dog.expressJoy();

        Fish fish = new Fish();
        fish.setName("Bregovic");
        fish.expressJoy();

    }
}
