package src.com.bridgelabz;

import java.util.ArrayList;

import java.util.Collections;

public class GenericsTestMaximum<T extends Comparable<T>> {

    ArrayList<T> list = new ArrayList<T>();

    GenericsTestMaximum(T... inputs) {

        for (T value : inputs) {
            this.list.add(value);
        }
    }

    public T testMaximum() {
        return GenericsTestMaximum.testMaximum(list);
    }

    public static <T extends Comparable<T>> T testMaximum(ArrayList<T> list) {
        Collections.sort(list);
        T maxValue = list.get(list.size() - 1);
        System.out.println("Maximum : " + maxValue);
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println("Java Core - Generics Test Maximum");
        Integer intValue1 = 30, intValue2 = 50, intValue3 = 96, intValue4 = 102;
        Float floatValue1 = 3.3f, floatValue2 = 3.5f, floatValue3 = 8.7f;
        String stringValue1 = "Apple", stringValue2 = "Peach", stringValue3 = "Banana";

        new GenericsTestMaximum(intValue1, intValue2, intValue3, intValue4).testMaximum();
        new GenericsTestMaximum(floatValue1, floatValue2, floatValue3).testMaximum();
        new GenericsTestMaximum(stringValue1, stringValue2, stringValue3).testMaximum();

    }
}
