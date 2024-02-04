package nursery;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadAnimals readAnimals = new ReadAnimals();
        ArrayList<Animals> animalList = readAnimals.readAnimalList();
        Count count = new Count(animalList);
        ShowAnimals showAnimals = new ShowAnimals(readAnimals);
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        Exit exit = new Exit(input);
        Update update = new Update(readAnimals, input);
        AddAnimal addAnimal = new AddAnimal(count, input, animalList);
        DelAnimal delAnimal = new DelAnimal(input ,update, readAnimals, showAnimals);
        Menu menu = new Menu(update, delAnimal, exit, showAnimals, input, addAnimal);
        menu.showMenu();
    }
}
