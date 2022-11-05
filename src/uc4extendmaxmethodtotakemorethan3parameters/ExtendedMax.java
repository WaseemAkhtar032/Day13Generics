package uc4extendmaxmethodtotakemorethan3parameters;

class ExtendedMax<T extends Comparable<T>> {
    T arr[];

    public ExtendedMax(T[] o) {
        arr = o;
    }

    public T max() {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }




    public static void main(String[] args) {
        Integer iNum[] = {10, 2, 5, 20};   // values to find max integer
        String sString[] = {"Deven", "Pawan", "Akash", "Rakesh"};    // values to find max String
        Double ffloat[] = {20.2, 45.4, 71.6, 50.4};     // values to find max Float
        ExtendedMax<Integer> iobj = new ExtendedMax<Integer>(iNum);  //object for Integer
        ExtendedMax<String> sobj = new ExtendedMax<String>(sString); //object for String
        ExtendedMax<Double> fobj = new ExtendedMax<Double>(ffloat);  //object for float

        System.out.println("Max value in Integer: " + iobj.max()); //print max integer
        System.out.println("Max value in String: " + sobj.max());   //print max String
        System.out.println("Max value in Float: " + fobj.max());   //print max Float


    }
}
