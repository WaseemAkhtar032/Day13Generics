package uc5printmax;

public class PrintMax<T extends Comparable<T>> {

    public T x, y, z;

    // Paramerterized Constructor
    public PrintMax(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Generic Method to find Max values
    public static <T extends Comparable<T>> T findMax(T... arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        // Internally called printMax method
        printMax(max);
        return max;
    }

    // method to get value
    // Extended max method to print max
    public static <T> void printMax(T maxVal) {
        System.out.println("Max is " + maxVal);
    }

    public static void main(String[] args) {
        Integer intArr[] = {10, 22, 20, 30}; //declare integer array value
        String strArr[] = {"Deven" ,"Aakash", "Ganseh" }; //declare String array value
        Float floatArr[] = {10.2f, 2.1f, 30.4f};  //declare float array value

        //calling generic method for all values
        findMax(intArr);
        findMax(strArr);
        findMax(floatArr);
    }

}