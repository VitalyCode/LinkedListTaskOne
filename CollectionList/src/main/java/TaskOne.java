import java.util.List;
import java.util.Scanner;

public class TaskOne {

    // Вывод команд
    public void programCommands(List<String> linkedList) {
        int counter = -1;
        System.out.println("\r\nВыберите операцию:");
        for (int i = 0; i < linkedList.size(); i++) {
            counter++;
            System.out.println(counter + ". " + linkedList.get(i));
        }
    }

    // Добавление задач
    public void addingCases(List<String> list, Scanner scanner) {
        System.out.print("\r\nВведите название задачи: ");
        String taskName = scanner.nextLine();
        list.add(taskName);
        System.out.println("Добавлено");
        outputOfTasks(list);
    }

    // Вывод всех дел:
    public void outputOfTasks(List<String> list) {
        System.out.println("\r\nВаш список дел:");
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            counter++;
            System.out.println(counter + ". " + list.get(i));
        }
    }

    // Удаление дела по номену:
    public void deletingACaseByNumber(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\r\nВведите номер для удаления: ");
            int number = scanner.nextInt() - 1;
            if (number < list.size()) {
                list.remove(number);
                System.out.println("Удалено!");
            } else {
                System.out.println("Такого номера дела нету!!!");
            }
        }
    }

    // Удаление по точному тексту
    public void deletingByText(List<String> list, Scanner scanner) {
        System.out.print("\r\nВведите задачу для удаления: ");
        String task = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(task)) {
                list.remove(i);
                System.out.println("Задача успешно удалена!");
            } else {
                System.out.println("Такой задачи нету");
            }
        }
    }
}
