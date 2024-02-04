package nursery;

public class PackAnimals extends Animals {
    protected static final String TYPE_ANIMAL = "Вьючное животное";
    protected PackAnimals(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        super(id, animalType, animalClass, name, instructions, birthDate);
    }

}
