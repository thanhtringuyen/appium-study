package lab_6;

public class Lab_6_1 {
    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        String hour = time.substring(0,1);
        String minute = time.substring(9,10);

        int minutes = (Integer.parseInt(hour) * 60) + Integer.parseInt(minute);
        System.out.println("There are total: " + minutes + " minutes");
    }
}