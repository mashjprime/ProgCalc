public class convert {

    public static String binaryToDecimal(String input) {
        int[] binary = utility.stringToIntArray(input);
        int decimal = 0;
        int exp = 0;
        for (int i = binary.length - 1; i >= 0; i--) {
            decimal += (binary[i] * Math.pow(2, exp));
            exp++;
        }
        return String.valueOf(decimal);
    }

    public static String decimalToBinary(String input) {
        int decimal = Integer.parseInt(input);
        int[] binary = new int[64];
        int i = 0;
        while (decimal != 0) {

            binary[i] = decimal % 2;
            decimal /= 2;
            i++;
        }
        utility.reverseIntArray(binary);
        String output = utility.intArrayToString(binary);
        output = output.replaceFirst("^0+(?!$)", "");
        return output;
    }

    public static String octalToDecimal(String input) {
        int[] octal = utility.stringToIntArray(input);
        int decimal = 0;
        int exp = 0;
        for (int i = octal.length - 1; i >= 0; i--) {
            decimal += (octal[i] * Math.pow(8, exp));
            exp++;
        }
        return String.valueOf(decimal);
    }

    public static String hexadecimalToDecimal(String input) {
        String digits = "0123456789ABCDEF";
        input = input.toUpperCase();
        int val = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return String.valueOf(val);
    }

    public static String decimalToHexidecimal(String input) {
        int decimal = Integer.parseInt(input);
        int rem;
        String output = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (decimal > 0) {
            rem = decimal % 16;
            output = hex[rem] + output;
            decimal = decimal / 16;
        }
        return String.valueOf(output);
    }

    public static String decimalToOctal(String input) {
        int dec_num = Integer.parseInt(input);
        int rem, quot, i = 1, j;
        int oct_num[] = new int[100];
        String result = "";
        quot = dec_num;
        while (quot != 0) {
            oct_num[i++] = quot % 8;
            quot = quot / 8;
        }

        for (j = i - 1; j > 0; j--) {
            result += (oct_num[j]);
        }
        return result;
    }
}

