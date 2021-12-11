package skypro;

import java.util.*;

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
        List<Integer> numsCopy = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                if (!numsCopy.contains(num)) {
                    numsCopy.add(num);
                }
            }
        }
        for (Integer integer : numsCopy) {
            System.out.println(integer);
        }

        System.out.println("------------------------");
        System.out.println("Задание №3");
        String text = "порядок слов порядок слов не важен не важен порядок вот";
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(text.split(" ")));
        System.out.println("Вывожу уникальные слова которые не повторялись  ");
        Set<String> unWords = new LinkedHashSet<>(strings);
        List<String> dupWords = new ArrayList<>(strings);
        for (String str : unWords) {
            dupWords.remove(str);
        }
        unWords.removeAll(dupWords);
        System.out.println(unWords);

        System.out.println("------------------------");
        System.out.println("Задание №4");
        System.out.println("Вывожу количество слов в дублях");
        System.out.println(strings.size() - unWords.size());
    }

}