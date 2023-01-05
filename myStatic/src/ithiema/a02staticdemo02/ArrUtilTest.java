package ithiema.a02staticdemo02;

public class ArrUtilTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.2, 2.4, 4.7, 3.7, 5.2};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
