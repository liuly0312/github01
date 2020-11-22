package com.lly.single;

public class Hungry {

    /**
     * 饿汉式单例
     */
    private Hungry() {

    }

    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

    /**
     * 缺点：
     * 浪费内存：
     */
}
