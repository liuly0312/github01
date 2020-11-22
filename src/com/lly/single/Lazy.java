package com.lly.single;

public class Lazy {
    /**
     * 懒汉式
     */
    private Lazy() {

    }

    private volatile static Lazy lazy;

    private static Lazy getIns() {

        if (null == lazy) {
            lazy = new Lazy();
        }
        return lazy;
    }

    //DCL懒汉式
    private static Lazy getDCLIns() {
        if (null == lazy) {
            synchronized (Lazy.class) {
                if (null == lazy) {
                    lazy = new Lazy();//不是一个原子性操作.
                    /**
                     * 分配内存空间
                     * 执行构造方法，初始化对象
                     * 把这个对象指向这个空间
                     */
                }
            }
        }
        return lazy; // 所以必须加volatile
    }

    /**
     * 缺点：单线程没问题，多线程有问题.
     */
}
