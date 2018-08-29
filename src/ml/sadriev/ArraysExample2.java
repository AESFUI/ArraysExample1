package ml.sadriev;

import java.util.Arrays;

import static ml.sadriev.Utils.fillArray;

/**
 * An instance of this class is used to solve of problem
 * from @see <a href="https://habr.com/company/alconost/blog/419685">
 * Важнейшие структуры данных, которые вам следует знать к своему собеседованию по программированию</a> }
 *
 * @author vierdas@gmail.com
 * @since 1.0
 */
public class ArraysExample2 {
    public static void main(String[] args) {
        int[] array = fillArray(); //добавить параметр размера массива при генерации

        System.out.println("First array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        int[] array2 = nonRepetableNumbers(array);

        System.out.println();

        System.out.println("Second array:");
        for (int number : array2) {
            System.out.print(number + " ");
        }
    }

    /**
     * Должно на выход давать массив из неповторяющихся чисел из входного массива:
     * числа, встречающиеся один раз
     * 1) Сортируем массив
     * 2) итерируем
     * 3) берём очередное число
     * 4) если следующее != 3), то добавляем в результирующий массив
     * 5) если следующее = 3), то итерируем до нового числа
     * 6) пункт 3
     *
     * @param array
     * @return
     */
    private static int[] nonRepetableNumbers(int[] array) {
        Arrays.sort(array);

        int[] array2 = new int[array.length];

        System.out.println("First array after sorting:");
        for (int number : array) {
            System.out.print(number + " ");
        }

        int index = 0;
        int index2 = 0;

        boolean flag = false;

        while (index < array.length - 1) {
            if (array[index] != array[index + 1]) {
                array2[index2++] = array[index++];
            } else {
                int z = array[index++];

                while (index <= array.length - 1) {
                    if (z == array[index]) {
                        if (++index == array.length) {
                            flag = true;
                            index2--;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        if (!flag) {
            array2[index2] = array[index];
        }

        return Arrays.copyOfRange(array2, 0, index2 + 1);
    }
}
