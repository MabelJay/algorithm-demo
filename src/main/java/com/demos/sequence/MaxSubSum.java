package com.demos.sequence;

public class MaxSubSum {
    public static void main(String[] args) {
        int[] seq = {-2, 11, -4, 13, -5, -2};
        System.out.println("max seq sum is: " + maxSubSum4(seq));
    }

    // 第一种：穷举法得到最大子序列和,运行时间为O(n*n*n)
    public static int maxSubSum1(int[] seq) {
        int maxSum = 0;
        int seqLen = seq.length;
        int startIndex = 0, endIndex = 0;
        for (int i = 0; i < seqLen; i++) {
            for (int j = i; j < seqLen; j++) {
                int thisSum = 0;
                int k;
                for (k = i; k <= j; k++) {
                    thisSum += seq[k];
                }

                if (thisSum > maxSum) {
                    maxSum = thisSum;
                    startIndex = i;
                    endIndex = k;
                }
            }
        }
        if (endIndex > startIndex) {
            System.out.println("max sub seq is:");
            for (int t = startIndex; t < endIndex; t++) {
                System.out.print(seq[t] + " ");
            }
        }
        System.out.println();
        return maxSum;
    }

    // 第二种：计算最大子序列和
    public static int maxSubSum2(int[] seq) {
        int maxSum = 0;
        int len = seq.length;

        for (int i = 0; i < len; i++) {
            int thisSum = 0;
            for (int j = i; j < len; j++) {
                thisSum += seq[j];

                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    // 第三种：采用分治的思想，递归地求部分数组的子序列最大和
    public static int maxSubSum3(int[] seq) {
        return maxSumRec(seq, 0, seq.length - 1);
    }

    public static int maxSumRec(int[] a, int left, int right) {
        if (left == right) {
            if (a[left] > 0) {
                return a[left];
            } else {
                return 0;
            }
        }

        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center + 1, right);

        int maxLeftBoarderSum = 0, leftBoardSum = 0;
        for (int i = center; i >= left; i--) {
            leftBoardSum += a[i];

            if (leftBoardSum > maxLeftBoarderSum) {
                maxLeftBoarderSum = leftBoardSum;
            }
        }

        int maxRightBoarderSum = 0, rightBoardSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBoardSum += a[i];
            if (rightBoardSum > maxRightBoarderSum) {
                maxRightBoarderSum = rightBoardSum;
            }
        }
        return max3Num(maxLeftSum, maxRightSum, maxLeftBoarderSum + maxRightBoarderSum);
    }

    private static int max3Num(int num1, int num2, int num3) {
        int maxNum = num1;
        if (num2 > maxNum) maxNum = num2;
        if (num3 > maxNum) maxNum = num3;
        return maxNum;
    }

    // 第四种
    public static int maxSubSum4(int[] seq) {
        int maxSum = 0, thisSum = 0;

        for (int i = 0; i < seq.length; i++) {
            thisSum += seq[i];

            if (thisSum > maxSum) {
                maxSum = thisSum;
            }
            else if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }
}
