package collections_exercises;

import java.util.ArrayList;

public class ArrayListPractice1Main {
    public static void main(String[] args) {
        ArrayList<Integer> testArrayList = new ArrayList<>();
        testArrayList.add(1);
        testArrayList.add(2);
        testArrayList.add(3);
        testArrayList.add(4);
        testArrayList.add(5);
        System.out.println(ArrayListPractice1.sumEven(testArrayList));
    }
}

