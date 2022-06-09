package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4_CreateMenu {
    public static void main(String[] options){
        printMenu();
        int position = 0;
        boolean isSelectValue = true;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> myArrayList = new ArrayList<>();
        do {
            System.out.print("\n Please input a number to select: ");
            switch (getUserValue()) {
                case 1:
                    System.out.print("Add a value for Array List: ");
                    myArrayList = addArrayList(arrayList, getUserValue());
                    System.out.print("Add another value for Array List: ");
                    myArrayList = addArrayList(arrayList, getUserValue());
                    break;
                case 2:
                    System.out.println("Your ArrayList: ");
                    printNumber(myArrayList);
                    break;
                case 3:
                    System.out.println("Maximum Number: " + getMaxNumber(myArrayList));
                    break;
                case 4:
                    System.out.println("Minimum Number: " + getMinNumber(myArrayList));
                    break;
                case 5:
                    System.out.print("Input a number to search: ");
                    position = searchNumberArrayList(arrayList, getUserValue());
                    if (position != -1)
                        System.out.println("The position in ArrayList of inputted number is: " + position);
                    else System.out.println("No item found.");
                    break;
                default:
                    System.out.println("Please select a number from 1-4!");
                    isSelectValue = false;
            }
        } while (isSelectValue);
    }

    public static int getUserValue() {
        Scanner scanner = new Scanner(System.in);
        int getUserNumber = scanner.nextInt();
        return getUserNumber;
    }

    public static void printMenu() {
        System.out.print("1. Add number into ArrayList\n" +
                "2. Print numbers\n" +
                "3. Get maximum number\n" +
                "4. Get minimum number\n" +
                "5. Search a number\n");
    }

    public static List<Integer> addArrayList(List<Integer> arrayList, int number) {
        arrayList.add(number);
        // if (arrayList == null) return -1;
        return arrayList;
    }

    public static void printNumber(List<Integer> arrayList) {
        for (int index = 0; index < arrayList.size(); index++) {
            System.out.print(arrayList.get(index) + "   ");
        }
    }

    public static int getMaxNumber(List<Integer> arrayList) {
        int maxNumber = 0;
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) > maxNumber) {
                maxNumber = arrayList.get(index);
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(List<Integer> arrayList) {
        int minNumber = arrayList.get(0);
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) < minNumber) {
                minNumber = arrayList.get(index);
            }
        }
        return minNumber;
    }

    public static int searchNumberArrayList(List<Integer> arrayList, int searchNumber) {
        int temp = -1;
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) == searchNumber) {
                temp = index;
            }
        } return temp;
    }
}