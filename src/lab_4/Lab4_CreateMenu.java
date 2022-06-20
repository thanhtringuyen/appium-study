package Lab_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab4_CreateMenu {

    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>(Arrays.asList(2, 4, 1, 6, 13, 11, 9));

        printMenu();
        boolean isContinuing = true;
        while (isContinuing) {
            int option = generateOptipon();
            switch (option) {
                case 1:
                    addNumber(myArrayList);
                    break;
                case 2:
                    printNumbers(myArrayList);
                    break;
                case 3:
                    getMax(myArrayList);
                    break;
                case 4:
                    getMin(myArrayList);
                    break;
                case 5:
                    getIndex(myArrayList);
                    break;
                default:
                    isContinuing = false;
                    return;
            }
        }
    }


    private static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Input a number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get the maximum number");
        System.out.println("4. Get the minimum number");
        System.out.println("5. Print index of number in the ArrayList ");
        System.out.println("6. Exit");
    }

    private static int generateOptipon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an opton: ");
        return scanner.nextInt();
    }

    private static void addNumber(List<Integer> myArrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you would like to add: ");
            int number = sc.nextInt();
            myArrayList.add(number);
    }

    private static void printNumbers(List<Integer> myArrayList) {
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.print("\n");
    }

    private static void getMax(List<Integer> myArrayList) {
        int max = myArrayList.get(0);
        for (int element : myArrayList) {
            if (element > max || element == max) {
                max = element;
            }
        }
        System.out.println("The maximum number in the array is: " + max);
    }

    private static void getMin(List<Integer> myArrayList) {
        int min = myArrayList.get(0);
        for (int element : myArrayList) {
            if (element < min || element == min) {
                min = element;
            }
        }
        System.out.println("The minimum number in the array is: " + min);
    }

    private static void getIndex(List<Integer> myArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number  : ");
        int number = scanner.nextInt();
        if (myArrayList.contains(number) == true) {
            System.out.println("Index of number  : ");
            for (int index = 1; index <= myArrayList.size(); index++) {
                if (myArrayList.get(index - 1) == number) {
                    System.out.print(index + "\t");
                }
            }
            System.out.print("\n");
        } else {
            System.out.println("Nothing here ! Are you sure you enter the correct number ?");
        }
    }

}
