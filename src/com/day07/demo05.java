package com.day07;

public class demo05 {
    //学校选举学生会主席，有5个候选人全校1000名同学参与投票(每人一票，可以弃权，或者选1-5号)。
    //投票使用Random模拟。0:弃权，1~5:给对应的候选人投票
    //要求1:统计每个候选人的得票数和得票率，找出得票最多的候选人?
    //要求2:统计弃票数和弃票率是多少?
    static void main() {
        //创建一个长度为6的数组，用于保存每个候选人的得票数，弃票投个0号，剩下候选人投票的数字为1-5
        int[] arr = new int[6];
        vote(arr);
        System.out.println("投票结果：");
        for (int i = 1; i < arr.length; i++) {
            System.out.println("第" + i + "个候选人的得票数：" + arr[i]);
        }
        //创建一个数组，保存每个候选人的得票率，弃票率，弃票数
        count( arr);
    }
    //投票方法
    public static void vote(int[] arr) {
        //生成随机数0-5，模拟投票
        for (int i = 0; i < 1000; i++){
            int voteNum = (int)(Math.random() * 6);
            arr[voteNum]++;
        }
    }
    //统计每个候选人的得票率，弃票数和弃票率
    public static void count(int[] arr) {
        int total = 0;
        for (int i = 1; i < arr.length; i++) {
            total += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            double rate = (double) arr[i] / total;
            System.out.println("第" + i + "个候选人的得票率：" + String.format("%.2f", rate));
        }
        int noVote = 1000 - total;
        System.out.println("弃票数：" + noVote);
        System.out.println("弃票率：" + String.format("%.2f", (double) noVote / 1000));
        System.out.println("投票总数：" + total);
    }
}
