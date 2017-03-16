package codewars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BestTravel {

    private static Integer chooseBestSum(int t, int k, List<Integer> ls){
        int a = 0;
        int b = 0;
            for (int j = 1; j <= k; j++) {
                if (a != t) {

                    a += ls.get(j);
                    if (j == k) break;
                }else{
                    break;
                }
        }
        return a;
    }
    public static void main(String[] args) {
        List<Integer> ts =
                new ArrayList<>
                        (Arrays.asList(50, 55, 56, 57, 58));
                        // distances between cities

        int t = 163;    // max distance for available
        int k = 3;      // amount of cities to visit


        Integer it = chooseBestSum(t, 3, ts );

        System.out.println(it);
    }
}
