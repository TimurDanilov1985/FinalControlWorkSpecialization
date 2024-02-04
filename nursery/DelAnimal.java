package nursery;

import java.util.ArrayList;

public class DelAnimal {
    private Input input;
    private Update update;
    private ReadAnimals readAnimals;
    private ShowAnimals showAnimals;

    public DelAnimal(Input input, Update update, ReadAnimals readAnimals, ShowAnimals showAnimals) {
        this.input = input;
        this.update = update;
        this.readAnimals = readAnimals;
        this.showAnimals = showAnimals;
    }

    public void deleteAnimal() {
        int cnt = 0;
        int id;
        ArrayList<Animals> animalList = readAnimals.readAnimalList();
        System.out.println("Для удаления животного из реестра введите его id из списка");
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
                animalList.remove(i);
                cnt ++;
                break;
            }
        }
        if (cnt != 0) {
            SaveAnimal saveAnimal = new SaveAnimal(animalList);
            saveAnimal.saveAnimalList();
            update.updateId();
            System.out.println("ЖИВОТНОЕ УДАЛЕНО ИЗ СПИСКА\n");
        } else {
            System.out.println("Нет такого id в списке!");
        }
    }
}
