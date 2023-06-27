package Solution;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Hometask2 {
    /*
     * Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    static ArrayList<Integer> randomNumbers = new ArrayList<Integer>();

    public static void deleteNum(String[] args) {
        createArrayList(randomNumbers);
        System.out.println("new ArrayList: " + randomNumbers);
        removingEvenNumbers(randomNumbers);
        System.out.println("changed ArrayList: " + randomNumbers);
    }

    // Removes all even values from the List
    public static void removingEvenNumbers(ArrayList<Integer> randomNumbers) {
        randomNumbers.removeIf(value -> value % 2 == 0);

    }

    // Creates a List of random numbers
    public static void createArrayList(ArrayList<Integer> randomNumbers) {
        Random rnd = new Random();
        int choise = 0;
        int[] parametersArray = fillingArrayParameters(); /*
                                                           * 0 - array length
                                                           * 1 - the minimum value of the array
                                                           * 2 - the maximum value of the array
                                                           */
        for (int i = 0; i < parametersArray[0]; i++) {
            if ((choise = rnd.nextInt(parametersArray[2]) + 1) > parametersArray[1] - 1) {
                randomNumbers.add(choise);
            } else {
                i--;
            }
        }
    }

    // This method creates an array of numbers that contains the length, minimum and
    // maximum values for creating arrays
    public static int[] fillingArrayParameters() {
        Scanner iScanner = new Scanner(System.in);
        int[] result = new int[3];
        int index = 0;
        boolean flag = true;
        while (flag) {
            try {
                String text = "";
                switch (index) {
                    case 0:
                        System.out.print("Enter the length of the array: ");
                        text = iScanner.next();
                        result[index] = Integer.parseInt(text);
                        index++;
                    case 1:
                        System.out.print("Enter the min of the array: ");
                        text = iScanner.next();
                        result[index] = Integer.parseInt(text);
                        index++;
                    case 2:
                        System.out.print("Enter the max of the array: ");
                        text = iScanner.next();
                        result[index] = Integer.parseInt(text);
                        index++;
                    default:
                        flag = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Try again");
            }
        }

        return result;
    }
}
