public class utility {

    public static int[] stringToIntArray(String input) {
        String[] stringArray = input.split("");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String numberAsString = stringArray[i];
            intArray[i] = Integer.parseInt(numberAsString);
        }
        return intArray;
    }

    public static String intArrayToString(int[] input) {
        StringBuilder result = new StringBuilder();
        for(int number:input) {
            result.append(number);
        }
        return result.toString();
    }

    public static int[] reverseIntArray(int[] input) {
        for(int i=0; i<input.length/2; i++){
            int temp = input[i];
            input[i] = input[input.length -i -1];
            input[input.length -i -1] = temp;
        }
        return input;
    }
}
