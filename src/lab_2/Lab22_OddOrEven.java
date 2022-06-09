package lab_2;
import java.util.Scanner;
public class Lab22_OddOrEven {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please input a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println("Your input number " + num + " is an even number");
        else
            System.out.println("Your input number " + num + " is an odd number");
    }
}
