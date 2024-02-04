package nursery;

import java.util.ArrayList;

public class Count {
    private ArrayList<Animals> animalList;

    public Count(ArrayList<Animals> animalList) {
        this.animalList = animalList;
    }
    public int getCount() {
        int c;
        if(animalList.size() == 0) {
            c = 1;
        } else {
            c = animalList.size() + 1;
        }
        return c;
    }
}
