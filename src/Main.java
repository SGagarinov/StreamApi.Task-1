//Задача 1: Работа с числами

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Решение через коллекции
        List<Integer> input = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (Integer item : input) {
            if (item > 0) {
                if (item % 2 == 0) {
                    result.add(item);
                }
            }
        }

        Collections.sort(result);
        System.out.println("Решение через коллекции: " + result);

        //Решение через Stream
        StreamMain streamMain = new StreamMain(input);
        streamMain.main();
    }
}