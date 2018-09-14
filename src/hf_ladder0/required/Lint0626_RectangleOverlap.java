//https://leetcode.com/problems/rectangle-overlap/description/

//lint 626


import commonds.Point;
public class Lc0836_RectangleOverlap {
    /**
     * @param l1: top-left coordinate of first rectangle
     * @param r1: bottom-right coordinate of first rectangle
     * @param l2: top-left coordinate of second rectangle
     * @param r2: bottom-right coordinate of second rectangle
     * @return: true if they are overlap or false
     */
    public boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        // write your code here
        return ! (l2.x > r1.x || r2.x < l1.x || r2.y > l1.y || l2.y < r1.y);
    }
}
