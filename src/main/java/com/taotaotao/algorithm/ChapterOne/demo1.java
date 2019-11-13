package com.taotaotao.algorithm.ChapterOne;

/**
 * 基本操作执行次数  时间复杂度
 * O(1)<O(logn)<O(n)<O(n2)
 */
public class demo1 {
    /**
     * T(n)=3n,执行次数是线性的
     * @param n
     */
    void eat1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("吃1cm面包");
        }
    }

    /**
     * T(n)=5logn，执行次数是用对数计算的
     * @param n
     */
    void eat2(int n) {
        for (int i = n; i > 1; i/=2) {
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("吃一半面包");
        }
    }

    /**
     * T(n)=2 ,执行次数是常量
     * @param n
     */
    void eat3(int n){
        System.out.println("等待一分钟");
        System.out.println("吃一个鸡腿");
    }

    /**
     * T(n)=0.5n2+0.5n 多项式计算
     * @param n
     */
    void eat4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("等待一分钟");
            }
            System.out.println("吃1cm面包");
        }
    }
}
