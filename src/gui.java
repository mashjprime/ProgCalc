import java.util.Scanner;

public class gui {
    public static void menu() {
        boolean running = true;
        Scanner in = new Scanner(System.in);
        String message = "";
        String menuOptions = "";
        int choice;

        message += "Welcome to the programmer calculator";
        message += "\nPlease select option: ";

        menuOptions += "1. Convert Decimal";
        menuOptions += "\n2. Convert Binary";
        menuOptions += "\n3. Convert Octal";
        menuOptions += "\n4. Convert Hexadecimal";
        menuOptions += "\n5. Exit";

        while(running) {
            System.out.print("\n\n\n");
            System.out.println(message);
            System.out.println(menuOptions);
            choice = in.nextInt();

            switch(choice) {
                case 1:
                    convertDecimal();
                    break;
                case 2 :
                    convertBinary();
                    break;
                case 3 :
                    convertOctal();
                    break;
                case 4 :
                    convertHexadecimal();
                case 5 :
                    System.out.println("Shutdown...");
                    running = false;
                    break;
                default :
                    System.out.println("Invalid selection");
                    break;
            }

        }
    }

    public static void convertDecimal() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter decimal number: ");
        String number = in.nextLine();
        System.out.println("Binary: " + convert.decimalToBinary(number));
    }

    public static void convertBinary() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter binary number: ");
        String number = in.nextLine();
        System.out.println("Decimal: " + convert.binaryToDecimal(number));
    }

    public static void convertOctal() {
        // Method goes here
    }

    public static void convertHexadecimal() {
        // Method goes here
    }

    public static void math() {
        int a=0;
        int b=0;
        int c = a + b;
        int d = a * b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.printf("%d * %d = %d\n", a, b, d);
    }
}
