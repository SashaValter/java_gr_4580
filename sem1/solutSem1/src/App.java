import java.text.Format;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // task1();
        // task2();
        // task3();
        // task4();
        //hometask1()
        //hometask3();
        
    }

    private static void task1() {

        System.out.println("Hello, World!");

        // напишите программу, которая запросит пользователя ввести имя
        // и выведет сообщение "привет, <имя>!"
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = iScanner.nextLine();
        Depends(name);
        // System.out.println("Hello, " + name);
    }

    public static void Depends(String name) {
        LocalTime It = LocalTime.now();
        System.out.println(It);
        if (It.getHour() >= 18 && It.getHour() < 23) {
            System.out.printf("Good morning, %s!\n", name);
        } else if (It.getHour() >= 23 || It.getHour() < 5) {
            System.out.printf("Good night, %s!\\n", name);
        } else if (It.getHour() >= 5 || It.getHour() < 12) {
            System.out.printf("Good morning, %s!\n", name);
        } else if (It.getHour() >= 12 || It.getHour() < 18) {
            System.out.printf("Good morning, %s!\n", name);
        }
    }

    private static void task2() {
        // дан массив двоичных чисел,
        // вывести максимальное количество подряд идущих 1
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
            else {
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }
        }
        if (count > maxCount)
            maxCount = count;
        System.out.println(maxCount);
    }

    private static void task3() {
        // дан массив чиесле nums = (3,2,2,3) и число val = 3
        // Если в массиве есть числа, равные заданному, нужно
        // перенести эти элементы в конец массива
        int[] arr = { 1, 1, 0, 3, 1, 3, 0, 1, 0, 3 };
        int[] newArr = new int[arr.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 3) {
                newArr[index++] = arr[i];
            } else {
                count++;
            }
        }
        for (int i = arr.length - count; i < arr.length; i++) {
            newArr[i] = 3;
        }
        System.out.println(newArr);
    }

    // lines[1].substring(0,1) = "д"; lines[2].substring(0,2) = "дo";
    // lines[1].substring(2,2) = "мо";
    private static void task4() {
        String[] lines = { "dom", "domovoy", "domashnii" };
        // напишите метод, который находит самую длинную строку
        // общего префикса среди массива строк
        // Если общего префикса нет, вернуть пустую строку
        System.out.println(findPfx(lines));
    }

    private static int findPfx(String[] lines) {
        int res = 0;
        boolean pfxExist = true;
        while (pfxExist) {
            res++;
            for (int i = 0; i < lines.length - 1; i++) {
                if (res < lines[i].length() && res < lines[i + 1].length()) {
                    if (lines[i].substring(0, res).compareTo(lines[i + 1].substring(0, res)) != 0) {
                        res--;
                        pfxExist = false;
                        break;
                    }
                } else {
                    res--;
                    pfxExist = false;
                    break;
                }
            }

        }
        return res;
    }
    private static void hometask1(){
        // выведите сумму чисел от одного до n
        System.out.println(findSum(5));
    }
    private static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    private static void hometask2(){
    // найти является ли число 
    System.out.println(primeTest(3));
   }
    private static boolean primeTest (int num){
        boolean res = true;
        for (int i=2; i<1000; i++){
        if (num>= i&& num%i==0){
            if(i!=num){
            res = false;
            break;
        }
        }
    return res;
    }
}

public static void hometask3() {

        /*
         * 3) Реализовать простой калькулятор
         */

        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter the first number of the equation: ");
        Integer numer1 = iScanner.nextInt();
        Integer action = 0, result = 0;
        boolean flag = true;

        while (flag) {
            System.out.print("1. +\n" +
                    "2. -\n" +
                    "3. *\n" +
                    "4. /\n" +
                    "Select an action: ");
            Integer сhoice = iScanner.nextInt();
            switch (сhoice) {
                case 1:
                    action = 1;
                    flag = false;
                    break;
                case 2:
                    action = 2;
                    flag = false;
                    break;
                case 3:
                    action = 3;
                    flag = false;
                    break;
                case 4:
                    action = 4;
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect number entered, try again.");
            }
        }

        System.out.print("Enter the second number of the equation: ");
        Integer numer2 = iScanner.nextInt();

        switch (action) {
            case 1:
                System.out.println(numer1 + " + " + numer2 + " = " + (numer1 + numer2));
                break;
            case 2:
                System.out.println(numer1 + " - " + numer2 + " = " + (numer1 - numer2));
                break;
            case 3:
                System.out.println(numer1 + " * " + numer2 + " = " + (numer1 * numer2));
                break;
            case 4:
                System.out.println(numer1 + " / " + numer2 + " = " + (numer1 / numer2));
                break;
        }

    }
}