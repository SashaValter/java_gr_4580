import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // task1.execute();
        // task2();
        // task3();
        //task4.writeTestToFile(100);
        //task5();
        //hometask1();
        hometask2();
    }

    private static void task2() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String line = iScanner.nextLine();
        if (line.isEmpty()) {
            System.out.println("Введена пустая строка!");
        } else {
            String result = task2.compressLineWithoutLoss(line);
            System.out.println(result);
        }
    }

    private static void task3() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = iScanner.nextLine();
        if (line.length() > 0) {
            boolean result = task3.сheckPolydrome(line);
            System.out.println(result);
        } else {
            System.out.println("Введена пустая строка!");
        }
    }

    private static void task5() {
        try {
            String[] fldrCnt = task5.getCrntFldrCnts();
            task5.wrtArrToFile(fldrCnt, "filenames.txt");
            task5.dtrmFileExts(fldrCnt);
        } catch (IOException e) {
            task5.wrtExcptToLogFile(e, "log.txt");
        }
    }

       private static void hometask1() {
        hometask1.sqlQuery();
    }
    private static void hometask2() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] sortArr = new int[iScanner.nextInt()];
        boolean flag = true;

        while (flag) {
            System.out.print("1. test\n" +
                    "2. random\n" +
                    "Выберите как будете проходить задание: ");

            String choice = iScanner.next();
            switch (choice) {
                case "1":
                    for (int i = 0; i < sortArr.length; i++) {
                        sortArr[i] = sortArr.length - i;
                    }
                    flag = false;
                    break;
                case "2":
                    sortArr = hometask2.createArray(sortArr.length);
                    flag = false;
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
        }

        System.out.print("Изначальный массив: ");
        hometask2.printArray(sortArr);

        System.out.println();

        System.out.print("Сортированный массив: ");
        sortArr = hometask2.bubbleSort(sortArr);
        hometask2.printArray(sortArr);

    }
}