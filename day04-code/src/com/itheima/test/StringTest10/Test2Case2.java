package com.itheima.test.StringTest10;

public class Test2Case2 {
    public static void main(String[] args) {
        /**
         * 给定两个字符串，A和B
         * A的旋转操作就是将A最左边的字符移动到最右边
         * 例如：若A='abcde'，在移动一次之后结果就是'bcdea'
         * 如果在若干次调整操作之后，A能变成B，那么返回True
         * 如果不能匹配成功，则返回false
         */
        //1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";
        //2.调用方法进行比较
        strA = rorate(strA);

        //3.输出
        boolean result = check(strA, strB);
        System.out.println(result);
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rorate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String rorate(String str) {
        //套路：
        //如果我们看到要修改字符串的内容
        //可以有两个办法：
        //1.用substring进行截取，把左边的字符截取出来拼接到右侧去
        //2.可以把字符串先变成一个字符数据，然后调整字符数组里面的数据，最后再把字符数组变成字符串

        //可以把字符串先变成一个字符数据，然后调整字符数组里面的数据，最后再把字符数组变成字符串
        char[] arr = str.toCharArray();
        //拿到0索引上的字符
        char first = arr[0];
        //把剩余的字符依次往前挪一个位置
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //把原来0索引上的字符放到最后一个索引
        arr[arr.length - 1] = first;
        //利用字符数组创建一个字符串对象
        String result = new String(arr);
        return result;
    }
}
