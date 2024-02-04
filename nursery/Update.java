package nursery;

import java.util.ArrayList;

public class Update {
    private ReadAnimals readAnimals;
    private Input input;

    public Update(ReadAnimals readAnimals, Input input) {
        this.readAnimals = readAnimals;
        this.input = input;
    }
    public void updateId() {
        ArrayList<Animals> animalsList = readAnimals.readAnimalList();
        for(int i = 0; i < animalsList.size(); i++) {
            Animals a = animalsList.get(i);
            a.setId(i + 1);
            animalsList.set(i, a);
        }
        SaveAnimal saveAnimal = new SaveAnimal(animalsList);
        saveAnimal.saveAnimalList();
    }
    public void updateInstructions() {
        ArrayList<Animals> animalList = readAnimals.readAnimalList();
        String instruction;
        int cnt = 0;
        int id;
        System.out.println("Для изменения команд животному введите его id из списка");
        while (true) {
            try {
                id = Integer.parseInt(input.inputParameter("Введите id: "));
                break;
            } catch (Exception e) {
                System.out.println("Неверный формат ввода! Введите целое число");
            }
        }
        for(int i = 0; i < animalList.size(); i ++) {
            if (id == animalList.get(i).getId()) {
                instruction = input.inputParameter("Введите новые команды для животного: ");
                Animals a = animalList.get(i);
                a.setInstructions(instruction);
                animalList.set(i, a);
                SaveAnimal saveAnimal = new SaveAnimal(animalList);
                saveAnimal.saveAnimalList();
                cnt ++;
                break;
            }
        }
        if (cnt != 0) {
            System.out.println("Новые команды для животного записаны");
        } else {
            System.out.println("Нет такого id в списке!");
        }
    }
}
