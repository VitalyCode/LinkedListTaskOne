import java.text.ParsePosition;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //=================================
        List<String> listOfCommands = new LinkedList<>(); // Список команд
        listOfCommands.add("Выход из программы");
        listOfCommands.add("Добавить дело");
        listOfCommands.add("Показать дела");
        listOfCommands.add("Удалить дело по номеру");
        listOfCommands.add("Удалить дело по названию");
        TaskOne taskOne = new TaskOne();

        boolean programOperation = true;
        Scanner scanner = new Scanner(System.in);
        List<String> taskBasket = new LinkedList<>(); // Коризина задач
        while (programOperation) {
            taskOne.programCommands(listOfCommands);
            String scanResult = scanner.nextLine();
            System.out.print("Ваш выбор: " + scanResult);
            if (scanResult.equals("0")) {
                System.out.println("\r\nПрограмма завершена");
                programOperation = false;
            }

            switch (scanResult) {
                case "1":
                    System.out.println();
                    taskOne.addingCases(taskBasket, scanner);
                    break;
                case "2":
                    System.out.println();
                    taskOne.outputOfTasks(taskBasket);
                    break;
                case "3":
                    System.out.println();
                    taskOne.deletingACaseByNumber(taskBasket);
                    break;
                case "4":
                    System.out.println();
                    taskOne.deletingByText(taskBasket, scanner);
                    break;
                default:
                    try {
                        throw new IncorrectNumber("\r\nОшибка такого номера нет");
                    } catch (IncorrectNumber ex) {
                        System.out.println(ex.getMessage());
                    }

            }
        }
    }
}
