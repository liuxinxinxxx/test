package com.itheima;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /**
         * 需求：
         * 唱歌比赛中，有6名评委给选手打分，分数范围是【0-100】之间的整数
         * 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分
         */
        //分析：
        //1.定义一个数组，用来存储66名评委的打分(0~100)
        int[] scoresArr = getScores();
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.println(scoresArr[i]);
        }
        //2.求出数组中的最大值
        int max = getMax(scoresArr);
        //3.求出数组中的最小值
        int min = getMin(scoresArr);
        //4.求出数组中6个分数的总和
        int sum = getSum(scoresArr);
        //5.(总和 - 最大值 - 最小值) /4
        int avg = (sum - max - min) / (scoresArr.length -2 );
        System.out.println("avg=" + avg);

    }

    public static int[] getScores() {
        //定义数组
        int[] scores = new int[6];
        //使用键盘录入的形式，输入分数0~100
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入评委的打分");
            int score = scanner.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，继续录入，当前的i为：" + i);
            }
        }
        return scores;
    }
    //求数组的最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }
    //求数组的最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    /**
     * 总和
     * @param scoreArr scoreArr
     * @return 数组
     */
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }
}
