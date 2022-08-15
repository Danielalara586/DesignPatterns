package Iterator;

import java.util.ArrayList;

public class TelephonicGuide {
    private ArrayList<String> numbers;

    public TelephonicGuide() {
        this.numbers = new ArrayList<String>();
    }

    public void add(String number) {
        this.numbers.add(number);
    }

    public ArrayList<String> getNumbers() {
        return this.numbers;
    }
}
