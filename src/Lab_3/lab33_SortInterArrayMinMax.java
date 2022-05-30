package Lab_3;
import java.util.Arrays;

public class lab33_SortInterArrayMinMax {
    public static void main(String[] args) {
        int[] intArr = { 12, 34, 1, 16, 28 };
        var temp = 0;
            for (int i = 0; i < intArr.length; i++) {
                for (int j = i + 1; j < intArr.length; j++) {
                    if (intArr[i] > intArr[j]) {
                        temp = intArr[j];
                        intArr[j] = intArr[i];
                        intArr[i] = temp;
                }
            }
        }
        System.out.println("The array sort from mix to max is: " + Arrays.toString(intArr));

    }
}