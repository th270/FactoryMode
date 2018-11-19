package com.th.simpleFactory;

import com.th.api.Fruit;
import com.th.pojo.Apple;
import com.th.pojo.Banana;

/**
 * Created by Administrator on 2018/11/13.
 */
public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        //test1();
        //test2();

        //fruitFactoryTest3();

        Fruit apple = FruitFactory.getFruit("com.th.pojo.Apple");
        Fruit banana = FruitFactory.getFruit("com.th.pojo.Banana");
        apple.get();
        banana.get();
    }

    private static void fruitFactoryTest3() {
        Fruit apple = FruitFactory.getApple();

        Fruit banana = FruitFactory.getBanana();

        apple.get();
        banana.get();
    }

    private static void test2() {

        //使用到了多态
        //实例化一个Apple
        Fruit apple = new Apple();

        //实例化一个Banana
        Fruit banana = new Banana();

        apple.get();
        banana.get();
    }

    private static void test1() {
        System.out.println("hello SimpleFactory!");

        //实例化一个Apple
        Apple apple = new Apple();

        //实例化一个Banana
        Banana banana = new Banana();

        apple.get();
        banana.get();
    }


}
