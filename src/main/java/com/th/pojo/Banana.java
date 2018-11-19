package com.th.pojo;

import com.th.api.Fruit;

/**
 * Created by Administrator on 2018/11/13.
 */
public class Banana implements Fruit{

    public Banana() {
    }

    /**
     * 采集
     */
    @Override
    public void get(){
        System.out.println("采集香蕉");
    }
}
