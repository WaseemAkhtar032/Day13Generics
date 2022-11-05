package refactor1;
class refact<T extends Comparable<T>> { // class refact Comparable class
    T[] arr;

    refact(T[] o) { //constructor
        arr = o;
    }
    public T max() { //max method to find
        T max = arr[0];  // assign max to arr[0]
        for (int i = 1; i < arr.length; i++)
            if (arr[i].compareTo(max) > 0) //compare for max
                max = arr[i]; //assign max
        return max;
    }

    public static void main(String args[]) {
        Integer iNum[] = { 10, 2, 5};   // values to find max integer
        String sString[] = { "Deven", "Pawan", "Akash" };    // values to find max String
        Double ffloat[] = { 20.2, 45.4, 71.6};     // values to find max Float
        refact<Integer> iobj = new refact<Integer>(iNum);  //object for Integer
        refact<String> sobj = new refact<String>(sString); //object for String
        refact<Double> fobj = new refact<Double>(ffloat);  //object for float

        System.out.println("Max value in inums: " + iobj.max()); //print max integer
        System.out.println("Max value in chs: " + sobj.max());   //print max String
        System.out.println("Max value in chs: " + fobj.max());   //print max Float

    }
}