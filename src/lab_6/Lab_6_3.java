package Lab_6;

public class Lab_6_3 {
    public static void main(String[] args) {
        String inputStr = "100 minutes 234 seconds";
        String outputStr = "";
        for (char character : inputStr.toCharArray())
        {
            if (Character.isDigit(character))
            {
                outputStr += character;
            }
        }
        System.out.println(outputStr);
    }
}
