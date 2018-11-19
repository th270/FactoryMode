package com.th.pojo;

import com.th.api.Fruit;

/**
 * Created by Administrator on 2018/11/19.
 */
public class Pear implements Fruit{
    public Pear() {

    }

    @Override
    public void get(){
        System.out.println("采集梨子");
    }
}
