package nursery;

import java.io.Serializable;

public class Horse extends PackAnimals {
    protected static final String CLASS_ANIMAL = "Лошадь";

    protected Horse(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        super(id, animalType, animalClass, name, instructions, birthDate);
    }
}
