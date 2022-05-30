package Lab_3;

public class lab32_FindingMaximumMinimumInArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            } else if (intArr[i] < min) {
                min = intArr[i];
                }
            }
            System.out.println("The maximum value from the array is : " + max);
            System.out.println("The minimum value from the array is : " + min);
        }
    }