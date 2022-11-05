package refactor2;

public class Take3VariablesofGeneric <T extends Comparable<T>>{
    public T x,y,z;


    public Take3VariablesofGeneric(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static  <T extends Comparable<T>> T findMax(T x,T y, T z) {
        T max = x;

        if(y.compareTo(max)> 0) {
            max = y;
        }
        if(z.compareTo(max)>0) {
            max = z;
        }

        return max;
    }
    public void testMax() {
        T maxVal = findMax(x,y,z);
        System.out.println("Max is " +maxVal);
    }


    public static void main(String[] args) {
        Take3VariablesofGeneric<Integer> iInt = new Take3VariablesofGeneric<Integer>(20, 10, 30);  //declare value
        Take3VariablesofGeneric<String> sString = new Take3VariablesofGeneric<String>("Apple", "Banana", "Papaya"); //declare value
        Take3VariablesofGeneric<Float> ffloat = new Take3VariablesofGeneric<Float>(20.1f, 10.3f, 30.4f); //declare value


        //calling generic method for all values
        iInt.testMax();
        sString.testMax();
        ffloat.testMax();
    }

}
