package uc3maxstring;

public class MaxString {
    public static void findMax(String[] arr) {
        String max=" ";
        for (int i=0; i<arr.length;i++) {
            int a = arr[i].compareTo(max);
            if (a > 0)
            {
                max= arr[i];
            }
        }
        System.out.println("max string is " +max);
    }


    public static void main(String[] args) {

        String sArr1[] = {"Apple" , "Watermelon" , "Banana"};
        String sArr2[] = {"Apple","Banana","Papaya"};
        String sString[] = {"Ansari", "university","Pawan"};
        findMax(sString);
        findMax(sArr1);
        findMax(sArr2);
    }
}
