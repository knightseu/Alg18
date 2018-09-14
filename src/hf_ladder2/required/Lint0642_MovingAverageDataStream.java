
// lint 642 https://www.lintcode.com/problem/moving-average-from-data-stream/description?_from=ladder

/*
642. Moving Average from Data Stream
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example
MovingAverage m = new MovingAverage(3);
m.next(1) = 1 // return 1.00000
m.next(10) = (1 + 10) / 2 // return 5.50000
m.next(3) = (1 + 10 + 3) / 3 // return 4.66667
m.next(5) = (10 + 3 + 5) / 3 // return 6.00000

 */


import java.util.LinkedList;
import java.util.Queue;

public class Lc0346_MovingAverageDataStream {
    private Queue<Integer> que;
    private int size;
    private int sum = 0;
    /*
     * @param size: An integer
     */
    public Lc0346_MovingAverageDataStream(int size) {
        // do intialization if necessary
        que = new LinkedList<>();
        this.size = size;
    }

    /*
     * @param val: An integer
     * @return:
     */
    public double next(int val) {
        // write your code here
        sum += val;
        if (que.size() == size) {
            sum -=que.poll();
        }
        que.offer(val);

        return sum * 1.0 / size;

    }
}
