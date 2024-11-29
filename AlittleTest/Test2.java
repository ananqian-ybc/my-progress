package com.anqian.AlittleTest;


public class Test2 {
    public static int pricePerBeer = 2; // 每瓶啤酒的价格
    public static int capsNeededForExchange = 4; // 需要4个盖子换1瓶啤酒
    public static int bottlesNeededForExchange = 2; // 需要2个空瓶换1瓶啤酒

    public static int beers = 0;

    public static void main(String[] args) {// 可用金额
        int totalBeers = calculateTotalBeers(10, 0, 0);
        System.out.println("总共可以喝 " +totalBeers + " 瓶啤酒。");

    }

    private static int calculateTotalBeers(int money, int caps, int bottles) {
        caps += money / pricePerBeer; // 每瓶啤酒有一个盖子
        bottles += money / pricePerBeer; // 每瓶啤酒有一个空瓶
        beers+=money / pricePerBeer;// 直接购买的啤酒数量

        int exchangedBeers = 0;

        // 根据空瓶换啤酒
        if (bottles >= bottlesNeededForExchange) {
            int exchanged = bottles / bottlesNeededForExchange;
            exchangedBeers += exchanged;
            bottles = bottles % bottlesNeededForExchange + exchangedBeers; // 剩余的空瓶
            caps+=exchangedBeers;// 每瓶啤酒有一个盖子
        }
        // 根据盖子换啤酒
        if (caps >= capsNeededForExchange) {
            int exchanged = caps / capsNeededForExchange;
            exchangedBeers += exchanged;
            caps = caps % capsNeededForExchange + exchanged; // 剩余的盖子
            bottles+=exchanged;// 每瓶啤酒有一个空瓶
        }
        int sybottles=bottles;
        int sycaps=caps;
        beers+=exchangedBeers;

        // 如果有额外的啤酒可以通过交换得到，继续递归
        if (exchangedBeers > 0) {
            return calculateTotalBeers(0,sycaps,sybottles);
        }

        return beers; // 没有更多的啤酒可以交换时返回当前数量
    }
}



