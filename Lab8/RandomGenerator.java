import java.util.Random;

public class RandomGenerator {

    public static int[] generate(int b1, int b2, int count) {
        Random rand = new Random();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = rand.nextInt(b2 - b1 + 1) + b1;
        }

        return arr;
    }
}