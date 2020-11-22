package com.lly.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 枚举
 * 本身也是一个class类.
 *
 */
public enum EnumSingle {

    INSTANCE;
    public  EnumSingle getInstance(){
        return INSTANCE;
    }
}

class test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingle e1 = EnumSingle.INSTANCE;

        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        EnumSingle e2 = declaredConstructor.newInstance();

        System.out.println(e1);
        System.out.println(e2);


    }
}