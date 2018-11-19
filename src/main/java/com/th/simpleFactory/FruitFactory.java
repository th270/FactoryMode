package com.th.simpleFactory;

import com.th.api.Fruit;
import com.th.pojo.Apple;
import com.th.pojo.Banana;

/**
 * Created by Administrator on 2018/11/19.   简单工厂模式
 */
public class FruitFactory {

   /**
    * 获得apple 类实例
    */
   public static Fruit getApple(){
       return new Apple();
   }


    /**
     * 获得Banana 类实例
     */
    public static Fruit getBanana(){
        return new Banana();
    }

    /**
     * get方法，获得所有产品对象
     */
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        
        /*if ( type.equalsIgnoreCase("apple") ) {
            return Apple.class.newInstance();
        }else if(type.equalsIgnoreCase("banana")){
            return Banana.class.newInstance();
        }else{
            System.out.println("Name is error！");
            return  null;
        }*/


        Class fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();

    }
}
