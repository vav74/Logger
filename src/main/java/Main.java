import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        int n;
        int m;
        int f;
        List<Integer> list = new ArrayList<>();
        Filter filter;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка:");
        String input = scanner.nextLine();
        n = Integer.parseInt(input);
        System.out.print("Введите верхнюю границу для значений:");
        input = scanner.nextLine();
        m = Integer.parseInt(input);
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список:" + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра:");
        input = scanner.nextLine();
        f = Integer.parseInt(input);
        filter = new Filter(f);
        list = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список:" + list);
        logger.log("Завершаем программу");
    }
}