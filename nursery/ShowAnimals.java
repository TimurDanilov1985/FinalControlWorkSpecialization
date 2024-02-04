package nursery;

import java.util.ArrayList;

public class ShowAnimals {
    private ReadAnimals readAnimals;

    public ShowAnimals(ReadAnimals readAnimals) {
        this.readAnimals = readAnimals;
    }

    public void show() {
        ArrayList<Animals> animalList = readAnimals.readAnimalList();
        System.out.printf("\nКоличество голов животных в питомнике: %d\n\n\"Список животных\"\n\n", animalList.size());
        System.out.println("=========================================================================================================================================");
        System.out.printf("%-2s %-20s%-20s%-20s%-50s%-20s\n\n","id:", "Тип:", "Kласc:", "Имя:", "Команды:", "Дата Рождения:");
        if (animalList.size() == 0) {
            System.out.println("В списке пока нет ни одного животного");
        } else {
            for (Animals a : animalList) {
                System.out.println(a);
            }
        }
        System.out.println("=========================================================================================================================================");
        System.out.println();

    }
}
