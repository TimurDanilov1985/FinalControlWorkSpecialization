package nursery;

import java.io.Serializable;

public class Animals implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String animalType;
    private String animalClass;
    private String name;
    private String instructions;
    private String birthDate;

    protected Animals(int id, String animalType, String animalClass, String name, String instructions, String birthDate) {
        this.id = id;
        this.animalType = animalType;
        this.animalClass = animalClass;
        this.name = name;
        this.instructions = instructions;
        this.birthDate = birthDate;
    }

    public Animals() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    @Override
    public String toString() {
    return String.format("%-2s  %-20s%-20s%-20s%-50s%-20s", this.getId(), this.getAnimalType(), this.getAnimalClass(), this.getName(),this.getInstructions(), this.getBirthDate());
    }
}
