import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TasksForHomework3 {
    public static void main(String[] args) {
        Random random = new Random();
        int lstLength = ThreadLocalRandom.current().nextInt(10, 21);
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < lstLength; i++) {
            lst.add(random.nextInt(100));
        }
        System.out.println("Начальный список:");
        System.out.println(lst);

        Iterator<Integer> iter = lst.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
        System.out.println("Список без четных чисел:");
        System.out.println(lst);

        lst.sort(Comparator.naturalOrder());
        System.out.println("Минимальное значение в списке = " + lst.get(0));
        System.out.println("Максимальное значение в списке = " + lst.get(lst.size() - 1));

        int sum = 0;
        iter = lst.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.printf("Среднее значение в списке = %.2f\n", (double) sum / (double) lst.size());
    }
}