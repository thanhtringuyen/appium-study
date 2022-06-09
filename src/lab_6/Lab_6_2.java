package lab_6;

import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";

        for (int inputAttempts = 0; inputAttempts < 3; inputAttempts++) {
            System.out.print("Please Enter Your Password: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if ((inputPass.equals(myPassword))) {
                System.out.println("Congratulations! Welcome!!!");
                break;
            } else {
                if (inputAttempts < 2) {
                    System.out.println("You have entered a wrong password. Please Try Again");
                } else {
                    System.out.println("Access Denied");
                }
            }
        }
    }
}
