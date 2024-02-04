package nursery;

import java.io.Serializable;

public class Dog extends Pets {
    protected static final String CLASS_ANIMAL = "Собака";
    protected Dog(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        super(id, animalType, animalClass, name, instructions, birthDate);
    }
}
