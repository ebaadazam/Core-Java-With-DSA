//--------dependencies--------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class CoreJavaPractice {
    public static int sample(int[] nums) {

        // ------------start-------------
        int n = 0;
        for (int i : nums) {
            n = n * 10 + i;
        }
        int n2 = n+1;
        return n2;
        // ------------end--------------

    }

    public static void main(String[] args) {

        // -------------start------------
        int[] nums = {1, 2, 3};
        System.out.println(sample(nums));
        // -------------end--------------

    }
}
