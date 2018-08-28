package ml.sadriev;

import static ml.sadriev.Utils.fillArray;

/**
 * An instance of this class is used to solution of problem
 * from @see <a href="https://habr.com/company/alconost/blog/419685">
 *     Важнейшие структуры данных, которые вам следует знать к своему собеседованию по программированию</a> }
 *
 * @author vierdas@gmail.com
 * @since 1.0
 */
public class ArraysExample1 {

    public static void main(String[] args) {
        int[] array = fillArray();

        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        System.out.println("2nd minimal number is " + logic(array));
    }

    /**
     * Return 2nd minimal integer number
     *
     * @param array for search in it 2nd minimal integer
     * @return 2nd minimal integer number from {@code array}
     */
    private static int logic(int[] array) {
        int x1, x2;
        x1 = x2 = Integer.MAX_VALUE;

        for (int z : array) {
            if (z < x1) {
                x2 = x1;
                x1 = z;
            } else if (z < x2) {
                x2 = z;
            }
        }

        System.out.println("Minimal number is " + x1);

        return x2;
    }
}
