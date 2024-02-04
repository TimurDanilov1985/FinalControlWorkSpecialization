package nursery;

import java.io.Serializable;

public class Cat extends Pets {
    protected static final String CLASS_ANIMAL = "Кот";
    protected Cat(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        super(id, animalType, animalClass, name, instructions, birthDate);
    }

}
