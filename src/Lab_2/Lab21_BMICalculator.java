package Lab_2;
import java.util.Scanner;

public class Lab21_BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       this code is use to enter the input
        System.out.print("Input weight in kilogram: ");
        float weight = sc.nextFloat();
//        I use float because double is too much to use to calculate human weight
        System.out.print("\nInput height in meters: ");
        float height = sc.nextFloat();
//        I use float because double is too much to use to calculate human height
        float BMI = weight / (height * height);
//        BMI = weight / square of height
        System.out.print("\nYour Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}
