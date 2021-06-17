package main.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：ZiHao Zhang
 * @date ：2021/6/17 15:53
 * 剑指offer-59
 */
public class SolutionFiftyNine {
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> dequeue = new LinkedList<>();
    public SolutionFiftyNine() {

    }

    public int maxValue() {
        if (!dequeue.isEmpty()) {
            return dequeue.peekFirst();
        }
        return -1;
    }

    public void pushBack(int value) {
        queue.offer(value);
        while (!dequeue.isEmpty() && dequeue.peekLast() < value) {
            dequeue.pollLast();
        }
        dequeue.offerLast(value);
    }

    public int popFront() {
        if (!queue.isEmpty()) {
            int target = queue.peek();

            if (target == dequeue.peekFirst()) {
                dequeue.pollFirst();
            }
            return queue.poll();
        }
        return -1;
    }
}
