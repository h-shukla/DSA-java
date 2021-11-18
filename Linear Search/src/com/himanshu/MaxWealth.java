package com.himanshu;

public class MaxWealth {
    public static void main(String[] args) {
        int a[][] = {{1,2,3}, {3,2,1}};
        int res = maximumWealth(a);
        System.out.println(res);
    }

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+=accounts[person][account];
            }
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }
}
