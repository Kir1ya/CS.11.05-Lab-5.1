import java.sql.SQLOutput;

public class ArrayUtility {

    public static void print(int[] array) {
        for (int num : array) {
            System.out.println(num + ", ");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        String output = String.valueOf(average);
        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == '.') {
                if (i + 3 > output.length() - 1) {
                    output = output.substring(0, i + 2);
                } else {
                    output = output.substring(0, i + 3);
                }
                break;
            }
        }
        double returnSum = Double.parseDouble(output);
        return returnSum;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int reverse2 = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = reverse2;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int search : array) {
            if (search == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String search : array) {
            if (search.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        if (array == null) {
            return "";
        }
        String output = "";
        for (int i = 0; i < array.length - 1; i++) {
            output += array[i] + ", ";
        }
        output += array[array.length - 1];
        return output;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int lastIndex = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastIndex;
    }

    public static void shiftLeft(int[] array) {
        int firstIndex = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstIndex;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastIndex = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastIndex;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int firstIndex = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstIndex;
        }
    }
}