package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");

            Integer choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Exiting the program...");
                break;
            }

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {

                case 1:
                    pet = new Dog();

                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);

                    ((Dog) pet).setBreed("German Shepherd");

                    System.out.println("\nPet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());

                    break;

                case 2:
                    pet = new Cat();

                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);

                    ((Cat) pet).setNoOfLives(9);

                    System.out.println("\nPet id is " + petFile.getPetId());
                    System.out.println("Pet name is " + petFile.getPetName());
                    System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                    System.out.println("Communication sound: " + petFile.getPet().makeSound());
                    System.out.println("Play mode: " + petFile.getPet().play());

                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        input.close();
    }
}