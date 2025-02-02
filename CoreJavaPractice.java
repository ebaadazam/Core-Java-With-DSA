
//--------dependencies--------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// string questions
// ransome note
// valid anagram
class CoreJavaPractice {
    public static String sample(String s, int k) {
        // ------------start-------------
        char[] ch = s.toCharArray();
        int n = ch.length;
        int i = 0;
        int j = k;
        while(k > 0) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
            k--;
        }
        return s;
        // ------------end--------------
    }

    public static void main(String[] args) {

        // -------------start------------
        String s = "abcdefg";
        int k = 2;
        System.out.println(sample(s, k));
        // -------------end--------------

    }
}