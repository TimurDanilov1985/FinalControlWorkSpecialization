package nursery;

import java.util.ArrayList;

public class AddAnimal {
    private Count count;
    private Input input;
    private ArrayList<Animals> animalList;

    public AddAnimal(Count count, Input input, ArrayList<Animals> animalList) {
        this.count = count;
        this.input = input;
        this.animalList = animalList;
    }

    public void createAnimal() {
        String number;
        int cnt;
        int id;
        String typeAnimal;
        String animalClass;
        String name;
        String instructions;
        String birthDate;
        System.out.println("Выберите класс животного\nВведите число соответствующее классу и нажмите \"Enter\":\n1 - Собака\n2 - Кот\n3 - Хомяк\n4 - Лошадь\n" +
                "5 - Верблюд\n6 - Осел");
        while (true) {
            cnt = 0;
            number = input.inputParameter("Введите число класса: ");
            switch (number) {
                case "1":
                    System.out.println("Выбран класс \"Собака\"\n");
                    break;
                case "2":
                    System.out.println("Выбран класс \"Кот\"\n");
                    break;
                case "3":
                    System.out.println("Выбран класс \"Хомяк\"\n");
                    break;
                case "4":
                    System.out.println("Выбран класс \"Лошадь\"\n");
                    break;
                case "5":
                    System.out.println("Выбран класс \"Верблюд\"\n");
                    break;
                case "6":
                    System.out.println("Выбран класс \"Осел\"\n");
                    break;
                default:
                    System.out.println("Неверный формат ввода! Введите параметр снова");
                    cnt++;
                    break;
            }
            if (cnt == 0) {
                break;
            }
        }
        id = count.getCount();
        name = input.inputParameter("Введите имя животного: ");
        instructions = input.inputParameter("Введите команды, которым обучено животное: ");
        birthDate = input.inputParameter("Введите дату рождения животного: ");

        switch (number) {
            case "1":
                typeAnimal = Pets.TYPE_ANIMAL;
                animalClass = Dog.CLASS_ANIMAL;
                Animals dog = new Dog(id, typeAnimal, animalClass, name, instructions, birthDate);
                animalList.add(dog);
                break;
            case "2":
                typeAnimal = Pets.TYPE_ANIMAL;
                animalClass = Cat.CLASS_ANIMAL;
                Animals cat = new Cat(id, typeAnimal, animalClass, name, instructions, birthDate);
                animalList.add(cat);
                break;
            case "3":
                typeAnimal = Pets.TYPE_ANIMAL;
                animalClass = Hamster.CLASS_ANIMAL;
                Animals hamster = new Hamster(id, typeAnimal, animalClass, name, instructions, birthDate);
                animalList.add(hamster);
                break;
            case "4":
                typeAnimal = PackAnimals.TYPE_ANIMAL;
                animalClass = Horse.CLASS_ANIMAL;
                Animals horse = new Horse(id, typeAnimal, animalClass, name, instructions, birthDate);
                animalList.add(horse);
                break;
            case "5":
                typeAnimal = PackAnimals.TYPE_ANIMAL;
                animalClass = Camel.CLASS_ANIMAL;
                Animals camel = new Camel(id,typeAnimal, animalClass, name, instructions, birthDate);
                animalList.add(camel);
                break;
            case "6":
                typeAnimal = PackAnimals.TYPE_ANIMAL;
                animalClass = Donkey.CLASS_ANIMAL;
                Animals donkey = new Donkey(id, typeAnimal, animalClass, name, instructions, birthDate);
                animalList.add(donkey);
                break;
            default:
                break;
        }
        SaveAnimal saveAnimal = new SaveAnimal(animalList);
        saveAnimal.saveAnimalList();
    }
}
