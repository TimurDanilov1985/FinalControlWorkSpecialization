package nursery;

public class Pets extends Animals {
    protected static final String TYPE_ANIMAL = "Домашнее животное";
    protected Pets(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        super(id, animalType, animalClass, name, instructions, birthDate);
    }
}
