package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public Dog() {
		import java.util.Random;

public class Dog {
    String petName;
    int petAge;
    String petType;

    public Dog() {
        petName = "Air-Bud";
        petAge = 3;
        petType = "golden retriever";
    }

    public Dog(String name) {
        this.petName = name;
        this.petAge = 1;
        this.petType = "dog breed";
    }

    public Dog(String name, String type) {
        this.petName = name;
        this.petAge = 1;
        this.petType = type;
    }

    public Dog(String name, int age) {
        this.petName = name;
        this.petAge = age;
        this.petType = "dog breed";
    }

    public void setPetName(String name) {
        this.petName = name;
    }

    public void setPetAge(int age) {
        this.petAge = age;
    }

    public void setPetType(String type) {
        this.petType = type;
    }

    public int getPetAge() {
        return petAge;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public boolean isPetSleeping() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public void makeSound() {
        System.out.println(petName + " barks!");
    }
}

	}

}
