package com.lly.single;

/**
 * 静态内部类实现
 */
public class Holer {

    private Holer() {

    }

    public static class Inner {
        private static final Holer holer = new Holer();
    }

    public static Holer getIns() {
        return Inner.holer;
    }
}
