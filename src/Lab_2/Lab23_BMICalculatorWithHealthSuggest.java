package Lab_2;

import java.util.Scanner;

public class Lab23_BMICalculatorWithHealthSuggest {
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

        if (BMI < 18.5) {
            System.out.println("\nYou are underweight\nTry to gain some weight,it is good for you");
        } else if (BMI < 25) {
            System.out.println("\nYou are normal.\nIf you have discipline, drive, and determination… nothing is impossible");
        } else if (BMI < 30) {
            System.out.println("\nYou are overweight.\nTo change your body you must first change your mind");
        } else {
            System.out.println("\nYou are obese\nOnly You can change your life, no one can do it for you");
        }
    }
    }
