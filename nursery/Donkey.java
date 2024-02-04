package nursery;

import java.io.Serializable;

public class Donkey extends PackAnimals {
    protected static final String CLASS_ANIMAL = "Осел";

    protected Donkey(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        super(id, animalType, animalClass, name, instructions, birthDate);
    }
}
