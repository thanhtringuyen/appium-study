package Lab_3;

public class lab31_CountOddEvenInArray {
    public static void main(String[] args)
    {
        int[] intArr = {1, 2, 3, 4, 5};
        int n = intArr.length;
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i < intArr.length; i++) {
//          checking if a number is odd or even
//          increase odd count if divisible to 2 = 1
//          else increase even count
            if ((intArr[i] % 2 ) == 1)
                odd_count++;
            else
                even_count++;
        }
        System.out.println("There are a total of " + even_count + " even numbers in the array");
        System.out.println("There are a total of " + odd_count + " odd numbers in the array");
    }
}
