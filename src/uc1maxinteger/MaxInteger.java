package uc1maxinteger;

public class MaxInteger {
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
        Integer x = 10, y = 20, z= 30;
        findMax(x, y, z);

    }
}
