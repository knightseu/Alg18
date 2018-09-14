import java.util.HashMap;
import java.util.Map;

public class Lc0454_4SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<C.length-1; i++) {
            for (int j=0; j<D.length-1; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        int rst = 0;

        for (int i=0; i<A.length-1; i++) {
            for (int j=0; j<B.length-1; j++) {
                int sum = A[i] + B[j];;
                rst += map.getOrDefault(-1 * sum, 0);
            }
        }
        return rst;
    }
}
