package main.math;

/**
 * @author ：ZiHao Zhang
 * @date ：2021/6/17 11:48
 * 剑指offer-44
 */

public class SolutionFortyFour {
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = start * digit * 9;
        }
        long target = start + (n - 1) / digit;
        char temp = Long.toString(target).charAt((n - 1) % digit);
        return temp - '0';
    }
}
