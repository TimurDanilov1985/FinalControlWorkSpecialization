package nursery;

import java.io.Serializable;

public class Hamster extends Pets {
    protected static final String CLASS_ANIMAL = "Хомяк";

    protected Hamster(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        super(id, animalType, animalClass, name, instructions, birthDate);
    }
}

