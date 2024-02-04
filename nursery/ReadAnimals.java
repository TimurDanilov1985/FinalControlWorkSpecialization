package nursery;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadAnimals {
    public ArrayList<Animals> readAnimalList() {
        ArrayList<Animals> animalList = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Animals.ser")))
        {
            animalList = ((ArrayList<Animals>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return animalList;
    }
}
