public class convert {

    public static String binaryToDecimal(String input) {
        int[] binary = utility.stringToIntArray(input);
        int decimal = 0;
        int exp = 0;
        for (int i = binary.length-1; i>=0; i--) {
            decimal += (binary[i] * Math.pow(2, exp));
            exp++;
        }
        return String.valueOf(decimal);
    }

    public static String decimalToBinary(String input) {
        int decimal = Integer.parseInt(input);
        int[] binary = new int[32];
        int i = 0;
        while(decimal != 0) {
            
            binary[i] = decimal%2;
            decimal /= 2;
            i++;
        }
        utility.reverseIntArray(binary);
        int output = Integer.parseInt(utility.intArrayToString(binary));
        return output + "";
    }
}
