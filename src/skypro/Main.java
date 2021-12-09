package skypro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Вывожу четные числа");

        for (Integer i : nums) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("------------------------");
        System.out.println("Вывожу четные числа без повторов по возрастанию");

        nums.sort(Comparator.naturalOrder());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                for (Integer num : nums) {
                    if (!(nums.get(i).equals(num))) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("Задание №3/4");
        String text = "порядок слов порядок слов не важен не важен порядок вот";
        System.out.println("Текст: " + text);

        ArrayList<String> strings = new ArrayList<>(Arrays.asList(text.split(" ")));

        int count = 0;
        for (int i = 0; i < strings.size(); i++) {
            for (int i1 = strings.size() - 1; i1 > i; i1--) {

                if (strings.get(i).equals(strings.get(i1))) {
                    strings.remove(i1);
                    count++;
                }
            }
            System.out.println(strings.get(i));
        }
        System.out.println("Количество дублей " + count);
    }
}