package Lab_2;

import java.util.Scanner;

public class Lab23_BMICalculatorWithHealthSuggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        float weight = sc.nextFloat();
        System.out.print("\nInput height in meters: ");
        float height = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}
