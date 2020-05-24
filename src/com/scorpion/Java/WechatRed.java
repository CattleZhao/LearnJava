package com.scorpion.Java;


import java.util.ArrayList;
import java.util.List;

/**
 * 模拟微信红包生成，以分为单位
 */
public class WechatRed {
    /**
     * 红包最小值1分
     */
    private static final int MIN_MONEY = 1;

    /**
     * 红包最大值200元
     */
    private static final int MAX_MONEY = 200 * 100;

    /**
     * 小于最小值
     */
    private static final int LESS = -1;
    /**
     * 大于最大值
     */
    private static final int MORE = -2;
    /**
     * 正常金额
     */
    private static final int OK = 1;

    /**
     * 最大红包是平均值的TIMES倍，防止某一次分配红包较大
     */
    private static final double TIMES = 2.1f;

    private int recursiveCount = 0;

    public List<Integer> splitRedPacket(int money, int count) {
        List<Integer> moneys = new ArrayList<>();

        //金额检查，如果最大的红包*个数<总金额，则需要调大最大红包MAX_MONEY
        if (MAX_MONEY * count <= money) {
            System.err.println("请调大最小红包金额 MAX_MONEY=[" + MAX_MONEY + "]");
            return moneys;
        }

        //计算出最大红包金额
        int max = (int) ((money / count) * TIMES);
        max = max > MAX_MONEY ? MAX_MONEY : max;
        return moneys;
    }

    public static void main(String[] args) {

    }

}
