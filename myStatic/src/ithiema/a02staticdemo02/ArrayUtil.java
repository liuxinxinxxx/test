package ithiema.a02staticdemo02;

public class ArrayUtil {

    /**
     * 遍历数据
     * @param arr 数组
     * @return [1, 2, 3, 4, 5]
     */
    public static String printArr(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuilder.append(arr[i]);
            } else {
                stringBuilder.append(arr[i]).append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString(); // [1, 2, 3, 4, 5]
    }

    /**
     * 计算平均分
     * @param arr 数组
     * @return 平均分
     */
    public static double getAverage(double[] arr) {
        double sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;  //3.44
    }
}
