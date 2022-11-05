package uc2maxfloat;

public class MaxFloat {
    public static <T extends Comparable<T>> void findMax(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max)>0) {
            max = z;
        }
        //print max
        System.out.println("Max number is " +max);
    }
    public static void main(String []args) {
        Double x = 10.10, y = 20.20, z= 20.30;
        findMax(x, y, z);
    }
}
