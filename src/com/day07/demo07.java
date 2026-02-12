package com.day07;

import java.util.ArrayDeque;
import java.util.Deque;

public class demo07 {
    static void main() {
        //接雨水
        //给定n个非负整数表示每个宽度为1的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水
        //输入: height= [0,1,0,2,1,0,1,3,2,1,2,1]
        //输出:6
        int[] height = {0,1,0,3,1,0,1,3,2,1,2,1};
        System.out.println(trap1(height));
        System.out.println(trap2(height));
        System.out.println(trap3(height));
    }
    public static int trap1(int[] height) {
        int n = height.length;
        if (n <= 2) return 0; // 少于3根柱子接不了水

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // 计算左侧最大高度
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // 计算右侧最大高度
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // 累加雨水量
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return res;
    }
    public static int trap2(int[] height) {
        int n = height.length;
        if (n <= 2) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    res += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    res += rightMax - height[right];
                }
                right--;
            }
        }
        return res;
    }
    public static int trap3(int[] height) {
        int n = height.length;
        if (n <= 2) return 0;

        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop(); // 凹槽底部
                if (stack.isEmpty()) break;
                int distance = i - stack.peek() - 1; // 凹槽宽度
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top]; // 凹槽高度
                res += distance * boundedHeight;
            }
            stack.push(i);
        }
        return res;
    }
}
