import java.util.Scanner;

class console {
    static void menu() {
        boolean running = true;

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

        while (running) {
            System.out.print("\n");
            System.out.println(message);
            System.out.println(menuOptions);

            choice = getSelection();
            switch (choice) {
                case 1:
                    convertDecimal();
                    break;
                case 2:
                    convertBinary();
                    break;
                case 3:
                    convertOctal();
                    break;
                case 4:
                    convertHexadecimal();
                    break;
                case 5:
                    System.out.println("Shutdown...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }

        }
    }

    private static int getSelection() {
        int choice = 0;
        Scanner in = new Scanner(System.in);
        try {
            choice = in.nextInt();
        }
        catch (Exception e) {
            // Not required?
        }
        return choice;
    }

    private static void convertDecimal() {
        System.out.println("Please enter decimal number: ");
        String number = String.valueOf(getSelection());
        System.out.println("Binary: " + convert.decimalToBinary(number));
        System.out.println("Octal: " + convert.decimalToOctal(number));
        System.out.println("Hexadecimal: " + convert.decimalToHexidecimal(number));
    }

    private static void convertBinary() {
        System.out.println("Please enter binary number: ");
        String number = String.valueOf(getSelection());
        String decimal = convert.binaryToDecimal(number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + convert.decimalToOctal(decimal));
        System.out.println("Hexadecimal: " + convert.decimalToHexidecimal(decimal ));
    }

    private static void convertOctal() {
        System.out.println("Please enter octal number: ");
        String number = String.valueOf(getSelection());
        String decimal = convert.octalToDecimal(number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + convert.decimalToBinary(decimal));
        System.out.println("Hexadecimal: " + convert.decimalToHexidecimal(decimal));
    }

    private static void convertHexadecimal() {
        System.out.println("Please enter hexadecimal number: ");
        String number = String.valueOf(getSelection());
        String decimal = convert.hexadecimalToDecimal(number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + convert.decimalToBinary(decimal));
        System.out.println("Octal: " + convert.decimalToOctal(decimal));

    }

    private static void math() {
        int a = 0;
        int b = 0;
        int c = a + b;
        int d = a * b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.printf("%d * %d = %d\n", a, b, d);
    }
}
