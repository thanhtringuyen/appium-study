package lab_6;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab_6_4 {
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Please choose one option: ");
    }

    public static String[] options = {
            "1- Check http or https ",
            "2- Check domain name",
            "3- Check .com or . net",
    };

    public static void main(String[] args) {
        String url = "https://google.net";
        System.out.println("Your URL is: " + url);
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=4){
            printMenu(options);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("The prefix of your URL is: " + checkHttp(url));
                    break;
                case 2:
                    System.out.println("The domain of your URL is: " + checkDomainName(url));
                    break;
                case 3:
                    System.out.println("The top-level domain of your URL is: " + checkTLD(url));

                    break;
                default:
                    System.out.println("Your option is invalid");

            }

        }
    }




    public static String checkHttp(String url){
        String[] prefix = url.split("://");
        return prefix[0];
    }

    public static String checkDomainName(String url){
        String[] result = url.split("://");
        String sub_url = result[1];
        String postfix = url.substring((url.length()-4), url.length());
        String domain = sub_url.replace(postfix, "");
        return domain;
    }

    public static String checkTLD(String url){
        String TLD = url.substring((url.length()-4), url.length());
        return TLD;
    }

}