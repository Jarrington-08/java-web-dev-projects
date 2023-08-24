package collections_exercises;

public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] randNum = {1, 1, 2, 3, 5, 8};
        for (int num : randNum) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }
}
