package com.anqian.AlittleTest;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //money的值需要用户自己输入
        Scanner scanner=new Scanner(System.in);
        int money=10;
        int pricePerBeer = 2; // 每瓶啤酒的价格
        int capsNeededForExchange = 4; // 需要4个盖子换1瓶啤酒
        int bottlesNeededForExchange = 2; // 需要2个空瓶换1瓶啤酒

        int beers = money / pricePerBeer; // 直接购买的啤酒数量
        int caps = beers; // 每瓶啤酒有一个盖子
        int bottles = beers; // 每瓶啤酒有一个空瓶

        int allexchanged=bottles/bottlesNeededForExchange+caps/capsNeededForExchange;
        // 循环计算换取的啤酒数量
        while (caps >= capsNeededForExchange || bottles >= bottlesNeededForExchange) {
            // 根据空瓶换啤酒
            if (bottles >= bottlesNeededForExchange && caps < capsNeededForExchange) {
                beers += allexchanged;
                bottles = bottles % bottlesNeededForExchange +allexchanged;
                caps+=allexchanged;// 剩余的空瓶
                allexchanged=bottles/bottlesNeededForExchange+caps/capsNeededForExchange;
            }

            // 根据盖子换啤酒
            if (caps >= capsNeededForExchange && bottles < bottlesNeededForExchange) {
                beers += allexchanged;
                caps = caps % capsNeededForExchange + allexchanged; // 剩余的盖子
                allexchanged=caps/capsNeededForExchange;
                bottles+=allexchanged;// 剩余的空瓶
                allexchanged=bottles/bottlesNeededForExchange+caps/capsNeededForExchange;
            }

            if (bottles >= bottlesNeededForExchange && caps >= capsNeededForExchange) {
                beers += allexchanged;
                bottles = bottles % bottlesNeededForExchange+allexchanged;// 剩余的空瓶
                caps = caps % capsNeededForExchange + allexchanged; // 剩余的盖子
                allexchanged=bottles/bottlesNeededForExchange+caps/capsNeededForExchange;

            }
        }
        System.out.println("总共可以喝 " + beers + " 瓶啤酒。");
        System.out.println("剩余" + bottles + "空瓶," + "剩余" + caps + "盖子");
    }
}

