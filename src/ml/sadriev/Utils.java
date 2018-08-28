package ml.sadriev;

import java.util.Random;

class Utils {

    /**
     * Return array with 20 positive integer numbers
     * @return array with 20 positive integer numbers
     */
    static int[] fillArray() {
        int[] array = new int[20];

        Random random = new Random(8346234L);

        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.round(100 * Math.random());
        }

        return array;
    }
}
