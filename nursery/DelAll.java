package nursery;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DelAll {
    public void clearFile() {
        try {
            FileWriter fileWriter = new FileWriter("Animals.ser");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
        System.out.println("Все данные удалены");
        System.exit(0);
    }
}
