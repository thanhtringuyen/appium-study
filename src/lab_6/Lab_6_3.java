package lab_6;

public class Lab_6_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes 234 seconds";

        for (char digit : myStr.toCharArray())
        {
            if (Character.isDigit(digit))
            {
                System.out.print(digit);
            }
        }

    }
}