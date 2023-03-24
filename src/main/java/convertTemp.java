import java.util.Scanner;

public class convertTemp {
    public static void main(String[] args) {
        double faherit,celcius;
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");

            choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Celsius Temperature");
                    celcius = sc.nextDouble();
                    System.out.printf("The Fahrenheit is %f", converF(celcius));
                }
                case 2 -> {
                    System.out.println("Enter Fahrenheit Temperature");
                    faherit = sc.nextDouble();
                    System.out.printf("The Celsius is %f", converC(faherit));
                }
                case 0 -> System.exit(0);
            }
        } while (choice!=0);
    }
    public static double converF(double c) {
        double f=(9.0/5)*c+32;
        return f;
    }
    public static double converC(double f) {
        double c=(5.0/9)*(f-32);
        return  c;
    }

}
