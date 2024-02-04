package nursery;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SaveAnimal {
    private ArrayList<Animals> animalList;

    public SaveAnimal(ArrayList<Animals> animalList) {
        this.animalList = animalList;
    }

    public void saveAnimalList() {
        System.out.println();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Animals.ser"))) {
            oos.writeObject(animalList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
