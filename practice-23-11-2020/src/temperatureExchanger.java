import java.util.Scanner;

public class temperatureExchanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempF;
        double tempC;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double ctoF(double tempC){
        double tempF = (9.0 / 5) * tempC + 32;
        return tempF;
    }
    public static double ftoC(double tempF){
        double tempC  = (5.0 / 9) * (tempF - 32);
        return tempC;
    }
}
